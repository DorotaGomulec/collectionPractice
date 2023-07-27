
import java.util.*;

public class Team {
    ArrayList<Player> playerArrayList = new ArrayList<>();
    ArrayList<Staff> staffArrayList = new ArrayList<>();
    HashMap<String, Staff> stringStaffHashMap = new HashMap<>();
    Set<PlayerPosition> playerPositions = new HashSet<>();
    ArrayList<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner( System.in );
    private String name;
    private int age;
    private PlayerPosition playerPosition;
    private int height;
    private StaffRole staffRole;

    private void addEmployee() {
        System.out.println( "Write name" );
        name = scanner.nextLine();

        while (true) {
            try {
                System.out.println( "Write age" );
                age = scanner.nextInt();
                Employee employee = new Employee( name, age );
                break;
            } catch (InputMismatchException e) {
                System.out.println( "Parameter 'age' must be written as the whole number (e.g. 12 or 20)" );
                scanner.nextLine();
            }
        }
    }

    public void addPlayer() {
        addEmployee();

        while (true) {
            try {
                System.out.println( "Choose player's field position (from 1 to 5)" );
                System.out.println( "1. SETTER\n2. OPPOSITE\n3. MIDDLE_BLOCKER\n4. OUTSIDE_HITTER\n5. LIBERO" );
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1 -> playerPosition = PlayerPosition.SETTER;
                    case 2 -> playerPosition = PlayerPosition.OPPOSITE;
                    case 3 -> playerPosition = PlayerPosition.MIDDLE_BLOCKER;
                    case 4 -> playerPosition = PlayerPosition.OUTSIDE_HITTER;
                    case 5 -> playerPosition = PlayerPosition.LIBERO;
                }
                if (userChoice < 1 | userChoice > 5) {
                    throw new OutOfRangeException();
                }
                break;
            } catch (Exception e) {
                System.out.println( "The entered value must be in the numerical range from 1 to 5" );
                scanner.nextLine();
            }
        }

        while (true) {
            try {
                System.out.println( "How tall is player?" );
                height = scanner.nextInt();
                scanner.nextLine(); //take out enter from previous scanner.nextInt
                break;
            } catch (Exception e) {
                System.out.println( "Parameter 'height' must be write as the whole number (e.g. 165 or 180)" );
                scanner.nextLine();
            }
        }
        Player player = new Player( name, age, playerPosition, height );
        playerArrayList.add( player );
        playerPositions.add( playerPosition );
        employeeList.add( player );
    }

    public void addStaff() {
        addEmployee();

        while (true) {
            try {
                System.out.println( "What is his/her role in team? Choose from 1 to 4." );
                System.out.println( "1. COACH\n2. ASSISTANT\n3. PHYSIOTHERAPIST\n4. SCOUT\n" );
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1 -> staffRole = StaffRole.COACH;
                    case 2 -> staffRole = StaffRole.ASSISTANT;
                    case 3 -> staffRole = StaffRole.PHYSIOTHERAPIST;
                    case 4 -> staffRole = StaffRole.SCOUT;
                    default -> throw new OutOfRangeException();
                }
                scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println( "The entered value must be in the numerical range from 1 to 5" );
                scanner.nextLine();
            }
        }
        Staff staff = new Staff( name, age, staffRole );
        staffArrayList.add( staff );
        employeeList.add( staff );
        stringStaffHashMap.put( staff.getName(), staff );
    }


    public void staffByName() {
        System.out.println( "Write name to get more info" );
        String staffToFind = scanner.nextLine();
        if (!stringStaffHashMap.containsKey( staffToFind )) {
            System.out.println( "There isn't person with that name in the database" );
        } else {
            System.out.println( stringStaffHashMap.get( staffToFind ) );
        }
    }

    public void showAllEmployee() {
        for (Employee e : employeeList) {
            System.out.println( e.getName() );
        }
    }

    public void countEmployee() {
        System.out.println( employeeList.size() );
    }

    public void displayEmpByName() {
        Collections.sort( employeeList );
        for (Employee employee : employeeList) {
            System.out.println( employee.getName() );
        }
    }

    public void displayPlByHeight() {
        HeightCompare heightCompare = new HeightCompare();
        Collections.sort( playerArrayList, heightCompare );
        for (Player player : playerArrayList) {
            System.out.println( "Name: " + player.getName() + ", height: " + player.getHeight() );
        }
    }
}

class OutOfRangeException extends Exception {

}




import java.util.*;

public class Team {
    ArrayList<Player> playerArrayList = new ArrayList<>();
    ArrayList<Staff> staffArrayList = new ArrayList<>();
    HashMap<String,Staff> stringStaffHashMap = new HashMap<>();
    Set<PlayerPosition> playerPositions = new HashSet<>();

    Scanner scanner = new Scanner( System.in );
    private String name;
    private int age;

    private void addEmployee() {
        System.out.println( "Write name" );
        name = scanner.nextLine();

        System.out.println( "Write age" );
        age = scanner.nextInt();

        Employee employee = new Employee( name, age );
    }

    public void addPlayer() {
        addEmployee();

        System.out.println( "Choose player's field position (from 1 to 5)" );
        System.out.println( "1. SETTER\n2. OPPOSITE\n3. MIDDLE_BLOCKER\n4. OUTSIDE_HITTER\n5. LIBERO" );
        int userChoice = scanner.nextInt();
        PlayerPosition playerPosition;
        switch (userChoice) {
            case 1 -> playerPosition = PlayerPosition.SETTER;
            case 2 -> playerPosition = PlayerPosition.OPPOSITE;
            case 3 -> playerPosition = PlayerPosition.MIDDLE_BLOCKER;
            case 4 -> playerPosition = PlayerPosition.OUTSIDE_HITTER;
            case 5 -> playerPosition = PlayerPosition.LIBERO;
            default -> throw new IllegalStateException( "Unexpected value: " + userChoice );
        }

        System.out.println( "How tall is player?" );
        int height = scanner.nextInt();
        scanner.nextLine(); //take out enter from previous scanner.nextInt

        Player player = new Player( name, age, playerPosition, height );
        playerArrayList.add( player );
        playerPositions.add( playerPosition );
    }

    public void addStaff() {
        addEmployee();

        System.out.println( "What is his/her role in team? Choose from 1 to 4." );
        System.out.println( "1. COACH\n2. ASSISTANT\n3 .PHYSIOTHERAPIST\n4. SCOUT\n" );
        int userChoice = scanner.nextInt();
        StaffRole staffRole = null;
        switch (userChoice) {
            case 1 -> staffRole = StaffRole.COACH;
            case 2 -> staffRole = StaffRole.ASSISTANT;
            case 3 -> staffRole = StaffRole.PHYSIOTHERAPIST;
            case 4 -> staffRole = StaffRole.SCOUT;
        }
        scanner.nextLine();

        Staff staff = new Staff( name, age, staffRole );
        staffArrayList.add( staff );

        stringStaffHashMap.put( staff.getName(), staff );
    }

    public void staffByName() {
        System.out.println("Write name to get more info");
        String staffToFind = scanner.nextLine();
        System.out.println(stringStaffHashMap.get( staffToFind ));
    }
}


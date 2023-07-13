import java.util.Collections;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner( System.in );
    Team team = new Team();

    private void showMenu() {
        System.out.println( "CHOOSE OPTION FROM 1 TO 11" );
        System.out.println( "1. Add Player" );
        System.out.println( "2. Add Staff Person" );
        System.out.println( "3. Show names of all Employee" );
        System.out.println( "4. Show players" );
        System.out.println( "5. Show staff" );
        System.out.println( "6. Sort Player by height" );
        System.out.println( "7. Sort Employee by name" );
        System.out.println( "8. Find Staff by name" );
        System.out.println( "9. Find occupied field position in your team " );
        System.out.println( "10. Count players and staff" );
        System.out.println( "11. That's all for today" );
    }

    int userChoice;

    public void starter() {
        while (userChoice != 11) {

            showMenu();

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> team.addPlayer();
                case 2 -> team.addStaff();
                case 3 -> team.showAllEmployee();
                case 4 -> System.out.println( team.playerArrayList.toString() );
                case 5 -> System.out.println( team.staffArrayList.toString() );
                case 6 -> team.displayPlByHeight();
                case 7 -> team.displayEmpByName();
                case 8 -> team.staffByName();
                case 9 -> System.out.println( team.playerPositions );
                case 10 -> team.countEmployee();
                case 11 -> {
                    System.out.println( "THANK YOU" );
                    System.exit( 1 );
                }
            }
        }
    }
}
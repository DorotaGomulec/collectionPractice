import java.util.Scanner;

public class Menu {
    int userChoice;
    Scanner scanner = new Scanner( System.in );
    private void showMenu() {
        System.out.println( "CHOOSE OPTION FROM 1 TO 11" );
        System.out.println( "1. Add Player" );
        System.out.println( "2. Add Staff Employee" );
        System.out.println( "3. Show all Employee" );
        System.out.println( "4. Show players" );
        System.out.println( "5. Show staff" );
        System.out.println( "6. Sort Player by Heigh" );
        System.out.println( "7. Sort Staff by name" );
        System.out.println( "8. Find Employee by name" );
        System.out.println( "9. Find Player by field position" );
        System.out.println( "10. Count players and staff" );
        System.out.println( "11. That's all for today" );
    }

    public void starter() {



        while (userChoice != 11) {
            showMenu();

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> System.out.println( 1 );
                case 2 -> System.out.println( 2 );
                case 3 -> System.out.println( 3 );
                case 4 -> System.out.println( 4 );
                case 5 -> System.out.println( 5 );
                case 6 -> System.out.println( 6 );
                case 7 -> System.out.println( 7 );
                case 8 -> System.out.println( 8 );
                case 9 -> System.out.println( 9 );
                case 10 -> System.out.println( 10 );
                case 11 -> {System.exit( 1);}
            }
        }
    }
}
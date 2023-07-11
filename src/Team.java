import java.util.ArrayList;
import java.util.Scanner;

public class Team {
    ArrayList<Player> playerArrayList = new ArrayList<>();
    Scanner scanner = new Scanner( System.in );
    Player player = new Player();

    public void addPlayer() {

        System.out.println( "Write player name" );
        String name = scanner.nextLine();

        System.out.println( "Write player age" );
        int age = scanner.nextInt();

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


    }
}

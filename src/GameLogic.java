import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameLogic {
    public static String[] colorList = {"Красный", "Синий"};
    public static List<Player> playerList = new ArrayList<Player>();
    private static Player currentPlayer;

    public static void runGame(){

        System.out.println("Выберите количество игроков 2-4.");

        boolean inputCorrect = false;
        Scanner scanner = null;

        while(!inputCorrect) {

            scanner = new Scanner(System.in);
            int number = 0;
            try {
                number = scanner.nextInt();
            } catch(Exception e) {
            }

            if(number>1 && number<5) {

                inputCorrect = true;

                for(int i=0; i<number; i++)
                    playerList.add(new Player(colorList[i]));

            } else {

                System.out.println("Вы указали не то число, введите 2-4.");

            }

        }


        for(int i=0; i<playerList.size(); i++)
            System.out.println(playerList.get(i) + " присоединился к игре.");


        System.out.println("Игроки должны бросить кости, чтобы " +
                "определить, кто пойдет первым. Чтобы бросить кости, "
                + "введите \"r\".");
        boolean initComplete = false;
        int playerCounter = 0;

        while(!initComplete) {

            Player currentPlayer = playerList.get(playerCounter);
            System.out.println("Очередь" + currentPlayer);

            scanner = new Scanner(System.in);
            String input = "";

            try {
                input = scanner.next();
            } catch(Exception e) {
            }

            if(input.equals("r")) {

                currentPlayer.rollDice();
                System.out.println(currentPlayer + " получает " + currentPlayer.getNumberRolled());

            } else {

                System.out.println("Что-то пошло не так. Введите \"r\".");
                continue;

            }

            if(++playerCounter==playerList.size())
                initComplete = true;

        }

        for(int i=0; i<playerList.size(); i++)
            System.out.println(playerList.get(i) + " получает " + playerList.get(i).getNumberRolled());

        List<Player> highestRollers = determineHighestRoller(playerList);


        boolean onlyOneHighest = highestRollers.size()==1;

        while(!onlyOneHighest) {

            String playerNames = "";

            for(int i=0; i<highestRollers.size(); i++)
                playerNames += highestRollers.get(i) + ", ";

            System.out.println("Есть несколько самых больших выпавших костей. Игроки " +
                    playerNames + " кидают кости снова. Запомните, чтобы " +
                    " кинуть кости, type in \"r\"");

            boolean rollsComplete = false;
            int rollerCounter = 0;

            while(!rollsComplete) {

                Player currentPlayer = highestRollers.get(rollerCounter);
                System.out.println(currentPlayer + "'s turn.");

                scanner = new Scanner(System.in);
                String input = "";

                try {
                    input = scanner.next();
                } catch(Exception e) {
                }

                if(input.equals("r")) {

                    currentPlayer.rollDice();
                    System.out.println(currentPlayer + " выпало " + currentPlayer.getNumberRolled());

                } else {

                    System.out.println("Что-то пошло не так. Введите \"r\".");
                    continue;

                }

                if(++rollerCounter==highestRollers.size())
                    rollsComplete = true;

            }

            for(int i=0; i<highestRollers.size(); i++)
                System.out.println(highestRollers.get(i) + " выпало " + highestRollers.get(i).getNumberRolled());

            highestRollers = determineHighestRoller(highestRollers);

            onlyOneHighest = highestRollers.size()==1;

        }

        currentPlayer = highestRollers.get(0);

        System.out.println(currentPlayer + " первым начинает игру.");

        for(int i=0; i<playerList.size(); i++)
            AllBoard.initializePieces(playerList.get(i));
    }

    private static List<Player> determineHighestRoller(List<Player> playerList) {
        return playerList;
    }

    private static void setNextPlayer() {

        int nextIndex = playerList.indexOf(currentPlayer) + 1;

        if(nextIndex==playerList.size())
            nextIndex = 0;

        currentPlayer = playerList.get(nextIndex);


    }
}

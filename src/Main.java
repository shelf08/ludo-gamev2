
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(52);

        for (int i = 0; i < 52; i++) {
            list.add(i);
        }

        System.out.println();
        System.out.println("Игровое поле:" + Arrays.toString(list.toArray()));


//        BoardRed.redWay();
//        BoardBlue.blueWay();

        GameLogic.runGame();

    }

}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AllBoard<Integer> list = new AllBoard<>();

        for (int i = 0; i < 52; i++) {
            list.add(i);
        }
        System.out.println();
        System.out.println("Игровое поле:" + Arrays.toString(list.toArray()));
        
        GameLogic.runGame();

    }

}
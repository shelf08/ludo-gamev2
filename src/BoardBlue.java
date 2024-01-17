import java.util.ArrayList;
import java.util.Arrays;

public class BoardBlue<T> extends AllBoard<T> {

    public static void blueWay() {

        ArrayList<Integer> list = new ArrayList<>(51);

        for (int i = 0; i < 51; i++) {
            list.add(i);

            if (i == 50) {
                ArrayList<Integer> boardBlue = new ArrayList<>(6);
                for (int j = 1; j < 7; j++) {
                    boardBlue.add(j);
                }

                System.out.println(Arrays.toString(boardBlue.toArray()));
            }
        }
    }
}

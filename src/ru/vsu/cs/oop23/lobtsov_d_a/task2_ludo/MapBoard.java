package ru.vsu.cs.oop23.lobtsov_d_a.task2_ludo;

import java.util.HashMap;
import java.util.Map;

public class MapBoard {

    private Cell first;

    private Map<String, Cell> start = new HashMap<>();


    private void init() {
        Map<String, Cell> start = new HashMap<>();
        Cell current = first = new Cell();
        for (int i = 1; i < 68; i++) {
            Cell next = new Cell();
            current.setNextCell(next);
            current = next;
        }
        current.setNextCell(first);
        get(5).setSecurity(true);
        get(12).setSecurity(true);
        get(17).setSecurity(true);
        get(12).setSecurity(true);
        get(22).setSecurity(true);
        get(29).setSecurity(true);
        get(34).setSecurity(true);
        get(39).setSecurity(true);
        get(46).setSecurity(true);
        get(51).setSecurity(true);
        get(56).setSecurity(true);
        get(63).setSecurity(true);
        get(68).setSecurity(true);

        Cell yHome = new Cell();
        yHome.setNextCell(get(5));
        start.put("Yellow", yHome);
        Cell bHome = new Cell();
        yHome.setNextCell(get(22));
        start.put("Blue", bHome);
        Cell rHome = new Cell();
        yHome.setNextCell(get(39));
        start.put("Red", rHome);
        Cell gHome = new Cell();
        yHome.setNextCell(get(56));
        start.put("Green", gHome);

        get(17).setAlternativeCell(createToHomeList(), "Blue");
        get(34).setAlternativeCell(createToHomeList(), "Red");
        get(51).setAlternativeCell(createToHomeList(), "Green");
        get(68).setAlternativeCell(createToHomeList(), "Yellow");

    }
    private Cell createToHomeList() {
        Cell ans;
        Cell cur = ans = new Cell();
        for (int i = 1; i < 8; i++) {
            Cell next = new Cell();
            cur.setNextCell(next);
            cur = next;
        }
        return ans;
    }

    private Cell get(int n) {
        Cell cur = first;
        for (int i = 0; i < n; i++) {
            cur = cur.getNextCell();
        }
        return cur;
    }
}

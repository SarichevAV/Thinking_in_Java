package Глава_11.упражнение_3;

import java.util.ArrayList;

/**
 * Created by andrej on 31.01.17.
 */

public class Sequence {

    private ArrayList<Object> items = new ArrayList<Object>();

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 10; i++) {
            sequence.items.add(i);
        }
        for (Object o :
                sequence.items) {
            System.out.print(o + " ");
        }
    }
}

package Глава_11.упражнение_12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by andrej on 31.01.17.
 */
public class Solution {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<Integer>();
        list1.add(new Integer(2));
        list1.add(new Integer(4));
        list1.add(new Integer(6));

        List<Integer> list2 = new ArrayList<>();
        list2.add(new Integer(1));
        list2.add(new Integer(3));
        list2.add(new Integer(5));

        ListIterator<Integer> listIterator = list1.listIterator(list1.size());

        while (listIterator.hasPrevious()){
            list2.add(listIterator.previous());
        }

        System.out.println(list2 );
    }
}

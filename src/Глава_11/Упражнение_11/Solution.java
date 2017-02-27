package Глава_11.Упражнение_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


/**
 * Created by andrej on 31.01.17.
 */
public class Solution {

    static void method(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println( iterator.next().toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList();
        arrayList.add(new Integer(1));
        arrayList.add(new Integer(2));
        LinkedList<Object> linkedList = new LinkedList<>(arrayList);

        method(arrayList.iterator());
        System.out.println();
        method(linkedList.iterator());

    }
}

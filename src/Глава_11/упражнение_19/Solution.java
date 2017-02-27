package Глава_11.упражнение_19;

import java.util.*;

/**
 * Created by andrej on 01.02.17.
 */
public class Solution {


    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Первый");
        hashSet.add("Второй");
        hashSet.add("Третий");

        System.out.println(hashSet);

        Set<String> treeSet = new TreeSet<>(hashSet);

        System.out.println(treeSet);

        Iterator<String> iterator = treeSet.iterator();

        Set<String> linkedHashSet = new LinkedHashSet<>();

        while (iterator.hasNext()){
            String value = iterator.next();
            System.out.print(value);
            linkedHashSet.add(value);
        }
        System.out.println();
        System.out.println(linkedHashSet);





    }
}

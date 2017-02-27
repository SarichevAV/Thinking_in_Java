package Глава_11.упражнение_18;

import java.util.*;

/**
 * Created by andrej on 01.02.17.
 */
public class Solution {


    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Первый",1);
        hashMap.put("Второй",2);
        hashMap.put("Третий",3);

        System.out.println(hashMap);

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);

        System.out.println(treeMap);

        Iterator<String> iterator = treeMap.keySet().iterator();

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        while (iterator.hasNext()){
            String key = iterator.next();
            Integer value =treeMap.get(key);
            System.out.print(key+"  "+value+" ");
            linkedHashMap.put(key,value);
        }
        System.out.println();
        System.out.println(linkedHashMap);





    }
}

package Глава_11.упражнение_23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/**
 * Created by andrej on 01.02.17.
 */
public class Statisrics {
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }

        Iterator<Integer> iterator = m.keySet().iterator();

        int index = 0;
        int count = 0;

        while (iterator.hasNext()){
            int key = iterator.next();
            if (count < m.get(key)){
                count = m.get(key);
                index = key;
            }
            System.out.println("key: "+ key +", value: "+ m.get(key));
        }
        System.out.println(index+ "  =  "+count);
    }
}

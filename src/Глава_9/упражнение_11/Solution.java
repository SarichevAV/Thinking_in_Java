package Глава_9.упражнение_11;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by andrej on 26.01.17.
 */
public class Solution extends StringProcessor {

    @Override
    public Object process(Object obj) {
        String s = (String)obj;
        String[] mass = s.split("");
        for (int i = 0; i < mass.length-1; i++) {
            String a = mass[i];
            mass[i] = mass[i + 1];
            mass[i + 1] = a;
            i++;
        }
        return Arrays.toString(mass);
    }
}

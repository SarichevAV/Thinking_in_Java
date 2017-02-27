package Глава_13.упражнение_8;

import java.util.Arrays;
import java.util.regex.*;



/**
 * Created by andrej on 07.02.17.
 */

public class Solution {
    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring! cats 2224";
    public static void split(String regex){
        System.out.println(
                Arrays.toString(knights.split(regex))
        );
    }
    public static void main(String[] args) {
        String[] list = knights.split("(the|you)");
        for (String s: list
             ) {
            System.out.print(s+" | ");
        }

    }
}

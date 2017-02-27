package Глава_13.упражнение_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andrej on 07.02.17.
 */
public class Solution {
    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void main(String[] args) {

        System.out.println(knights.replaceAll("[aeiou]", " "));

//        Pattern p = Pattern.compile("/[aeiou]/");
//        Matcher matcher = p.matcher(knights);
//        while (matcher.find()){
//            System.out.println(knights.substring(matcher.start(), matcher.end()) + ",");
//        }
    }
}

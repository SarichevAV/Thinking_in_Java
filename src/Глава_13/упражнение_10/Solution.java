package Глава_13.упражнение_10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andrej on 07.02.17.
 */
public class Solution {
    public static void main(String[] args) {
        String s = "Java now has regular exprissions";
//        Pattern p = Pattern.compile("n.w\\s+h(a|i)s"); // now has
        Pattern p = Pattern.compile("s{1,3}");
        Matcher matcher = p.matcher(s);

        while (matcher.find()){
            System.out.print(s.substring(matcher.start() , matcher.end()) + " * ");
        }

//        Pattern p2 = Pattern.compile("s?");
//        matcher = p2.matcher(s);
//
//        while (matcher.find()){
//            System.out.println(s.substring(matcher.start() , matcher.end()) + " * ");
//        }



    }
}

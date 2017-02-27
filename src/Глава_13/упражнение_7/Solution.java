package Глава_13.упражнение_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z]\\w+.");
        Matcher matcher = p.matcher("aFWdw.");
        System.out.println(matcher.matches());
    }
}

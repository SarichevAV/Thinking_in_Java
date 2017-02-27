package Глава_13.упражнение_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andrej on 14.02.17.
 */
public class StartEnd {
    static public final String POEM =
            "Twas brilling, and the slithe toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.\n" +
                    "As long as there is injustice, whenever a";
    private static class Display {
        private boolean regexPrinted = false;
        private String regex;

        Display(String regex) {
            this.regex = regex;
        }

        void display(String massage) {
            if (!regexPrinted) {
                System.out.println(regex);
                regexPrinted = true;
            }
            System.out.println(massage);
        }
    }
    static void examin(String s, String regex) {
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find())
            d.display("find() '" + m.group() +
            "' start = " + m.start() + " end = " + m.end());
        if (m.lookingAt())
            d.display("lookingAt() start = " + m.start() + " end = " + m.end());
        if (m.matches())
            d.display("matches() start = " + m.start() + " end = " + m.end());

    }

    public static void main(String[] args) {
        for (String in : POEM.split("\n")) {
            System.out.println("---------------");
            System.out.println("input: " + in);
            for (String regex :
                    new String[]{
                    "\\D*",
                    }) {
                examin(in,regex);
            }
        }
    }
}

package Глава_13.упражнение_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andrej on 13.02.17.
 */
public class Groups {
    static public final String POEM =
            "Twas brilling, and the slithe toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite6 the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher matcher = Pattern.compile("[a-z]\\w+").matcher(POEM);
        while (matcher.find()){
            System.out.print("[" + matcher.group() + "]\n");
        }
    }
}

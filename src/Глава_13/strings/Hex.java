package Глава_13.strings;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by andrej on 06.02.17.
 */
public class Hex {
    public static String format(byte[] data){
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b : data){
            if (n % 16 == 0)
                result.append(String.format("%05X: ", n));
            result.append(String.format("%02X ", b));
            n++;
            if (n % 16 == 0) result.append("\n");
        }
        result.append("\n");
        return  result.toString();
    }

    public static void main(String[] args) throws Exception {

        if (args.length == 0)
            System.out.println(format(BinaryFile.read("src/Глава_13/strings/Hex.java")));
        else System.out.println(format(BinaryFile.read(new File(args[0]))));
    }
}




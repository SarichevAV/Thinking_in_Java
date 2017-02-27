package Глава_11.упражнение_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by andrej on 31.01.17.
 */
public class Gerbil {
    int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    int hope(){
        System.out.print("Gerbil.hope() num: ");
        return gerbilNumber;
    }

    public static void main(String[] args) {
        Map<String, Gerbil> gerbilMap = new HashMap<>();
        gerbilMap.put("Gerbil 1", new Gerbil(1));
        gerbilMap.put("Gerbil 3", new Gerbil(3));
        gerbilMap.put("Gerbil 2", new Gerbil(2));

        Iterator<String> iterator = gerbilMap.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.print("Key: "+key+ " Hope: ");
            System.out.println(gerbilMap.get(key).hope());

        }


    }
}

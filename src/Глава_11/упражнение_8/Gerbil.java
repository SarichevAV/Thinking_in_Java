package Глава_11.упражнение_8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by andrej on 31.01.17.
 */
public class Gerbil {
    int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    int hope(){
        System.out.println("Gerbil.hope()");
        return gerbilNumber;
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbilsList = new ArrayList<Gerbil>();
        gerbilsList.add(new Gerbil(1));
        gerbilsList.add(new Gerbil(2));
        gerbilsList.add(new Gerbil(3));

        Iterator<Gerbil> iterator = gerbilsList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().hope());

        }


    }
}

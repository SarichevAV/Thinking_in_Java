package Глава_13.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrej on 04.02.17.
 */
public class InfiniteRecursion {
    public String toString() {
        return "InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v =
                new ArrayList<>();
        for (int i = 0; i < 10; i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);


    }
}

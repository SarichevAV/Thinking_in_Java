package Глава_11.упражнение_7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by andrej on 31.01.17.
 */
public class Solution {
    public static void main(String[] args) {
        Solution[] mass = {
                new Solution(),
                new Solution(),
                new Solution(),
                new Solution(),
        };

        List<Solution> solutionList = new LinkedList<Solution>(Arrays.asList(mass));

        List<Solution> sub = solutionList.subList(1,3);
        System.out.println(sub);
        System.out.println(solutionList);
//        solutionList.removeAll(sub);

//        solutionList.removeAll(sub);

//        System.out.println(solutionList);

    }
}

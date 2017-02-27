package test;

/**
 * Created by andrej on 10.02.17.
 */
public class Test_2 {

    public static int findMissingNumber(String sequence) {
        if (sequence == "") return 0;
        int missing = 0;
        int max = 0;
        int min = 0;
        String[] list = sequence.split(" ");
        Integer[] integers = new Integer[list.length];

        for (int i = 0; i < list.length; i++) {
            try {
                integers[i] = Integer.valueOf(list[i]);
                if(i == 0){
                    min = integers[i];
                    max = integers[i];
                }else {
                    if (integers[i] < min) min = integers[i];
                    if (integers[i] > max) max = integers[i];
                }

            }catch (NumberFormatException e){
                return 1;
            }
        }
        for (int i = min; i < max ; i++) {
            int proverka = 0;
            for (int j :
                    integers) {
                if (i == j) proverka = 1;
            }
            if (proverka == 0) return i;
        }
        return missing;
    }

    public static void main(String[] args) {
        System.out.println(findMissingNumber(""));
    }
}

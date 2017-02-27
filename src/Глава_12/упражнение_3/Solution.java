package Глава_12.упражнение_3;

/**
 * Created by andrej on 02.02.17.
 */
public class Solution {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}

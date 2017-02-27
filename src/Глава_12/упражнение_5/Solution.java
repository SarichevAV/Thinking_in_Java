package Глава_12.упражнение_5;

/**
 * Created by andrej on 02.02.17.
 */
public class Solution {
    public static void main(String[] args) {

        int b = 0;
        int a = 6;
        boolean t = true;
        while (t) {
            try {
                int c = a / b;
                t = false;
            } catch (Exception e) {
                e.printStackTrace();
                b = 2;
            }
            finally {
                System.out.println("Успешно");
            }
        }
    }
}

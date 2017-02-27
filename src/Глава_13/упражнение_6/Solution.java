package Глава_13.упражнение_6;

/**
 * Created by andrej on 06.02.17.
 */
public class Solution {
    private int a;
    private long b;
    private float c;
    private double d;

    public Solution(int a, long b, float c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return String.format("int a = %d \nlong b = %d \nfloat = %f \ndouble d = %f",a ,b, c, d);
    }

    public static void main(String[] args) {
        Solution solution = new Solution(2, 928232338, 3.14f , -2.122424);
        System.out.println(solution);
    }
}

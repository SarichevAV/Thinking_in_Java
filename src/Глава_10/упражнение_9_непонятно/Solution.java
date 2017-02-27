package Глава_10.упражнение_9_непонятно;

/**
 * Created by andrej on 28.01.17.
 */
public class Solution {
    private class inClass implements Inter{}
    Inter getInClass(){
        Inter inter = new inClass();
        return inter;
    }

    public static void main(String[] args) {
     Solution solution = new Solution();
     Solution.inClass in = (inClass) solution.getInClass();
    }
}

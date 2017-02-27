package Глава_12.упражнение_2;



public class Solution {
    private void get(){}

    public static void main(String[] args) {
        Solution solution = null;
        try {
            solution.get();
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}

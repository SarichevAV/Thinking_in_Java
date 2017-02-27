package Глава_12.упражнение_1;


public class Solution {
    public static void main(String[] args) {
        try {
            throw new Exception("создано в main()");
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
        finally {
            System.err.println("finally");
        }
    }
}

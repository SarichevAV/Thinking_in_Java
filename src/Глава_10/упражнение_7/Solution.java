package Глава_10.упражнение_7;

/**
 * Created by andrej on 28.01.17.
 */
public class Solution {

    private String s = "Закрытое поле";
    private String getS(){
        return s;
    }

    class inClass{
        void setS(String a){
            s = a;
            getS();
        }
    }

    void setClass(){
        inClass inClass = new inClass();
        inClass.setS("Hi hi :) ");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getS());
        solution.setClass();
        System.out.println(solution.getS());

    }
}

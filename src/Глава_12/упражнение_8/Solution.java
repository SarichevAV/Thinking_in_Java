package Глава_12.упражнение_8;

import Глава_12.упражнение_4.MyException;

/**
 * Created by andrej on 02.02.17.
 */
public class Solution {
    void print() throws MyException  {
        try {

        throw new MyException();
        }
        catch (MyException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}

package Глава_12.упражнение_6;

/**
 * Created by andrej on 02.02.17.
 */
public class MyException2 extends Exception {

    public String getMessage() {
        return "Ошибка MyException2";
    }
    public static void main(String[] args) {
        try{
            throw new MyException1();
        }
        catch (MyException1 e){
            e.printStackTrace();
        }
        try {
            throw new MyException2();
        }
        catch (MyException2 d){
            d.printStackTrace();
        }
    }
}

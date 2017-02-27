package Глава_12.упражнение_4;

/**
 * Created by andrej on 02.02.17.
 */
public class MyException extends Exception {
    private String message;
    public MyException() {
    }

    public MyException(String message) {
        this.message = message;
    }

    public void get() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        try{
            throw new MyException("3");
        } catch (MyException e) {

            e.printStackTrace();
            e.get();
        }
    }
}

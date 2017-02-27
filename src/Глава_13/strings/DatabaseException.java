package Глава_13.strings;

/**
 * Created by andrej on 06.02.17.
 */
public class DatabaseException extends Exception{
    public DatabaseException(int transactionID, int queryID, String massage) {
        super(String.format("(t%d, q%d) %s", transactionID, queryID, massage));
    }

    public static void main(String[] args) {
        try {
            throw new DatabaseException(3,7,"Ошибка записи");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

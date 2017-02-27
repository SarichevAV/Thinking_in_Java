package test;

/**
 * Created by andrej on 08.02.17.
 */
public class Test_1 {
    public static int[] nbMonths(int startPriceOld, int startPriceNew,
                                 int savingperMonth, double percentLossByMonth) {
        int month = 0;
        int priceOld = startPriceOld;
        int priceNew = startPriceNew;
        int saving = 0;
        double procent = percentLossByMonth;

        while (saving + priceOld < priceNew) {
            if (month % 2 == 0 && month != 0) procent += 0.5;
            priceOld *= (1 - procent / 100); // Каждый месяц цена на авто уменьшается
            priceNew *= (1 - procent / 100);
            saving += savingperMonth;
            month++;
        }
        int ostatok = (priceOld + saving) - priceNew;
        int[] result = new int[]{month, ostatok};
        return result;
    }

    public static void main(String[] args) {
        int[] res = Test_1.nbMonths(2000, 8000, 1000, 1.5);
        System.out.println(res[0] + " " + res[1]);
    }
}

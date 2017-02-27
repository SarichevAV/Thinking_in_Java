package Глава_13.strings;

import java.util.Formatter;

/**
 * Created by andrej on 05.02.17.
 */
public class Receip {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    private String size = "%-15s";

    public void printTitel() {
        f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price){
        f.format("%-15.15s %5d %10.2f\n", name, qty, price);
        total += price;
    }

    public void printTotal(){
        f.format("%-15s %5s %10.2f\n", "Tax", "", total*0.06);
        f.format("%-15s %5s %10s\n", "", "", "-----");
        f.format("%-15.5s %5s %10.2f\n", "Total", "", total*1.06);
    }

    public static void main(String[] args) {
        Receip receip = new Receip();
        receip.printTitel();
        receip.print("Potato", 6, 50.5);
        receip.print("Carote", 2, 12.3);
        receip.print("Sugar", 1, 37.7);
        receip.printTotal();
    }
}

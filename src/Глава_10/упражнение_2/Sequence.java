package Глава_10.упражнение_2;

/**
 * Created by andrej on 28.01.17.
 */
public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size){
        items = new Object[size];
    }
    public void add(Object x){
        if(next < items.length) items[next++] = x;
    }

    public void getItems(){
        for (Object o:
             items ) {
            System.out.println(o.toString());

        }

        }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(3);
        sequence.add(new Solution("  s"));
        sequence.add(new Solution("   w"));
        sequence.add(new Solution("e"));

        sequence.getItems();


    }
}

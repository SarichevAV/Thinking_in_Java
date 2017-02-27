package Глава_9.упражнение_4_провалено;

/**
 * Created by andrej on 23.01.17.
 *
 *  ПРОВАЛЕНО!
 *
 */
public class ExtendClass extends BaseClass {
    static void f(BaseClass a){
        ExtendClass b = (ExtendClass) a;
//        b.f;
    }

    public static void main(String[] args) {
        BaseClass a;
//        ExtendClass b = (ExtendClass) a;
//        b.f;
    }
}

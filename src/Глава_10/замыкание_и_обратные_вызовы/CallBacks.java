package Глава_10.замыкание_и_обратные_вызовы;


interface Incrementable {
    void increment();
}

// ПРОСТО реализуем интерфейс:
class Callee1 implements Incrementable {
    private int i = 0;
    public void increment() {
        i++;
        System.out.println(i);
    }
}


class MyIncrement {
    public void increment() {
        System.out.println("Другая операция");
    }
    public static void f(MyIncrement mi) {
        mi.increment();
    }
}

// Если ваш класс должен вызывать метод increment()
// по-другому, необходимо использовать внутренний класс
class Callee2 extends MyIncrement {
    private int i = 0;
    private void increment1() {
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable {
        public void increment() {
            // Указывается метод внешнего класса, иначе
            // возникает бесконечная рекурсия:
            Callee2.this.increment1();
        }
    }
    Incrementable getCallbackReference() {
        return new Closure();
    }
}

class Caller {
    private Incrementable callBackReference;
    Caller(Incrementable cbh) {
        callBackReference = cbh;
    }
    void go() {
        callBackReference.increment();
    }
}

public class CallBacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}

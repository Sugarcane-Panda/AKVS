
class A extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("In A" + i);
        }
        System.out.println("Exit A");
    }
}

class B extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("In B" + i);
        }
        System.out.println("Exit B");
    }
}

class C extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("In C" + i);
        }
        System.out.println("Exit C");
    }
}

public class ThreadPriority {

    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();
        a1.setPriority(Thread.MAX_PRIORITY);
        b1.setPriority(c1.getPriority() + 1);
        c1.setPriority(Thread.MIN_PRIORITY);
        a1.start();
        b1.start();
        c1.start();
    }
}

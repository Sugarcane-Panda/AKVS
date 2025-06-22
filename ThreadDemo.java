
class ThreadA extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread A:" + i);
        }
        System.out.println("Exit A!!!");
    }
}

class ThreadB extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread B:" + i);
        }
        System.out.println("Exit B!!!");

    }
}

public class ThreadDemo {

    public static void main(String args[]) {
        new ThreadA().start();
        new ThreadB().start();
    }
}

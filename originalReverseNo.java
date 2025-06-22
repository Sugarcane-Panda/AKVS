
class Original extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Original Nos: " + i);
        }
    }
}

class Reverse extends Thread {

    @Override
    public void run() {

        for (int k = 5; k >= 1; k--) {

            System.out.println("Reverse Nos: " + k);
        }
    }
}

public class originalReverseNo {

    public static void main(String[] args) {
        new Original().start();
        new Reverse().start();
    }

}

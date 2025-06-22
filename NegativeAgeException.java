
class NegativeAge extends Exception {

    public NegativeAge(String msg) {
        super(msg);
    }
}

public class NegativeAgeException {

    public static void main(String[] args) {
        int age = -12;
        try {
            if (age < 0) {
                throw new NegativeAge("Age cant be Negative");
            }
        } catch (NegativeAge e) {
            System.err.println(e);
        }
    }
}

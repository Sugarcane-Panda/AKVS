
public class ZeroDivide {

    public static void main(String[] args) {
        int a = 18, b = 2, c = 0;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero Error!");
        } catch (Exception e) {
            System.out.println("something went wrong" + e);
        }
        System.out.println(c);
    }
}

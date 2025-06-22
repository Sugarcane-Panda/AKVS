
import java.util.Scanner;

class InputCheck extends Exception {

    public InputCheck(String msg) {
        super(msg);
    }
}

public class UserInputExceptionCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        try {
            if (age < 0) {
                throw new InputCheck("Negative Age Entered");
            }
        } catch (InputCheck e) {
            System.out.println(e);
        }
        System.out.println("Age is : " + age);
    }
}

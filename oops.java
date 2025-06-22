
class Pen {

    String color;
    String type;

    public void Writing() {
        System.out.println("Color:" + color);
        System.out.println("Type:" + type);
        System.out.println("Write Something");
    }
}

public class oops {

    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "Black";
        pen1.type = "Ballpoint";
        pen1.Writing();
    }
}

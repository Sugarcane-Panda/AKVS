
class Pen {

    String color;
    String type;

    public void Writing() {
        System.out.println("Color:" + this.color);
        System.out.println("Type:" + this.type);
        System.out.println("Write Something");
    }
}

public class oops {

    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "Black";
        pen1.type = "Ballpoint";
        pen1.Writing();
        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen2.type = "Gel Point";
        pen1.Writing();
        
    }
}

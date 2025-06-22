
class Shape {

    void rectArea(int l, int b) {
        System.out.println("Area of Rectangle is:" + (l * b));
    }

    void cuboidArea(int l, int b, int h) {
        System.out.println("Area  of Cuboid:" + (2 * (l * b) + (b * h) + (l * h)));
    }
}

public class Shapes {

    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.rectArea(100, 200);
        s1.cuboidArea(10, 10, 10);
    }
}

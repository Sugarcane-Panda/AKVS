
class GrandFather {

    public int property;
}

class Father extends GrandFather {

    public String name;
    public int age;

}

class Uncle extends GrandFather {

    // String business;
    void displayBusiness(String b) {
        System.out.println("Uncles Business:" + b);
    }
}

class Child extends Father {

    void displayDetails() {
        System.out.println("Name:" + this.name + "\t" + "Age:" + this.age + "Property of GrandFather:" + this.property + " Acres");
    }
}

public class Family {

    public static void main(String[] args) {
        Child c1 = new Child();
        Child c2 = new Child();
        Uncle u1 = new Uncle();

        c1.name = "AK";
        c1.age = 20;
        c1.property = 2;
        c1.displayDetails();
        u1.displayBusiness("car showroom owner");
        c2.name = "VS";
        c2.age = 20;
        c2.property = 10;
        c2.displayDetails();
        u1.displayBusiness("CEO");
    }
}


class Student {

    String name;
    int age;

    public void StudInfo() {
        System.out.println("Name:" + name + "\t" + "Age:" + age);
    }
}

public class StudentInfo {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Badak";
        s1.age = 20;
        s1.StudInfo();
    }

}

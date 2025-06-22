
class Stud {

    String studId;
    String name;
    int year;
    String branch;

    public Stud() {
    }

    public Stud(String sid, int y) {
        studId = sid;
        year = y;
    }

    public Stud(String sid, String n, int y, String b) {
        studId = sid;
        name = n;
        year = y;
        branch = b;
    }

    void studDetails() {
        System.out.println("Student ID:" + this.studId);
        System.out.println("Student Name:" + this.name);
        System.out.println("Student Studying in Year:" + this.year);
        System.out.println("Student's Branch:" + this.branch);
        System.out.println("\n");
    }

}

public class Student {

    public static void main(String[] args) {
        Stud s1 = new Stud("2024DSECO01", 3);
        Stud s2 = new Stud("2024DSCO023", "Akshata", 3, "Computer Science");
        // Stud s3 = new Stud(); //no output default constructor 
        s1.studDetails();
        s2.studDetails();
    }
}

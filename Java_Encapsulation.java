

public class Java_Encapsulation {
    public static void main(String[] args) {
        // Student s = new Student();
        // System.out.println(s1.name);

        // Student s1 = new Student();
        // s1.name = "Vinayak";
        // s1.roll = 2203138;
        // s1.password = "Nandini@123";
        // s1.marks[0] = 100;
        // s1.marks[1] = 90;
        // s1.marks[2] = 10;

        // Student s2 = new Student(s1);// here alredy copied the constructor properties
        // s2.password = "Vinayak@123";
        // s1.marks[2] = 100;// here the marks changed into s1
        // for (int i = 0; i < 3; i++) {
        // System.out.println(s2.marks[i]);
        // }

        // Student s2 = new Student("vinayak");
        // Student s3 =new Student(2203138);
        // here the same construcotr called with different arguments so ;
        // here happen the polymorphism with name of constructor overloading
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Student() {// constructor
    // // this.name = name;
    // System.out.println("constructor is called:");
    // }

    // Student() {
    // marks = new int[3];
    // System.out.println("Non paramiterized Constuctor>>>");
    // }

    // Student(String name) {
    // this.name = name;
    // System.out.println("paramiterzied Constructor>>>");
    // }

    // Student(int roll) {
    // this.roll = roll;
    // }

    // shallow copy constructor
    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;// here just array's reference copied

    // here the Student constructor copies the s1 properties to s2 properties
    // and given the updated password to the s1 through s2
    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        // here we copied the values of marks
        // so values keep remain unchanged when cpoied to s2
        // for (int i = 0; i < marks.length; i++) {
        // this.marks[i] = s1.marks[i];
        // }
    }
}
class Person {
    protected final int version = 10;
    protected String name;
    protected int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Version: " + this.version);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

class Student extends Person {
    private int roll;

    public Student() {
        super();
        this.roll = 0;
    }

    public Student(int roll) {
        super();
        this.roll = roll;
    }

    public Student(String name) {
        this.roll = 0;
        this.name = name;
    }

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public Student(String name, int roll) {
        this.roll = roll;
        this.name = name;
    }

    public void display() {
        super.display();
        System.out.println("Roll: " + this.roll);
    }
}

public class Application {
    public static void main(String[] args) {
        Student s = new Student(5);
        System.out.println(s.name);
        s.display();
    }
}
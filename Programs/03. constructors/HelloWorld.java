class Person{
    protected final int version=10;
    protected String name;
}


class Teacher extends Person  {
    private String name;
}


class Student extends Person{
    private int roll;
    private int age;


    public Student(){
        this.roll = 0;
        this.name = "Unknown";
    }

    public Student(int roll){
        this.roll = roll;
        this.name = "Unknown";
    }

    public Student(String name){
        this.roll = 0;
        this.name = name;
    }

    public Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }

    public Student(String name, int roll){
        this.roll = roll;
        this.name = name;
    }

    public void display(){
        
        System.out.println("Version: " + this.version);
        System.out.println("Name: " + this.name);
        System.out.println("Roll: " + this.roll);
    }
}




public class HelloWorld {
    public static void main(String[] args) {
        Student s = new Student(5);
        System.out.println(s.name);
        s.display();
    }
}
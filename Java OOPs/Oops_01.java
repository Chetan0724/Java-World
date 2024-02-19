class Pen {
    String color;
    String type; // ball; gel

    public void write() {
        System.out.println("Write Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("constructor called");
    }
}

public class Oops_01 {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ball";

        pen1.printColor();
        pen2.printColor();

        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;

        s1.printInfo();
    }
}
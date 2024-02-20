class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";
    }
}

public class Oops_09 {
  public static void main(String[] args) {
    Student.school = "JNV";
    Student Student1 = new Student();
    Student1.name = "tony";
    System.out.println(Student1.school);
  }
}
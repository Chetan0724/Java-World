public class Methods_15 {
  static void myMethod() {
        System.out.println("Hello World!");
    }
    
  static void firstname(String fname) {
        System.out.println(fname + " computer science");
  }

  static void secondmethod(String name, int number) {
        System.out.println(name + " " + number);
  }

  static int sumfive(int num) {
        return num + 5;
  }

  static int sumtwonum(int num1, int num2) {
        return num1 + num2;
  }

  static void checkage(int age) {
    if (age < 18) {
      System.out.println("You are not old enough!");
    }
    else {
      System.out.println("You are old enough!");
    }
  }

  public static void main(String[] args) {
    myMethod();
    myMethod();
    myMethod();

    firstname("chetan");
    firstname("vikram");
    firstname("aryan");

    secondmethod("chetan", 1);
    secondmethod("vikram", 2);
    secondmethod("aryan", 3);

    System.out.println(sumfive(3));

    System.out.println(sumtwonum(1,3));

    int result = sumtwonum(1,3);
    System.out.println(result);

    checkage(19);
  }
}
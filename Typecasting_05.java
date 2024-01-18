public class Typecasting_05 {
  public static void main(String[] args) {
    // Widening Casting
    int myInt = 7;
    double myDouble = myInt;
    System.out.println(myInt);
    System.out.println(myDouble);

    // Narrowing Casting
    double myDoub = 6.74d;
    int myIn = (int) myDoub;
    System.out.println(myDoub);
    System.out.println(myIn);
  }
}
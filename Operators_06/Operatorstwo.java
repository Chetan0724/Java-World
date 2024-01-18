public class Operatorstwo {
  public static void main(String [] args) {
    // Assignment Operators
    int num = 8;
    System.out.println(num);
    num += 5;
    System.out.println(num);
    num -= 1;
    System.out.println(num);
    num *= 3;
    System.out.println(num);
    num %= 5;
    System.out.println(num);

    int num1 = 10;
    num1 &= 6;
    System.out.println(num1);

    int num2 = 5;
    num2 |= 3;
    System.out.println(num2);

    int num3 = 12;
    num3 ^= 9;
    System.out.println(num3);

    int num4 = 32;
    num4 >>= 2;
    System.out.println(num4);

    int num5 = 4;
    num5 <<= 3;
    System.out.println(num5);

    double num6 = 5;
    num6 /= 3;
    System.out.println(num6);
  }
}
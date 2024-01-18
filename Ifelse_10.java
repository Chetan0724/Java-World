public class Ifelse_10 {
  public static void main(String[] args) {

    // if (condition) {
    //     code
    // }

    if (18 > 13) {
        System.out.println("18 is greater than 13");
    }

    int x = 20;
    int y = 18;
    if (x < y) {
        System.out.println("x is greater than y");
    }

    // if (condition) {
    //     code1
    // } else {
    //     code2
    // }

    int marks = 38;
    if (marks > 18) {
        System.out.println("Enjoy!");
    } else {
        System.out.println("Re-exam");
    }

    // if (condition1) {
    //     code1
    // } else if (condition2) {
    //     code2
    // } else {
    //     code3
    // }

    int mathsMarks = 40;
    if (mathsMarks > 50) {
        System.out.println("A");
    } else if (mathsMarks > 35) {
        System.out.println("B");
    } else {
        System.out.println("C");
    }
  }
}
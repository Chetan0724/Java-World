public class ShortHand {
  public static void main(String[] args) {

    // variable = (condition) ? expressionTrue :  expressionFalse;

    // int marks = 38;
    // if (marks > 18) {
    //     System.out.println("Enjoy!");
    // } else {
    //     System.out.println("Re-exam");
    // }

    int marks = 38;
    String result = (marks > 18) ? "Enjoy!" : "Re-exam";
    System.out.println(result);

    // Switch Statement

    /*
    switch(expression) {
        case x:
            code block
            break;
        case y:
            code block
            break;
        default:
            code block
        }
    */

   int day = 4;
   switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
  }
}
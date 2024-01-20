public class Arrays_14 {
  public static void main(String[] args) {
    String[] names;
    String[] subjects = {"Physics", "Maths", "Chemistry", "Hindi", "English"};
    int[] myNum = {1, 2, 3, 4};

    System.out.println(subjects[0]);

    subjects[0] = "DSA";

    System.out.println(subjects[0]);
    System.out.println(subjects.length);

    for (int i = 0; i < subjects.length; i++) {
        System.out.println(subjects[i]);
    }

    for (String i : subjects) {
        System.out.println(i);
    }

    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    System.out.println(myNumbers[1][2]);
    myNumbers[1][2] = 9;
    System.out.println(myNumbers[1][2]);

    for (int m = 0; m < myNumbers.length; ++m) {
        for (int n = 0; n < myNumbers[m].length; ++n) {
            System.out.println(myNumbers[m][n]);
        }
    }
  }
}
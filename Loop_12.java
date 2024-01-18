public class Loop_12 {
  public static void main(String[] args) {

    // while (condition) {
    //     code
    //     }

    int i = 0;
    while (i < 5) {
        System.out.println(i);
        i++;
    }

    // do {
    //     code
    // }
    // while (condition);

    int j = 0;
    do {
        System.out.println(j);
        j++;
    }
    while (j < 5);

    // for (statement 1; statement 2; statement 3) {
    //     code
    // }

    for (int k = 0; k < 5; k++) {
        System.out.println(k);
    }

    for (int m = 0; m <= 10; m = m + 2) {
        System.out.println(m);
    }

    // Nested Loop

    for (int x = 1; x <= 2; x++) {
        System.out.println("Outer Loop:" + x);
        for(int y = 1; y <= 3; y++) {
            System.out.println(" Inner Loop:" + y);
        }
    }

    // For-Each Loop

    // for (type variableName : arrayName) {
    //     code
    // }

    String[] names = {"Chetan", "Aditya", "Vikram", "Ayush", "Aryan"};
    for (String z : names) {
        System.out.println(z);
    }
    
  }
}
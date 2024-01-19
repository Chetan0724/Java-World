public class Break_13 {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
        if (i == 2) {
            break;
        }
    System.out.println(i);
    }

    for (int j = 0; j < 5; j++) {
        if (j == 2) {
            continue;
        }
        System.out.println(j);
    }

    int k = 0;
    while (k < 7) {
        System.out.println(k);
        k++;
        if (k == 5) {
            break;
        }
    }

    int m = 0;
    while (m < 10) {
        if (m == 5) {
            m++;
            continue;
        }
        System.out.println(m);
        m++;
    }
  }
}
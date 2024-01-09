public class Num {
  public static void main(String[] args) {
    int x = 7;
    int y = 3;
    int z = x + y;
    System.out.println(z);

    String a = "7";
    String b = "3";
    String c = a + b;
    System.out.println(c);

    String m = "12";
    int n = 13;
    String o = m + n;
    //    int o = m + n; Error
    System.out.println(o);

    String txt = "The word \"quotation\" contains double quotes.";
    System.out.println(txt);

    String txtOne = "It\'s a beautiful day outside, perfect for a leisurely walk in the park.";
    System.out.println(txtOne);

    String txtTwo = "The character \\ is called backslash.";
    System.out.println(txtTwo);

    String txtThree = "Hello\nWorld!";
    System.out.println(txtThree);
  }
}
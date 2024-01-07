public class Strings {
  public static void main(String[] args) {
    String name = "Chetan";
    System.out.println(name);
    // String Methods
    System.out.println("The length of the name string is: " + name.length());
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());

    String txt = "The small kitten played with a small ball.";
    System.out.println(txt.indexOf("small"));
    System.out.println(txt.indexOf("a"));
  }
}
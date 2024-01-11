public class Bool {
  public static void main (String[] args) {
    boolean drive = true;
    boolean play = false;
    System.out.println(drive);
    System.out.println(play);

    int x = 10;
    int y = 9;
    System.out.println(x > y);

    System.out.println(5 > 6);

    int z = 12;
    System.out.println(z == 10);

    System.out.println(15 == 10);

    int userAge = 26;
    int votingAge = 18;
    System.out.println(userAge >= votingAge);

    int myAge = 22;
    int drivingAge = 18;

    if (myAge >= drivingAge) {
        System.out.println("You can drive!");
    }
    else {
        System.out.println("You cannot drive!");
    }
  }
}
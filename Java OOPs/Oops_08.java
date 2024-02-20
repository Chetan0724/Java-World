interface Animal {
    int eyes = 2;
    void walk();
    // Animal() {}

    // void eat() {

    // }
}

interface Herbivore {

}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

public class Oops_08 {
  public static void main(String[] args) {
    Horse horse = new Horse();
    horse.walk();
  }
}
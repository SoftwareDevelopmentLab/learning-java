package _01_fundamentals._05_loops;

public class Main {
  public static void main(String[] args) {
    whileControl();

    doWhileControl();

    forControl();

    forEachControl();

    breakControl();

    continueControl();

    labeledLoop();

    infiniteLoop();
  }

  public static void whileControl() {
    int x = 0;
    while (x < 10) {
      System.out.println(x);
      x++;
    }
  }

  public static void doWhileControl() {
    int x = 0;
    do {
      System.out.println(x);
      x++;
    } while (x < 10);
  }

  public static void forControl() {
    for (int x = 0; x < 10; x++) {
      System.out.println(x);
    }
  }

  public static void forEachControl() {
    int[] numbers = {1, 2, 3, 4, 5};
    for (int number : numbers) {
      System.out.println(number);
    }
  }

  public static void breakControl() {
    for (int x = 0; x < 10; x++) {
      if (x == 5) {
        break;
      }
      System.out.println(x);
    }
  }

  public static void continueControl() {
    for (int x = 0; x < 10; x++) {
      if (x == 5) {
        continue;
      }
      System.out.println(x);
    }
  }

  public static void labeledLoop() {
    outer:
    for (int x = 0; x < 10; x++) {
      for (int y = 0; y < 10; y++) {
        if (y == 5) {
          break outer;
        }
        System.out.println(x + " " + y);
      }
    }
  }

  public static void infiniteLoop() {
    for (;;) {
      System.out.println("Hello");
    }
  }
}

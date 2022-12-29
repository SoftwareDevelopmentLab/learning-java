package _01_fundamentals._04_conditionals;

public class Main {
  public static void main(String[] args) {
    ifControl();

    ifElseControl();

    ifElseIfControl();

    switchControl();
  }

  public static void ifControl() {
    int x = 10;
    int y = 3;

    if (x > y) {
      System.out.println("x is greater than y");
    }
  }

  public static void ifElseControl() {
    int x = 10;
    int y = 3;

    if (x > y) {
      System.out.println("x is greater than y");
    } else {
      System.out.println("x is less than or equal to y");
    }
  }

  public static void ifElseIfControl() {
    int x = 10;
    int y = 3;

    if (x > y) {
      System.out.println("x is greater than y");
    } else if (x < y) {
      System.out.println("x is less than y");
    } else {
      System.out.println("x is equal to y");
    }
  }

  public static void switchControl() {
    int x = 10;
    int y = 3;

    switch (x) {
      case 10:
        System.out.println("x is 10");
        break;
      case 20:
        System.out.println("x is 20");
        break;
      default:
        System.out.println("x is not 10 or 20");
        break;
    }
  }
}

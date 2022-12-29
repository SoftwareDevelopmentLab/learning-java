package _01_fundamentals._06_methods;

public class Main {
  public static void main(String[] args) {
    normalMethod();

    methodWithParameters(10, 3);

    System.out.println(methodWithReturn());

    System.out.println(methodWithReturnAndParameters(10, 3));
  }

  public static void normalMethod() {
    System.out.println("Execution");
  }

  public static void methodWithParameters(int x, int y) {
    System.out.println(x + y);
  }

  public static String methodWithReturn() {
    return "Function Return";
  }

  public static int methodWithReturnAndParameters(int x, int y) {
    return x + y;
  }
}

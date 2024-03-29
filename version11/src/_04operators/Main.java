package _04operators;

public class Main {

  public static void main(String[] args) {
    operators();
  }

  static void operators() {
    arithmetics();

    assignment();

    relational();

    logical();

    unary();

    ternary();

    bitwise();
  }

  static void arithmetics() {
    int x = 10;
    int y = 3;
    int sum = x + y;
    int subtract = x - y;
    int pow = x * y;
    int divide = x / y;
    int module = x % y;
    System.out.println(sum);
    System.out.println(subtract);
    System.out.println(pow);
    System.out.println(divide);
    System.out.println(module);
  }

  static void assignment() {
    int x = 10;
    System.out.println(x);
  }

  static void relational() {
    int x = 10;
    int y = 3;
    boolean equal = x == y;
    boolean notEqual = x != y;
    boolean greater = x > y;
    boolean less = x < y;
    boolean greaterOrEqual = x >= y;
    boolean lessOrEqual = x <= y;
    System.out.println(equal);
    System.out.println(notEqual);
    System.out.println(greater);
    System.out.println(less);
    System.out.println(greaterOrEqual);
    System.out.println(lessOrEqual);
  }

  static void logical() {
    boolean x = true;
    boolean y = false;
    boolean and = x && y;
    boolean or = x || y;
    boolean not = !x;
    System.out.println(and);
    System.out.println(or);
    System.out.println(not);
  }

  static void unary() {
    int x = 10;
    x++;
    System.out.println(x);
    x--;
    System.out.println(x);
    x += 3;
    System.out.println(x);
    x -= 3;
    System.out.println(x);
    x *= 3;
    System.out.println(x);
    x /= 3;
    System.out.println(x);
    x %= 3;
    System.out.println(x);
  }

  static void ternary() {
    int x = 10;
    int y = 3;
    int z = x > y ? x : y;
    System.out.println(z);
  }

  static void bitwise() {
    int x = 10;
    int y = 3;
    int and = x & y;
    int or = x | y;
    int xor = x ^ y;
    int not = ~x;
    int leftShift = x << y;
    int rightShift = x >> y;
    int rightShiftZero = x >>> y;
    System.out.println(and);
    System.out.println(or);
    System.out.println(xor);
    System.out.println(not);
    System.out.println(leftShift);
    System.out.println(rightShift);
    System.out.println(rightShiftZero);
  }
}

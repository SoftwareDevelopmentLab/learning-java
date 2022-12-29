package _01_fundamentals._01_basic_syntax;

public class Main {
  public static void main(String[] args) {
    comments();

    packages();

    classes();

    methods();

    caseSensitive();

    classNaming();

    methodNaming();

    accessModifiers();

    nonAccessModifier();
  }

  static void comments() {
    // Comentário de uma linha

    /*
     * Comentário de
     * múltiplas linhas
     */

    /** documentation */
  }

  static void packages() {
    // package _01_fundamentals._01_basic_syntax;
  }

  static void classes() {
    // class Main {
    // }
  }

  static void methods() {
    // public static void main(String[] args) {
    // }
  }

  static void caseSensitive() {
    // String name = "Luiz";
    // String Name = "Luiz";
    // String NAME = "Luiz";
  }

  static void classNaming() {
    // class Main {}
    // class Main2 {}
    // class _Main3 {}
    // class _OtherMain4 {}
  }

  static void methodNaming() {
    // public static void main(String[] args) {}
    // public static void main2(String[] args) {}
    // public static void _main3(String[] args) {}
    // public static void _otherMain4(String[] args) {}
  }

  static void accessModifiers() {
    // Access Modifiers: default, public, protected, private
  }

  static void nonAccessModifier() {
    // Non-access Modifiers: final, abstract, strictfp.
  }
}

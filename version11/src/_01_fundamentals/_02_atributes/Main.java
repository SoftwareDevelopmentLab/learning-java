package _01_fundamentals._02_atributes;

public class Main {
  public static void main(String[] args) {
    variables();
  }

  static void variables() {
    defaultInitialized();

    defaultNotInitialized();

    inferredType();

    constant();

    multiplyInitialization();
  }

  static void defaultInitialized() {
    // TIPO NOME = VALOR;
    String name = "Luiz";
  }

  static void defaultNotInitialized() {
    // TIPO NOME; => recebe o valor ZERO do tipo
    String nome3;
    nome3 = "Luiz";
  }

  static void inferredType() {
    // var NOME = VALOR;
    var name2 = "Luiz";
  }

  static void constant() {
    // final TIPO NOME = VALOR;
    final String name4 = "Luiz";
  }

  static void multiplyInitialization() {
    // TIPO NOME, NOME1, NOME2;
    String a, b, c;
  }
}

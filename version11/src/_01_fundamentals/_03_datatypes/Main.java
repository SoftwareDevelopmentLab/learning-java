package _01_fundamentals._03_datatypes;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        types();
    }

    static void types() {
        booleanType();
        booleanWrapperType();

        byteType();
        byteWrapperType();

        charType();
        charWrapperType();

        shortType();
        shortWrapperType();

        intType();
        intWrapperType();

        longType();
        longWrapperType();

        floatType();
        floatWrapperType();

        doubleType();
        doubleWrapperType();

        bigIntegerType();

        bigDecimalType();

        stringType();
    }

    static void booleanType() {
        System.out.println("==== boolean ====");

        boolean booleanValue = true;
        System.out.printf("%b%n", booleanValue);
    }

    static void booleanWrapperType() {
        System.out.println("==== Boolean ====");

        Boolean booleanValue = true;
        System.out.printf("%b%n", booleanValue);
        System.out.printf("TYPE: %s%n", Boolean.TYPE);
    }

    static void byteType() {
        System.out.println("====== byte =====");
        byte byteValue = 12;

        System.out.println(byteValue);
    }

    static void byteWrapperType() {
        System.out.println("====== Byte =====");
        Byte byteValue = 12;

        System.out.println(byteValue);
        System.out.printf("TYPE: %s%n", Byte.TYPE);
        System.out.printf("MÁXIMO: %d%n", Byte.MAX_VALUE);
        System.out.printf("MÍNIMO: %d%n", Byte.MIN_VALUE);

        System.out.println(Byte.parseByte("123"));
    }

    static void charType() {
        System.out.println("====== char =====");
        char charValue = 'A';
        char charASCIIValue = 65;

        System.out.println(charValue);
        System.out.println(charASCIIValue);

        System.out.printf("%c%n", charValue);
    }

    static void charWrapperType() {
        System.out.println("=== Character ===");
        System.out.println("type: " + Character.TYPE);
        System.out.println(Character.isDefined(0));
    }

    static void shortType() {
        System.out.println("====== short ====");
        short shortValue = 1234;

        System.out.println(shortValue);
        System.out.printf("%d%n", shortValue);
    }

    static void shortWrapperType() {
        System.out.println("====== Short ====");
        Short shortValue = 1234;

        System.out.println(shortValue);
        System.out.printf("TYPE: %s%n", Short.TYPE);
        System.out.printf("MÁXIMO: %d%n", Short.MIN_VALUE);
        System.out.printf("MÍNIMO: %d%n", Short.MAX_VALUE);
    }

    static void intType() {
        System.out.println("======= int =====");
        int intValue = 1234;

        System.out.println(intValue);
    }

    static void intWrapperType() {
        System.out.println("===== Integer ===");
        int intValue = 1234;

        System.out.printf("%d%n", intValue);
        System.out.printf("TYPE %s%n", Integer.TYPE);
        System.out.printf("MÁXIMO: %d%n", Integer.MAX_VALUE);
        System.out.printf("MÍNIMO: %d%n", Integer.MIN_VALUE);
    }

    static void longType() {
        System.out.println("====== long =====");
        long longValue = 123456;

        System.out.println(longValue);
    }

    static void longWrapperType() {
        System.out.println("====== Long =====");
        int longValue = 1234;

        System.out.printf("%d%n", longValue);
        System.out.printf("TYPE %s%n", Long.TYPE);
        System.out.printf("MÁXIMO: %d%n", Long.MAX_VALUE);
        System.out.printf("MÍNIMO: %d%n", Long.MIN_VALUE);
    }

    static void floatType() {
        System.out.println("===== float =====");
        float floatValue = 123456;

        System.out.println(floatValue);
    }

    static void floatWrapperType() {
        System.out.println("===== Float =====");
        Float floatValue = 1234.0f;

        System.out.printf("%f%n", floatValue);
        System.out.printf("TYPE %s%n", Float.TYPE);
        System.out.printf("MÁXIMO: %f%n", Float.MAX_VALUE);
        System.out.printf("MÍNIMO: %f%n", Float.MIN_VALUE);
    }

    static void doubleType() {
        System.out.println("===== double ====");
        double doubleValue = 123456;

        System.out.println(doubleValue);
    }

    static void doubleWrapperType() {
        System.out.println("===== Double ====");

        Double doubleValue = 1234.0;
        System.out.printf("%f%n", doubleValue);
        System.out.printf("TYPE %s%n", Double.TYPE);
        System.out.printf("MÁXIMO: %f%n", Double.MAX_VALUE);
        System.out.printf("MÍNIMO: %f%n", Double.MIN_VALUE);
    }

    static void bigIntegerType() {
        System.out.println("=== BigInteger ==");
        BigInteger bigIntegerValue = BigInteger.valueOf(1234);

        System.out.printf("%d%n", bigIntegerValue);
    }

    static void bigDecimalType() {
        System.out.println("=== BigDecimal ==");
        BigDecimal bigDecimalValue = BigDecimal.valueOf(1234);

        System.out.printf("%f%n", bigDecimalValue);
    }

    static void stringType() {
        System.out.println("===== String ====");
        String stringValue = "Esta é uma string";

        System.out.printf("%s%n", stringValue);
    }
}

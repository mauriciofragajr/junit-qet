package io.mauriciofragajr.junit;

public class Calculator {

    public int sum (int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int summation(int n) {
        int somatorio = 0;
        while (n >= 0) {
            somatorio += n;
            n--;
        }
        return somatorio;
    }

    public static boolean ehPositivo(int n) {
        return n >= 0;
    }

    public static int compara(int a, int b) {
        int retorno = 0;
        if (a==b) {
            retorno = 0;
        } else if (a > b) {
            retorno = 1;
        } else {
            retorno = -1;
        }
        return retorno;
    }
}

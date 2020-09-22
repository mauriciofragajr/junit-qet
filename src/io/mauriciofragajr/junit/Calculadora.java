package io.mauriciofragajr.junit;

public class Calculadora {

    public int soma (int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static int divisao(int a, int b) {
        return a / b;
    }

    public static int somatoria(int n) {
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

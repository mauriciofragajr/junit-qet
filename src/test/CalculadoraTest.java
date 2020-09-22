package test;

import io.mauriciofragajr.junit.Calculadora;
import org.junit.jupiter.api.*;

class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @DisplayName("Testa a soma de dois números")
    @Test
    public void testSomaDoisNumero() {
        int soma = calc.soma(4,  5);
        Assertions.assertEquals(9, soma);
    }

}
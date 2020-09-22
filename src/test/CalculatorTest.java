package test;

import io.mauriciofragajr.junit.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    //@DisplayName("sum test")
    @Test
    public void testSum() {
        int result = calc.sum(4,  5);
        assertEquals(9, result);
    }

    @Test
    public void testDivision() {
        int result = calc.division(8, 4);
        assertTrue(result == 2);
    }

    @Test
    public void testDivisionByZero() {
        try {
            calc.division(8, 0);
            fail("Exception not thrown\n");
        }catch (ArithmeticException e) {
            Assertions.assertEquals("/ by zero", e.getMessage());
        }
    }

    @Test
    public void testDivisionByZeroAssertThrows() {
        assertThrows(ArithmeticException.class,
                () -> calc.division(8, 0));
    }


}
//package Main;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void test_para_sumar() {
        Calculadora calc = new Calculadora();

        assertTrue(calc.sumar(2.0, 2.0) == 4.0);
    }

    @Test
    public void test_para_dividir() {
        Calculadora calc = new Calculadora();

        assertEquals(calc.dividir(1, 0), 0.0, 0.0);
    }
}
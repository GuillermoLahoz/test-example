package org.iesfm.calculator;


import org.iesfm.calculator.exception.NegativeNumberException;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    // Esto es un escenario de test que comprueba que 2 + 5 es 7
    @Test
    public void sum2And5() {
        // Preparación
        int n1 = 2;
        int n2 = 5;
        // Ejecutamos el test
        int res = Calculator.sum(n1, n2);
        // Comprobamos que el resultado de sumar 2 y 5 es 7
        Assert.assertEquals(7, res);
    }

    // Esto es otro escenario de test que comprueba que 2 - 5 es -3
    @Test
    public void substract2And5() {
        // Ejecutamos el test
        int res = Calculator.substract(2, 5);
        // Comprobamos que el resultado de sumar 2 y 5 es 7
        Assert.assertEquals(-3, res);
    }

    @Test
    public void factorial3() throws NegativeNumberException {
        // Preparación
        int n = 3;
        // Ejecución
        int res = Calculator.factorial(n);
        // Comprobaciones
        Assert.assertEquals(6, res);
    }

    @Test
    public void factorial0() throws NegativeNumberException {
        // Preparación
        int n = 0;
        // Ejecución
        int res = Calculator.factorial(n);
        // Comprobaciones
        Assert.assertEquals(1, res);
    }

    @Test(expected = NegativeNumberException.class)
    public void factorialNegative() throws NegativeNumberException {
        // Preparación
        int n = -2;
        // Ejecución
        int res = Calculator.factorial(n);
    }

}

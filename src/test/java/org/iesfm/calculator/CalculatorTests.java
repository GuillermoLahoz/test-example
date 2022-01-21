package org.iesfm.calculator;


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


}

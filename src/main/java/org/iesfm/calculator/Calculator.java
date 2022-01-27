package org.iesfm.calculator;

import org.iesfm.calculator.exception.NegativeNumberException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Realiza operaciones aritméticas
 */
public class Calculator {

    private static final Logger log = LoggerFactory.getLogger(Calculator.class);

    /**
     * Calcula el factorial de un número
     * @param n El número del que vamos a calcular el factorial
     * @return El factorial del n
     * @throws NegativeNumberException Cuando n es negativo
     */
    public static int factorial(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException();
        }
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    /**
     * Suma dos números
     * @param n1 El primer número
     * @param n2 El segundo número
     * @return La suma de n1 y n2
     */
    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static int substract(int n1, int n2) {
        return n1 - n2;
    }
}
package org.iesfm.calculator;

import org.iesfm.calculator.exception.NegativeNumberException;

public class Calculator {

    /**
     * if (n > 0) -> factorial(n) = n * (n - 1) * (n -2) .... * 1
     * factorial(0) = 1
     * if (n < 0) -> factorial (negativo) = NegativeNumberException
     *
     * @param n
     * @return
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

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static int substract(int n1, int n2) {
        return n1 - n2;
    }
}

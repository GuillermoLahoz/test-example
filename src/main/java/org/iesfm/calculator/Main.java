package org.iesfm.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private final static Scanner scanner = new Scanner(System.in);

    static int askInteger() {
        Integer n = null;
        while (n == null) {
            try {
                log.info("Introduce un número");
                n = scanner.nextInt();
            } catch (InputMismatchException e) {
                log.warn("No has introducido un número");
            } finally {
                scanner.nextLine();
            }
        }
        return n;
    }

    public static int askPositive() {
        int n = askInteger();
        while(n < 0) {
            log.warn("Debe ser positivo");
            n = askInteger();
        }
        return n;
    }

    public static void main(String[] args) {
        int v1 = askInteger();
        int v2 = askPositive();
        double res = v1 - v2;
        log.info("" + res);
    }


}
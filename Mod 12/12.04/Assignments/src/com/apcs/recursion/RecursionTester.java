package com.apcs.recursion;
/**
 * Translates Piecewise Functions into recursive methods
 *
 * @author Josiah Kowalski
 * @version 2/12/20
 */

class Recursion {

    Recursion()
    {
    }

    /**
     * Solves Question 1
     *
     * @param x = 25
     * @return f(x)
     */
    public double solvePiecewiseFunc1(double x)
    {
        if (x <= 5)
        {
            System.out.println(x + " <= 5, therefore ... f(" + x + ") = 5");
            return 5;
        }
        else
        {
            System.out.println(x + " > 5, therefore ... f(" + x + ") = f(" + x + " - 2) + 3 = f(" + (x - 2) + ") + 3");
            return solvePiecewiseFunc1(x - 2) + 3;
        }
    }

    /**
     * Solves Question 2
     *
     * @param x = 30
     * @return f(x)
     */
    public double solvePiecewiseFunc2(double x) {
        if (x <= 25) {
            System.out.println(x + " <= 25, therefore ... f(" + x + ") = 20");
            return 20;
        }
        else {
            System.out.println(x + " > 25, therefore ... f(" + x + ") = f(" + x + "/12) - 3 = f(" + (x/12) + ") - 3");
            return solvePiecewiseFunc2(x / 12 + 5) - 3;
        }
    }

    /**
     * Solves Question 4
     *
     * @param x = 500
     * @return f(x)
     */
    public double solvePiecewiseFunc4(double x) {
        if (x > 20) {
            System.out.println(x + " > 20, therefore ... f(" + x + ") = -100");
            return -100;
        }
        else {
            System.out.println(x + " < 20, therefore ... f(" + x + ") = f(" + x + "*2) - 4 = f(" + (x * 2) + ") - 4");
            return solvePiecewiseFunc4(x * 2) - 4;
        }
    }
}

public class RecursionTester {

    public static void main(String[] args) {
        Recursion recursiveMethods = new Recursion();
        double x1 = 15;
        double x2 = 30;
        double x4 = 500;

        System.out.println("---------------------------------");
        System.out.println("       f(x - 2) + 3    if x >  5");
        System.out.println("f(" + x1 + ") = ");
        System.out.println("       5              if x <= 5");
        System.out.println("---------------------------------");

        double p1 = recursiveMethods.solvePiecewiseFunc1(x1);
        System.out.println("Problem 1 = " + p1);
        System.out.println();

        System.out.println("---------------------------------");
        System.out.println("       f(x/12 + 5) - 3 if x >  25");
        System.out.println("f(" + x2 + ") = ");
        System.out.println("       20              if x <= 25");
        System.out.println("---------------------------------");

        double p2 = recursiveMethods.solvePiecewiseFunc2(x2);
        System.out.println("Problem 2 = " + p2);
        System.out.println();

        System.out.println("---------------------------------");
        System.out.println("       f(x*2) - 4      if x <=  20");
        System.out.println("f(" + x4 + ") = ");
        System.out.println("       -100            if x > 20");
        System.out.println("---------------------------------");

        double p4 = recursiveMethods.solvePiecewiseFunc4(x4);
        System.out.println("Problem 4 = " + p4);

    }
}
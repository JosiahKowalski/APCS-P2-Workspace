import java.util.Scanner;

/**
 * Recursively Calculates Fibonacci numbers until the user wants to stop.
 *
 * @author Josiah K.
 * @version 03/02/20
 */
public class FibonacciNumbers {

    /**
     * Finds the nth Fibonacci number
     *
     * @return nth Fibonacci number
     */
    public int calcFibonacciNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return calcFibonacciNumber(n - 1) + calcFibonacciNumber(n - 2);
        }
    }

    public static void main(String[] args) {
        FibonacciNumbers fibonacci = new FibonacciNumbers();
        Scanner in = new Scanner(System.in);
        int index = 99;
        int fibNum;
        while (true) {
            System.out.println("Enter a Fibonacci number to find (>0 and <47) or enter 999 to quit: ");
            index = in.nextInt();
            if (index == 999) {
                System.exit(0);
            }
            if (index > 46) {
                System.out.println("Your Number is too high!");
            }
            else if (index < 1) {
                System.out.println("Your number is too low!");
            }
            else {
                fibNum = fibonacci.calcFibonacciNumber(index);
                if (index == 1 || index == 21 || index == 31 || index == 41) {
                    System.out.println(index + "st Fibonacci Number: " + fibNum);
                }
                else if (index == 2 || index == 22|| index == 32|| index == 42) {
                    System.out.println(index + "nd Fibonacci Number: " + fibNum);
                }
                else if (index == 3 || index == 23|| index == 33|| index == 43) {
                    System.out.println(index + "rd Fibonacci Number: " + fibNum);
                }
                else {
                    System.out.println(index + "th Fibonacci Number: " + fibNum);
                }
            }
        }
    }
}
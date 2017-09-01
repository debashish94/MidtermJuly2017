package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int n = 5;
        int recursive = factorial(n);
        int iteration = fIterative(n);
        System.out.println("The factorial of 5 using recursion is " + recursive);
        System.out.println("The factorial of 5 using iteration is " + iteration);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static int fIterative(int number) {

        int m = 1;
        for (int i = 1; i < number; i++) {
            m = m * (i + 1);
        }
        return m;
    }


}

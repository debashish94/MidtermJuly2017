package math;

public class Fibonacci {
    public static void main(String[] args) {
        /*
          Write 40 Fibonacci numbers with java.
         */

        int n = 40;
        for(int i = 1; i <= n; i++){
            System.out.print(fibonacci(i) +" ");
        }
    }
    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

}

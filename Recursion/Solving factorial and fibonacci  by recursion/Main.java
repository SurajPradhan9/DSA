import java.util.Scanner;

public class Main {

    static int fibonacci(int n) {
        // base case
        if (n == 0 || n == 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);

        // // sub problems
        // int prevFib = fibonacci(n - 1);
        // int prevPrevFib = fibonacci(n - 2);
        // // self work
        // int ans = prevFib + prevPrevFib;
        // return ans;
    }

    static int factorial(int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        // Smaller problem
        int smallAns = factorial(n - 1);
        // self work
        return n * smallAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // // Factorial
        // int ans=factorial(n);
        // System.out.println(ans);

        // Fibonacci
        for (int i = 0; i <= n; i++) {
            System.out.println(fibonacci(i));
        }
        int fib = fibonacci(n);
        System.out.println("nth fibonacci no is: " + fib);

    }
}
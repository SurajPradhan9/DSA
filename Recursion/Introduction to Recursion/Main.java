import java.util.Scanner;

public class Main {

    // print natural numbers from n to 1 using recursion
    static void printDecreasing(int n) {
        // Base work
        if (n == 1) {
            System.out.println(n);
            return;
        }
        // Self work
        System.out.println(n);
        // Recursive work
        printDecreasing(n - 1);
    }

    // print all natural numbers from 1 to n using recursion
    static void printIncreasing(int n) { // 1, 2 .. n-1,n
        // Base case
        if (n == 1) {
            System.out.println(1);
            return;
        }
        // Recursive work
        printIncreasing(n - 1); // Assumption // 1,2,..n-1
        // Self work
        System.out.println(n); // n
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
        printDecreasing(n);

    }
}
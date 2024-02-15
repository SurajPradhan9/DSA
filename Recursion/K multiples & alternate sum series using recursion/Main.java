import java.util.Scanner;

public class Main {

    static int alternateSeries(int n) {
        if (n == 0)
            return 0;
        int smallAns = alternateSeries(n - 1);
        if (n % 2 == 0)
            return smallAns - n;
        else
            return smallAns + n;
    }

    static int sumSeries(int n) {
        if (n == 0)
            return 0;
        int smallAns = sumSeries(n - 1);
        return n + smallAns;
    }

    static void multiples(int n, int k) {
        if (k == 1) {
            System.out.println(n);
            return;
        }
        multiples(n, k - 1);
        System.out.println(n * k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n=sc.nextInt();
        // int k=sc.nextInt();
        // multiples(n,k);

        // int n=sc.nextInt();
        // int ans=sumSeries(n);
        // System.out.println(ans);

        int n = sc.nextInt();
        int ans = alternateSeries(n);
        System.out.println(ans);

    }
}
import java.util.Scanner;

public class Main {

    // Problem 4
    static boolean equalSumPartition(int arr[]) {
        int totalSum = sum(arr);

        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum = prefixSum + arr[i];
            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum) {
                return true;
            }
        }
        return false;

    }

    static int sum(int arr[]) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }
        return totalSum;

    }

    // Problem 3
    static int[] prefixSumArray(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    // problem 2
    public static void prefixSum1(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
    }

    // Problem 1
    public static int[] prefixSum(int arr[]) {
        int n = arr.length;
        int pref[] = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // Problem 1- prefix sum in new Array
        // System.out.println("Enter how many elements");
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // System.out.println("Enter the array elements");
        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // }
        // int pref[]=prefixSum(arr);
        // System.out.println("The Prefix sum elements are");
        // for(int i=0;i<pref.length;i++){
        // System.out.println(pref[i]);
        // }

        // // Problem 2 - prefix sum without new Array
        // System.out.println("Enter how many elements");
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // System.out.println("Enter the array elements");
        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // }
        // prefixSum1(arr);
        // System.out.println("The prefix sum elements are");
        // for(int i=0;i<arr.length;i++){
        // System.out.println(arr[i]);
        // }

        // // Problem 3 - sum of values in range of indices from l to r
        // System.out.println("Enter how many elements");
        // int n = sc.nextInt();
        // int arr[] = new int[n + 1];
        // System.out.println("Enter the array elements");
        // for (int i = 1; i <= n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // int prefixSum[] = prefixSumArray(arr);
        // System.out.println("Enter no of queries:");
        // int q = sc.nextInt();
        // while (q-- > 0) {// q minus minus greater than 0 or we can write q-- at last
        // also
        // System.out.println("Enter range:");
        // int l = sc.nextInt();
        // int r = sc.nextInt();
        // int sum = prefixSum[r] - prefixSum[l - 1];
        // System.out.println("sum :" + sum);

        // }

        // Problem 4 - equal sum partition
        System.out.println("Enter how many elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(equalSumPartition(arr));

    }
}
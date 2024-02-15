import java.util.Scanner;

public class Main {

    static int sumArray(int arr2[], int index) {
        if (index == arr2.length - 1) {
            return arr2[index];
        }

        int smallAns = sumArray(arr2, index + 1);
        return smallAns + arr2[index];
    }

    static int maxValue(int arr1[], int index) {

        if (index == arr1.length - 1) {
            return arr1[index];
        }
        int smallAns = maxValue(arr1, index + 1);
        return Math.max(arr1[index], smallAns);

    }

    static void printArray(int arr[], int index) {
        int n = arr.length;
        if (index == n)
            return;
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int arr[] = { 5, 6, 7, 8 };
        // int index = 0;
        // printArray(arr, index);

        // int arr1[] = { 5, 6, 118, 3, 117 };
        // int index = 0;
        // int max = maxValue(arr1, index);
        // System.out.println(max);

        int arr2[] = { 2, 3, 5, 20, 1, 9 };
        int index = 0;
        int ans = sumArray(arr2, index);
        System.out.println(ans);

    }
}
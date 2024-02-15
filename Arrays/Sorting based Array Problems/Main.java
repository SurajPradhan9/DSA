import java.util.Scanner;

public class Main {

    // Problem 4 -2 pointer approach
    public static int[] sortSquare(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int[] sq = new int[n];
        int k = 0;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                sq[k] = arr[left] * arr[left];
                k++;
                left++;
            } else {
                sq[k++] = arr[right] * arr[right];
                right--;
            }

        }
        return sq;

    }

    // Problem 3 - 2 pointer approach
    public static void sortEvenOdd(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 != 0) {
                right--;
            }
        }
    }

    // Problem 2 - 2 pointer approach for sorting 0's and 1's
    static void sortZeroOne2(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }

    static void swap(int arr[], int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    // Problem 1-- we are traversing 2 times so for better approach refer problem 2
    static void sortZeroOne(int arr[]) {
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < zeroCount) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // Problem 1 - sort the array consisting of zeros and ones
        // System.out.println("Enter how many elements:");
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // System.out.println("Enter the array elements");
        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // }
        // sortZeroOne(arr);
        // System.out.println("the sorted array elements are:");
        // for(int i=0;i<arr.length;i++){
        // System.out.println(arr[i]);
        // }

        // // Problem 2 - sort the array consisting of zeros and ones ( optimized
        // approach
        // // )
        // System.out.println("Enter how many elements");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("enter the array elements");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // sortZeroOne2(arr);
        // System.out.println("The sorted array elements are:");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // // Problem 3 - sort the even elements at the begining followed by odd
        // integers
        // //the relative order of odd and even integers does not matter
        // System.out.println("Enter how many elements");
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // System.out.println("enter the array elements");
        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // }
        // sortEvenOdd(arr);
        // System.out.println("The sorted array elements are");
        // for(int i=0;i<arr.length;i++){
        // System.out.println(arr[i]);
        // }

        // Problem 4
        System.out.println("Enter how many elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = sortSquare(arr);
        System.out.println("The Array elements are:");
        for (int i = ans.length - 1; i >= 0; i--) {
            System.out.println(ans[i]);
        }

    }
}
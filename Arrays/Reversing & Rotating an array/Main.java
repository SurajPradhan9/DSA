
import java.util.Scanner;

class MiscProblems {

    // Problem 8
    public static int[] makeFrequencyArray(int arr[]) {
        int[] freq = new int[100005];// 10 to the power 5

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]=freq[arr[i]]+1;// the values which are present in arr[i] ,frequency array indexes will
                           // increase for the presented values in arr

        }
        return freq;

    }

    // problem 7
    public static void rotate2(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        reversetoRotate(arr, 0, n - k - 1);
        reversetoRotate(arr, n - k, n - 1);
        reversetoRotate(arr, 0, n - 1);
    }

    public static void reversetoRotate(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // problem 6
    public static int[] rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int ans[] = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j] = arr[i];
            j++;
        }
        for (int i = 0; i <= n - k - 1; i++) {
            ans[j] = arr[i];
            j++;
        }
        return ans;

    }

    // problem 5
    public static void reverseArr3(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    // Java use pass by value but while using arrays if we call the method both are
    // referencing to same Array
    static void swapInArray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // problem 4
    public static void reverseArr2(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    // problem 3
    public static int[] reverseArr(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans[j] = arr[i];
            j++;
        }

        // Using while loop
        // int i=n-1;
        // while(i>=0){
        // ans[j++]=arr[i--];
        // or (for increment and decrement only)
        // ans[j]=ans[i];
        // j++;
        // i--;
        // }

        return ans;

    }

    // problem 2
    public static void swap2(int a, int b) {
        System.out.println("Values Before swap:" + a + " " + b);
        a = a + b; // 2+4=6
        b = a - b; // 6-4=2
        a = a - b; // 6-2=4
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }

    // Problem 1
    public static void swapp(int a, int b) {
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }

}

public class Main {
    public static void main(String[] args) {
        MiscProblems obj = new MiscProblems();

        // // Problem 1 - swap using 3rd variable
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a value");
        // int a=sc.nextInt();
        // System.out.println("Enter b value");
        // int b=sc.nextInt();
        // MiscProblems.swapp(a,b);

        // // Problem 2 - swap without 3rd variable
        // int a=2,b=4;
        // MiscProblems.swap2(a,b);

        // // Problem 3 - reverse the array (in new Array)
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter how many elements:");
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // System.out.println("Enter Array elements");
        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // }
        // int ans[]=MiscProblems.reverseArr(arr);
        // System.out.println("The reversed array elements are:");
        // for(int i=0;i<arr.length;i++){
        // System.out.println(ans[i]);
        // }

        // // Problem 4- reverse the array (in Same array)
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter how many elements");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter Array Elements");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("The reversed array elements are:");
        // MiscProblems.reverseArr2(arr);

        // // Problem 5- reverse Array (swapping method)
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter how many elements");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter array elements");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // MiscProblems.reverseArr3(arr);
        // System.out.println("The reversed array elements are:");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // // problem 6 - rotate an array by k steps in new array
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter how many elements");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter array elements");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("enter k value");
        // int k = sc.nextInt();
        // int ans[] = MiscProblems.rotate(arr, k);
        // System.out.println("The rotated array elements are:");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(ans[i]);
        // }

        // // problem 7 - rotate an array by k steps in same array
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter how many elements:");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter the array elements:");
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("enter k value");
        // int k = sc.nextInt();
        // MiscProblems.rotate2(arr, k);
        // System.out.println("The rotated array elements are:");
        // for (int i = 0; i < n; i++) {
        // System.out.println(arr[i]);
        // }

        // problem 8
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] frequency = MiscProblems.makeFrequencyArray(arr);

        System.out.println("Enter number of queries");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("Enter number to be searched:");
            int val = sc.nextInt();
            if (frequency[val] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            q--;
        }

    }
}
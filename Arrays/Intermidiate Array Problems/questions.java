import java.util.Scanner;
import java.util.Arrays;

public class questions {
    static int firstRepeatVal(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static void secondSmall(int arr[]) {
        Arrays.sort(arr);
        System.out.println("Second smallest:" + arr[1]);
    }

    static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int secondMax(int arr[]) {
        int max = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }

    static void uniqueElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.println("unique element:" + arr[i]);
            }
        }
    }

    static int tripleSumPair(int arr[], int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }

        }
        return ans;
    }

    static int pairSum(int arr[], int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {

        // // Question 5
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter how many values:");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter Array Elements:");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("value is:" + firstRepeatVal(arr));

        // // Question-4
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter how many elements:");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter array elements");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // secondSmall(arr);
        // System.out.println("Second maximum is:" + secondMax(arr));

        // // Question-maximum value
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter how many elements:");
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // System.out.println("Enter Array elements");
        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // }
        // System.out.println("Maximum value is:"+findMax(arr));

        // // Question-3
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter how many elements");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter array elements");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // uniqueElement(arr);

        // // Question-2
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter how many elements:");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter target element:");
        // int target = sc.nextInt();
        // System.out.println("Enter Array elements:");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("pairs are:" + tripleSumPair(arr, target));

        // // Question-1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter how many elements:");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter target element:");
        // int target = sc.nextInt();
        // System.out.println("enter array elements:");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("pairs are:" + pairSum(arr, target));
    }
}
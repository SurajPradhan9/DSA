import java.util.Scanner;
import java.util.Arrays;

public class Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // //problem 1
        // System.out.println("Enter number of values:");
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // System.out.println("Enter Array elements:");
        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // }
        // System.out.println("Enter x value:");
        // int x=sc.nextInt();
        // Occurences obj=new Occurences();
        // System.out.println("No of occurence:"+obj.countOccurences(arr,x));

        // // problem 2
        // System.out.println("Enter How many elements:");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter array elements:");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter value x:");
        // int x = sc.nextInt();
        // lastOccurence obj = new lastOccurence();
        // System.out.println("last occurence is at index :"+obj.findLastOccurence(arr, x));

        // // Problem 3
        // System.out.println("Enter number of elements:");
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // System.out.println("Enter array elements:");
        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // }
        // System.out.println("Enter value x:");
        // int x=sc.nextInt();
        // greater obj=new greater();
        // System.out.println("the elements greater than x are:"+obj.strictly(arr,x));

        // // problem 4
        // System.out.println("Enter how many elements:");
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // System.out.println("Enter array elements:");
        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // }
        // sorted obj=new sorted();
        // System.out.println("Is sorted:"+obj.is_sorted(arr));

        // // problem 5
        // System.out.println("Enter number of elements:");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("ENter array elements:");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // element obj = new element();
        // int ans[] = obj.smallestAndLargestElement(arr);
        // System.out.println("Smallest:" + ans[0]);
        // System.out.println("Largest:" + ans[1]);

        // // Problem 6 --- not completed
        // System.out.println("Enter number of elements:");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter Array elements");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // kth obj = new kth();

        // // Assignment 1
        // System.out.println("Enter number of values:");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter array elements:");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // Assignment1 obj = new Assignment1();
        // obj.posNeg(arr);

        // // Assignment 3
        // System.out.println("Enter how many elements:");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter array elements:");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // Assignment3 obj = new Assignment3();
        // System.out.println("Enter kth element");
        // int k = sc.nextInt();
        // obj.sorting(arr, k);

        // // Assignment 5
        // System.out.println("Enter N no of elements:");
        // int n = sc.nextInt();
        // int arr1[] = new int[n];
        // System.out.println("Enter arr1 elements:");
        // for (int i = 0; i < arr1.length; i++) {
        // arr1[i] = sc.nextInt();
        // }
        // int arr2[] = new int[n];
        // boolean ans=true;
        // System.out.println("Enter arr2 elements:");
        // for (int i = 0; i < arr2.length; i++) {
        // arr2[i] = sc.nextInt();
        // }
        // for(int i=0;i<n;i++){
        // if(arr2[i]!=arr1[i]){
        // ans=false;
        // }
        // }
        // System.out.println(ans);
    }
}

// Problem 1-count the number occurence of element x
class Occurences {
    public int countOccurences(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            } 
        }
        return count;
    }
}

// problem 2-find last occurence of element x
class lastOccurence {
    public int findLastOccurence(int arr[], int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }
}

// problem 3-count the number of elements strictly greater than x
class greater {
    public int strictly(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }
}

// problem 4 -check if given array is sorted or not
class sorted {
    public boolean is_sorted(int arr[]) {
        boolean b = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                b = false;
                break;
            }
        }
        return b;
    }
}

// problem 5-find smallest and largest element of an array with return type
// array
class element {
    public int[] smallestAndLargestElement(int arr[]) {
        Arrays.sort(arr);
        int ans[] = { arr[0], arr[arr.length - 1] };
        return ans;
    }
}

// problem 6-find kth smallest and kth largest element of an array with return
// type array

// Assignment 1
class Assignment1 {
    public void posNeg(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                System.out.println("the elements at index" + i + " " + arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                System.out.println("the elements at index" + i + arr[i]);
            }
        }
    }
}

// Assignment 3
class Assignment3 {
    public void sorting(int arr[], int k) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == k) {
                System.out.println("kth element is:" + arr[i - 1]);
            }

        }
    }
}

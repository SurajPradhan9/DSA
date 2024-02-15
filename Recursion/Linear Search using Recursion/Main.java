import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // 6.FindLastIndex -> return index of target if target present in
    // array,otherwise return -1

    // 5. IsSorted or not return true or false


    // 4. return arraylist containing all indexes of target element in an array
    /*
     * arr={4,4,3,4}
     * target=4
     * ans(arrayList)={0,1,3}
     */
    static ArrayList<Integer> allIndices(int a[], int n, int target, int index) {
        // base case
        if (index >= n)
            return new ArrayList<Integer>(); // returns empty arraylist

        ArrayList<Integer> ans = new ArrayList<>();
        // self work
        if (a[index] == target) {
            ans.add(index); // ans-> {0} we are expecting
        }
        // recursive work
        ArrayList<Integer> smallAns = allIndices(a, n, target, index + 1);// smallAns->{1,3} we are expecting

        ans.addAll(smallAns); // adds smallans values in ans i.e ans->{0,1,3}
        return ans;
    }

    // 3. Prints all indexes of target element in an array
    static void findAllIndices(int a[], int n, int target, int index) {
        // base case
        if (index >= n)
            return;
        // Self work
        if (a[index] == target) {
            System.out.println(index + " ");
        }
        // Recursive work
        findAllIndices(a, n, target, index + 1);
    }

    // 2. FindFirstIndex -> return index of target if target present in
    // array,otherwise return -1
    static int targetAnss(int arr[], int target, int index) {
        // Base case
        if (index >= arr.length)
            return -1;
        // Self work
        if (arr[index] == target)
            return index;
        // Recursive work
        return targetAnss(arr, target, index + 1);
    }

    // 1. true false--> based on existence
    static boolean targetAns(int arr[], int target, int index) {
        // Base case
        if (index >= arr.length) {
            return false;
        }
        // Self work
        if (arr[index] == target) {
            return true;
        }
        // Recursive work
        if (targetAns(arr, target, index + 1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int arr[] = { 4, 12, 54, 14, 3, 8, 6, 1 };
        // int target = 144;
        // int index = 0;
        // if (targetAns(arr, target, index)) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("No");
        // }

        // int arr1[] = { 1, 2, 4, 4, 4, 5, 6 };
        // int target = 4;
        // int index = 0;
        // System.out.println(targetAnss(arr1, target, index));

        // int a[] = { 1, 2, 3, 2, 2, 5 };
        // int n = a.length;
        // int target = 2;
        // int index = 0;
        // findAllIndices(a, n, target, index);

        // int a[] = { 1, 2, 3, 2, 2, 5 };
        // int n = a.length;
        // int target = 2;
        // int index = 0;
        // ArrayList<Integer> ans = allIndices(a, n, target, index);
        // System.out.println(ans);
        // // for(Integer i:ans){
        // // System.out.println(i);
        // // }

    }
}
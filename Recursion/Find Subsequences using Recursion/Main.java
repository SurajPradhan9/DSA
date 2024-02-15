import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void printSubsetsSum(int[] arr, int n, int currentSum, int index) {
        if (index >= n) {
            System.out.println(currentSum);
            return;
        }
        // currentIndex+currentSum
        printSubsetsSum(arr, n, currentSum + arr[index], index + 1);// include
        // currentAns
        printSubsetsSum(arr, n, currentSum, index + 1); // exclude
    }

    static void printSSQ(String s, String currentAns) {// s="abc",currentAns=" "
        if (s.length() == 0) {
            System.out.println(currentAns);
            return;
        }
        char currentChar = s.charAt(0); // a
        String remString = s.substring(1);// bc
        // current char -> chooses to be a part of current ans
        printSSQ(remString, currentAns + currentChar); // bc //a // include currentchar
        // current char -> does not chooses to be a aprt of current ans
        printSSQ(remString, currentAns); // bc //" " // exclude currentchar i.e do not add
    }

    static ArrayList<String> getSSQ(String s) {
        /*
         * s="abc"
         */
        ArrayList<String> ans = new ArrayList<>();
        // Base case
        if (s.length() == 0) {
            ans.add(" ");
            return ans;
        }
        char currentChar = s.charAt(0);// a
        ArrayList<String> smallAns = getSSQ(s.substring(1)); // bc
        // smallAns=["bc","b","c"," "]
        // ans=["bc","abc","b","ab","c","ac"," ",a"]
        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(currentChar + ss);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String s = sc.nextLine();
        // ArrayList<String> ans=getSSQ(s);
        // for(String ss:ans){
        // System.out.println(ss);
        // }

        // String s = sc.nextLine();
        // String currentAns = "";
        // printSSQ(s, currentAns);

        int arr[] = { 2, 4, 5 };
        int n = arr.length;
        int currentSum = 0;
        int index = 0;
        printSubsetsSum(arr, n, currentSum, index);

    }
}
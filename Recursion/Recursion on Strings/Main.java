import java.util.Scanner;

public class Main {

    // Check if given integer is palindrome or not

    // palindrome without reversing a string
    static boolean palindrome(String s, int l, int r) {
        if (l >= r) {
            return true;
        }

        if ((s.charAt(l) == s.charAt(r)) && palindrome(s, l + 1, r - 1)) {
            return true;
        } else {
            return false;
        }
    }

    // reverse the string without passing index
    static String reverseString1(String s) {
        if (s.length() == 0) {
            return "";
        }
        String smallAns = reverseString1(s.substring(1));
        char ch = s.charAt(0);
        return smallAns + ch;

    }

    // reverse of a string
    static String reverseString(String s, int index) {
        if (index == s.length()) {
            return "";
        }
        String smallAns = reverseString(s, index + 1);
        char ch = s.charAt(index);
        return smallAns + ch;
    }

    // Remove occurence without passing index
    static String removeOccurence1(String s) {
        if (s.length() == 0) {
            return " ";
        }
        String smallAns = removeOccurence1(s.substring(1));
        char currentCharacter = s.charAt(0);
        if (currentCharacter == 'a') {
            return smallAns;
        } else {
            return currentCharacter + smallAns;
        }
    }

    // Remove occurence with passing index
    static String removeOccurence(String s, int n, int index) {
        if (index >= n) {
            return " ";
        }
        String smallAns = removeOccurence(s, n, index + 1);
        char currentCharacter = s.charAt(index);
        if (currentCharacter == 'a') {
            return smallAns;
        } else {
            return currentCharacter + smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // Itterative approach of remove occurence
        // String s="Suraj";
        // String ans="";
        // for(int i=0;i<s.length();i++){
        // if(s.charAt(i)!='a'){
        // ans+=s.charAt(i);
        // }
        // }
        // System.out.println(ans);

        // String s = sc.nextLine();
        // int n = s.length();
        // int index = 0;
        // String ans = removeOccurence(s, n, index);
        // System.out.println(ans);

        // String s=sc.nextLine();
        // String ans1=removeOccurence1(s);
        // System.out.println(ans1);

        // String s=sc.nextLine();
        // int index=0;
        // String ans2=reverseString(s,index);
        // System.out.println(ans2);

        // String s=sc.nextLine();
        // String ans=reverseString1(s);
        // System.out.println(ans);

        // // Palindrome or not
        // String s=sc.nextLine();
        // String rev=reverseString1(s);
        // if(s.equals(rev)){
        // System.out.println("Yes");// using format printf("%s is palindrome",s)
        // }else{
        // System.out.println("No");
        // }

        // String s = sc.nextLine();
        // boolean ans = palindrome(s, 0, s.length() - 1);
        // System.out.println(ans);

    }
}
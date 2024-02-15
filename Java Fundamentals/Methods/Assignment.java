import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        // // Assignment 1
        // Average obj = new Average();
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println(obj.avg(a, b, c));

        // // Assignment 2--Generating error
        // Scanner sc=new Scanner(System.in);
        // String a=sc.nextLine();
        // System.out.println(count(a));

        // // Assignment 3
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // middle m = new middle();
        // System.out.println(m.is_middle(s));

        // // Assignment 4
        // Scanner scn = new Scanner(System.in);
        // int year = scn.nextInt();
        // LeapYear obj = new LeapYear();
        // System.out.println(obj.is_leapYear(year));

        // // Assignment 5
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // // without math operator
        // Smallest scn = new Smallest();
        // scn.small(a, b, c);
        // // with math operator
        // Small scnn = new Small();
        // System.out.println(scnn.smallest(a, b, c));

    }

}

// Assignment 1-Average of 3 numbers
class Average {
    public int avg(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}

// Assignment 2-count vowels in a string
class vowel {
    public static int count(String s) {
        int count = 0;
        for (int i = 1; i <= s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}

// Assignment 3- display middle character
class middle {
    public String is_middle(String s) {
        if (s.length() % 2 == 0) {
            return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);// substring(startindex,endindex)
        } else {
            return s.substring(s.length() / 2, s.length() / 2 + 1);
        }
    }
}

// Assignment 4-leap year or not
class LeapYear {
    public boolean is_leapYear(int num) {
        boolean a = (num % 4 == 0);
        boolean b = ((num % 100 == 0) && (num % 400 == 0));
        boolean c = (num % 100 != 0);
        return (a && (b || c));
    }
}

// Assignment 5- smallest of 3 numbers
class Smallest {
    public void small(int a, int b, int c) {
        if ((a < b) && (a < c)) {
            System.out.println(a);
        } else if ((b < a) && (b < c)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

// Assignment 5 method 2
class Small {
    public int smallest(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}

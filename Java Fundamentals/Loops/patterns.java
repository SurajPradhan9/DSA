import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // Ascii Range
        // for (int i = 65; i < 95; i++) {
        // char ch = (char) i;
        // System.out.println(i + " " + ch);
        // }

        // // Individual word ascii number
        // String name = sc.nextLine();
        // for (int i = 0; i < name.length(); i++) {
        // char ch = name.charAt(i);
        // int asci = ch;
        // System.out.println("\'" + ch + "\'" + ":" + asci);
        // }

        // // Quadratic Equation
        // // value of the constants a, b, c
        // double a = 7.2, b = 5, c = 9;
        // // declared the two roots
        // double firstroot, secondroot;
        // // determinant (b^2 - 4ac)
        // double det = b * b - 4 * a * c;
        // // check if determinant is greater than 0
        // if (det > 0) {
        // // two real and distinct roots
        // firstroot = (-b + Math.sqrt(det)) / (2 * a);
        // secondroot = (-b - Math.sqrt(det)) / (2 * a);
        // System.out.format(
        // "First Root = %.2f and Second Root = %.2f",
        // firstroot, secondroot);
        // }
        // // check if determinant is equal to 0
        // else if (det == 0) {
        // // two real and equal roots
        // // determinant is equal to 0
        // // so -b + 0 == -b
        // firstroot = secondroot = -b / (2 * a);
        // System.out.format(
        // "First Root = Second Root = %.2f;",
        // firstroot);
        // }
        // // if determinant is less than zero
        // else {
        // // roots are complex number and distinct
        // double real = -b / (2 * a);

        // double imaginary = Math.sqrt(-det) / (2 * a);

        // System.out.printf("First Root = %.2f+%.2fi",
        // real, imaginary);
        // System.out.printf("\nSecond Root = %.2f-%.2fi",
        // real, imaginary);
        // }

        // Assignment Q8
        // Assignment Q7
        // Assignment Q6
        // Assignment Q5

        // Assignment Q10
        // Assignment Q9-prime number can be expressed as sum of 2 prime numbers

        // // Assignment Q4-armstrong num from 1 to n
        System.out.println("until u want to print:");
        int n = sc.nextInt();
        int num = 1;
        while (num <= n) {
            int count = 0;
            int i = num;
            while (i > 0) {
                count++;
                i /= 10;
            }
            int val = num; // store value of current num in a temporary variable to calculate sum of its
                           // digits
            int sum = 0;
            while (val > 0) { // break the number digit by digit until it reaches 0
                int digit = val % 10;
                sum += Math.pow(digit, count);// add cube of digit to sum
                val /= 10;
                if (sum > val) { // if sum has exceeded our current number, there is no way
                    // for it
                    // to be an Armstrong number
                    continue;
                }
            }
            if (sum == num) { // this is an armstrong number
                System.out.println(num);
            }
            num++;
        }

        // // Armstrong Number
        // System.out.println("Enter number:");
        // int num=sc.nextInt();
        // int sum=0;
        // int b=num;
        // while(num!=0){
        // int res=num%10;
        // int ans=res*res*res;
        // sum=sum+ans;
        // num=num/10;
        // }
        // if(b==sum){
        // System.out.println("Armstrong Number");
        // }else{
        // System.out.println("NOt a armstrong Number");
        // }

        // // Assignment 3 Factorial
        // System.out.println("enter number:");
        // int num = sc.nextInt();
        // int fact = 1;
        // for (int i = 1; i <= num; i++) {
        // fact = fact * i;
        // }
        // System.out.println(fact);

        // // Assignment 2
        // int sum = 0;
        // while (sc.hasNextInt()) {
        // int num = sc.nextInt();
        // if (num >=0) {
        // sum = sum + num;
        // } else {
        // sum=-1;
        // break;
        // }
        // }
        // System.out.println(sum);

        // // Fibonacci sreries - My approach
        // System.out.println("enter number:");
        // int num=sc.nextInt();
        // int a=0;
        // System.out.println(a);
        // int b=1;
        // System.out.println(b);
        // for(int i=1;i<=num-2;i++)
        // {
        // int c=a+b;
        // System.out.println(c);
        // a=b;
        // b=c;
        // }

        // // Assignment Q1- Fibonacci Series
        // System.out.println("enter number:");
        // int num = sc.nextInt();
        // int a = 1;
        // int b = 1;
        // int sum;
        // for (int i = 1; i <= num; i++) {
        // sum = a + b;
        // System.out.println(a);
        // a = b;
        // b = sum;
        // }

        // // // Hollow Triangular` Pyramid ---wrong
        // System.out.println("enter rows:");
        // int r = sc.nextInt();
        // for (int i = 1; i <= r; i++) {
        // for (int j = 1; j <= r - i; j++) {//print space
        // System.out.print(" ");
        // }
        // for (int k = i; k <= i; k++) {//print first word
        // System.out.print(k);
        // }
        // for (int v = 1; v <= (2 * i - 2); v++) {
        // if (i == 1 || i == r) {
        // System.out.print(i);
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // Numerical Pyramid Pattern
        // System.out.println("Enter rows:");
        // int r = sc.nextInt();
        // for (int i = 1; i <= r; i++) {
        // for (int j = 1; j <= r - i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print(k);
        // }
        // for (int v = i - 1; v >= 1; v--) {
        // System.out.print(v);
        // }
        // System.out.println();
        // }

        // // Numerical Triangular pattern
        // System.out.println("enter rows:");
        // int r=sc.nextInt();
        // for(int i=1;i<=r;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // // Numerical Rectangular Pattern Type 4
        // System.out.println("Enter rows:");
        // int r = sc.nextInt();
        // System.out.println("Enter coloumns:");
        // int c = sc.nextInt();
        // for (int i = 1; i <= r; i++) {
        // for (int j = 1; j <= c; j++) {
        // if ((i + j) % 2 == 0) {
        // System.out.print("1");
        // } else {
        // System.out.print("2");
        // }
        // }
        // System.out.println();
        // }

        // // Numrical Rectangular patttern Type3
        // System.out.println("enter rows:");
        // int r = sc.nextInt();
        // System.out.println("Enter coloums:");
        // int c = sc.nextInt();
        // for (int i = 1; i <= r; i++) {
        // for (int j = 1; j <= c; j++) {
        // if (i == 1 || i == r || j == 1 || j == c) {
        // System.out.print(j);
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // Numerical Rectangular Pattern type 2
        // System.out.println("Enter rows:");
        // int r = sc.nextInt();
        // System.out.println("enter coloums:");
        // int c = sc.nextInt();
        // for (int i = 1; i <= r; i++) {
        // for (int j = 1; j <= c; j++) {
        // System.out.print(j);
        // }
        // System.out.println();

        // }

        // // Numerical Rectangular Pattern Type 1
        // System.out.println("Enter rows:");
        // int r = sc.nextInt();
        // for (int i = 1; i <= r; i++) {
        // for (int j = i; j <= r; j++) {
        // System.out.print(j);
        // }
        // for (int k = 1; k <= i - 1; k++) {
        // System.out.print(k);
        // }
        // System.out.println();
        // }

        // // pyramid pattern
        // System.out.println("Enter rows:");
        // int r = sc.nextInt();
        // for (int i = 1; i <= r; i++)// traversing over rows
        // {
        // for (int j = 1; j <= r - i; j++)// printing spaces
        // {
        // System.out.print(" ");

        // }
        // for (int k = 1; k <= (2 * i - 1); k++)// printing star
        // {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // // Inverted Triangular Pattern Method 2
        // System.out.println("Enter rows:");
        // int r=sc.nextInt();
        // for(int i=r;i>=1;i--){
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // Inverted Triangular Pattern-method 1
        // System.out.println("Enter rows:");
        // int r = sc.nextInt();
        // for (int i = 1; i <= r; i++) {
        // for (int j = 1; j <= (r + 1 - i); j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // Triangular Pattern
        // System.out.println("Enter rows:");
        // int r = sc.nextInt();
        // for (int i = 1; i <= r; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // hollow Rectangular pattern
        // System.out.println("Enter rows:");
        // int r = sc.nextInt();
        // System.out.println("Enter coloums:");
        // int c = sc.nextInt();
        // for (int i = 1; i <= r; i++) {
        // for (int j = 1; j <= c; j++) {
        // if (i == 1 || i == r || j == 1 || j == c) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // Rectangular Pattern
        // System.out.println("Enter rows:");
        // int r=sc.nextInt();
        // System.out.println("Enter coloumns:");
        // int c=sc.nextInt();
        // for(int i=1;i<=r;i++){
        // for(int j=1;j<=c;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // Nested Loop Working
        // for (int i = 1; i <= 3; i++) {
        // for (int j = 1; j <= 3; j++) {
        // System.out.println(i + " " + j);
        // }
        // System.out.println();
        // }

    }

}

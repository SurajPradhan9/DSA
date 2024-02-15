import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pdf question
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }

        // Assignment 6
        System.out.println("Enter marks:");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("A+");
        } else if (marks >= 80) {
            System.out.println("A");
        } else if (marks >= 70) {
            System.out.println("B+");
        } else if (marks >= 60) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C");
        } else if (marks >= 40) {
            System.out.println("D");
        } else if (marks >= 30) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }

        // Assignment Q5
        System.out.println("Enter operator");
        char operator = sc.next().charAt(0);
        System.out.println("Enter numbers:");
        int number_1 = sc.nextInt();
        int number_2 = sc.nextInt();
        int result1;
        switch (operator) {
            case '+':
                result1 = number_1 + number_2;
                System.out.println(result1);
                break;
            case '-':
                result1 = number_1 - number_2;
                System.out.println(result1);
                break;
            case '*':
                result1 = number_1 * number_2;
                System.out.println(result1);
                break;
            case '/':
                result1 = number_1 / number_2;
                System.out.println(result1);
                break;
            default:
                System.out.println("Invalid Operator");

        }

        // Assignment Q4
        System.out.println("enter numberr:");
        int numberrr = sc.nextInt();
        if (numberrr < 0) {
            System.out.println("The number is negative and skipped");
        } else {
            System.out.println(numberrr);
        }

        // Assignment Q3
        System.out.println("enter selling price:");
        int sell = sc.nextInt();
        System.out.println("enter cost price:");
        int cost = sc.nextInt();

        if (sell > cost) {
            int profit = sell - cost;
            System.out.println("profit:" + profit);
        } else {
            int loss = cost - sell;
            System.out.println("loss:" + loss);
        }

        // Assignment Q2
        System.out.println("enter number:");
        int numm = sc.nextInt();
        if (numm < 0) {
            numm = numm * -1;
        }
        System.out.println(numm);

        // Assignment Q1
        System.out.println("enter length:");
        int length = sc.nextInt();
        System.out.println("enter breadth:");
        int breadth = sc.nextInt();
        if (length == breadth) {
            System.out.println("Square");
        } else {
            System.out.println("not a square");
        }

        // Switch case
        System.out.println("Enter day:");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid Day Number");
        }

        // Fizz-Buzz
        System.out.println("Enter number:");
        int numberr = sc.nextInt();
        if (numberr % 3 == 0 && numberr % 5 == 0) {
            System.out.println("FIzz-Buzz");
        } else if (numberr % 3 == 0) {
            System.out.println("Fizz");
        } else if (numberr % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(numberr);
        }

        // Divisible by 3 or 5
        System.out.println("enter value :");
        int value = sc.nextInt();
        if (value % 3 == 0 || value % 5 == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println("Not Divisible");
        }

        // ternary Operator
        System.out.println("Enter n:");
        int n = sc.nextInt();
        String result = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);

        // even and divisible by 3
        System.out.println("enter Number:");
        int number = sc.nextInt();
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("divisible");
        } else {
            System.out.println("Not Divisible");
        }

        // Maximum of 3 numbers
        System.out.println("enter Number 1:");
        int num1 = sc.nextInt();
        System.out.println("enter Number 2:");
        int num2 = sc.nextInt();
        System.out.println("enter Number 3:");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Num1 is Greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Num2 is Greater");
        } else {
            System.out.println("Num3 is Greater");
        }

        // if elseif else
        System.out.println("Enter age:");
        int age = sc.nextInt();
        if (age < 12) {
            System.out.println("Child");
        } else if (age >= 12 && age <= 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }

        // Even-Odd
        System.out.println("Enter number:");
        int num = sc.nextInt();
        if (num % 2 != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
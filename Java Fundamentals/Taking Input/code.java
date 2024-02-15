import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read characters
        System.out.println("enter Name:");
        char ch = sc.next().charAt(2);
        System.out.println(ch);

        // Assignment Q5
        while (sc.hasNextLine()) {
            String line1 = sc.next();
            String line2 = sc.next();
            System.out.println(line1.concat(line2));
        }

        // Assignment Q4
        System.out.println("No of test cases:");
        int t = sc.nextInt();
        System.out.println("enter numbers to be added:");
        for (int i = 1; i <= t; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int sum = n1 + n2;
            System.out.println("sum:" + sum);
        }

        // Assignment Q3
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        int total = marks1 + marks2 + marks3;
        int percentage = (total) / 3;
        System.out.println("total:" + total);
        System.out.println("Percentage:" + percentage + "%");

        // Assignment Q2
        String name1 = sc.next();
        String name2 = sc.next();
        System.out.print(name1);
        System.out.println(name2);
        String a = sc.next();
        String b = sc.next();
        String ans = a.concat(b);
        System.out.println(ans);

        // Assignment Q1
        String firstName = sc.next();
        String lastName = sc.next();
        int rollno = sc.nextInt();
        String interest = sc.next();
        System.out.println("Name is:" + firstName + " " + lastName);
        System.out.println("Roll no is:" + rollno);
        System.out.println("Field of Interest:" + interest);

        // Simple Interest
        System.out.println("Enter princiapl Amount");
        float p = sc.nextFloat();
        System.out.println("enter Time:");
        float time = sc.nextFloat();
        System.out.println("Enter Interest");
        float r = sc.nextFloat();
        double simple_interest = (p * time * r) / 100;
        System.out.println(simple_interest);

        // // Addition of 2 numbers -integer type
        // System.out.println("Enter number1:");
        // int num1=sc.nextInt();
        // System.out.println("Enter number2:");
        // int num2=sc.nextInt();
        // int summ=num1+num2;
        // System.out.println(summ);

        // Addition of 2 numbers-float type
        System.out.println("Enter first number:");
        float num_1 = sc.nextFloat();
        System.out.println("Enter second number:");
        float num_2 = sc.nextFloat();
        double sum = num_1 + num_2;
        System.out.println("Sum is " + sum);

        // // String input
        // System.out.println("Enter name:");
        // String name1=sc.nextLine(); //print after space
        // System.out.println("name is:" +name1);

        // Integer Input
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        System.out.println("number is :" + num);

        // String Input
        System.out.println("Enter name:");
        String name = sc.next(); // Doesnt print after space
        System.out.println("name is:" + name);

    }

}

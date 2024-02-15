import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // print first multiple of 5 which is also multiple of 7
        // for(int i=1;;i++){
        // if(i%5==0 && i%7==0){
        // System.out.println(i);
        // break;
        // }
        // }

        // // tell if the number in the input is prime or not
        // System.out.println("enter number:");
        // int num = sc.nextInt();
        // int count = 0;
        // for (int i = 1; i <= num; i++) {
        // if (num % i == 0) {
        // count++;
        // }
        // }
        // if (count == 2) {
        // System.out.println(num);
        // } else {
        // System.out.println("Not a prime Number");
        // }

        // // print all factors of the number in the input
        // System.out.println("enter number:");
        // int num=sc.nextInt();
        // for(int i=1;i<=num;i++){
        // if(num%i==0){
        // System.out.println(i);
        // }
        // }

        // // factorial
        // System.out.println("enter number:");
        // int num=sc.nextInt();
        // int fact=1;
        // for(int i=1;i<=num;i++){
        // fact=fact*i;
        // }
        // System.out.println(fact);

        // // Sum of first 10 natural numbers using do-while loop
        // int sum=0;
        // int i=1;
        // do{
        // sum=sum+i;
        // System.out.println(sum);
        // i++;
        // }while(i<=10);

        // // fizzbuzz
        // System.out.println("Enter number:");
        // int num=sc.nextInt();
        // for(int i=1;i<=num;i++)
        // {
        // if(i%3==0 && i%5==0)
        // {
        // System.out.println("FizzBUzz");
        // }
        // else if(i%3==0)
        // {
        // System.out.println("Fizz");
        // }
        // else if(i%5==0)
        // {
        // System.out.println("Buzz");
        // }
        // else{
        // System.out.println(i);
        // }

        // }

        // // MCQ
        // int a=1;
        // while(a<4){
        // System.out.println(a+" ");
        // a++;
        // }

        // // using labels
        // // print all the values between 1 to 50 expect multiples of 3 using while
        // loop
        // int i=1;
        // myloop:while(i<=50){
        // if(i%3==0){
        // i++;//difference between for and while
        // continue myloop;
        // }
        // System.out.println(i);
        // i++;
        // }

        // print all the values between 1 to 50 expect multiples of 3 using while loop
        int i = 1;
        while (i <= 50) {
            if (i % 3 == 0) {
                i++;// difference between for and while
                continue;
            }
            System.out.println(i);
            i++;
        }

        // // print all the values between 1 to 50 expect multiples of 3 using for loop
        // for (int i = 1; i <= 50; i++) {
        // if (i % 3 == 0) {
        // continue;
        // }
        // System.out.println(i);
        // }

        // // print first multple of 5 which is also multiple of 7 ----- PW approach
        // int num=1;
        // while(true){
        // if(num%5==0 && num%7==0){
        // System.out.println(num);
        // break;
        // }
        // num++;
        // }

        // // print first multple of 5 which is also multiple of 7 ----- My appproach
        // for(int i=5; ; i+=5)
        // {
        // if(i%7==0)
        // {
        // System.out.println(i);
        // break;

        // }
        // }

        // // print the sum of stream of integers using do while
        // System.out.println("enter number:");
        // int num=sc.nextInt();
        // int sum=0;
        // do{
        // sum=sum+num;
        // num=sc.nextInt();
        // }while(num!=-1);
        // System.out.println(sum);

        // // Print the sum of stream of integers using break statement
        // System.out.println("enter number:");
        // int num=sc.nextInt();
        // int sum=0;
        // while(true){
        // sum=sum+num;
        // num=sc.nextInt();
        // if(num==-1){
        // break;
        // }
        // }
        // System.out.println(sum);

        // print the sum of stream of integers
        // System.out.println("Enter number:");
        // int num=sc.nextInt();
        // int sum=0;
        // while(num!=-1){
        // sum=sum+num;
        // num=sc.nextInt();
        // }
        // System.out.println(sum);

        // // do while
        // int num=2;
        // do{
        // System.out.println(num);
        // num++;
        // }while(num<2);

        // // print in reverse order
        // System.out.println("enter number:");
        // int num=sc.nextInt();
        // for(int i=num;i>=1;i=i-2)
        // {
        // System.out.println(i);

        // }

        // // sum of n natural numbers
        // System.out.println("Enter number:");
        // int num=sc.nextInt();
        // int sum=0;
        // for(int i=1;i<=num;i++)
        // {
        // sum=sum+i;
        // }
        // System.out.println(sum);

        // // Sum of square of n natural numbers using formula
        // System.out.println("Enter number:");
        // int n=sc.nextInt();
        // int sum=(n*(n+1)*(2*n+1))/6;
        // System.out.println(sum);

        // // Sum of n natural numbers using formula
        // System.out.println("Enter number:");
        // int n=sc.nextInt();
        // int summ=(n*(n+1))/2;
        // System.out.println(summ);

        // // Sum of n natural numbers
        // System.out.println("enter number:");
        // int num=sc.nextInt();
        // int sum=0;
        // int j =1;
        // while(j<=num){
        // sum=sum+j;
        // j++;
        // }
        // System.out.println(sum);

        // // print 1 to n natural numbers
        // System.out.println("Enter number:");
        // int numm=sc.nextInt();
        // int i=1;
        // while(i<=numm)
        // {
        // System.out.println(i);
        // i++;
        // }
    }
}
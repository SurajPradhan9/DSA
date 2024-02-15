import java.util.*;

public class Main {
    public static void main(String[] args) {

        // // Add 2 Numbers
        // Alegebra obj = new Alegebra();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a value:");
        // int a = sc.nextInt();
        // System.out.println("Enter b value:");
        // int b = sc.nextInt();
        // int sum = obj.add(a, b);
        // System.out.println("sum:" + sum);

        // //Standard library functions-sqrt,floor,ceil,pow return double datatype
        // System.out.println(Math.sqrt(24));
        // System.out.println(Math.sqrt(16));
        // System.out.println(Math.floor(5.3));
        // System.out.println(Math.floor(5.8));
        // System.out.println(Math.ceil(5.3));
        // System.out.println(Math.ceil(5.8));
        // System.out.println(Math.pow(5,2));//a^b
        // System.out.println(Math.pow(4,0.5));

        // Constructor - it is special type of method which is used to initialize
        // objects & class name and constructor name should be same & it has no return
        // type

        // Packages -it is a collection of similar classes subpackages and interfaces

        // Static keyword is non access specifier we can call without creating object if
        // we use static keyword while creating methods

        // Parametarized constructor
        Alegebra obj1 = new Alegebra(5, 7);
        int sum = obj1.add();
        int sub = obj1.subtract();
        int product = obj1.multiply();
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(product);
        Alegebra obj2 = new Alegebra(2, 4);
        int sum1 = obj2.add();
        int sub1 = obj2.subtract();
        int product1 = obj2.multiply();
        System.out.println(sum1);
        System.out.println(sub1);
        System.out.println(product1);

    }
}

// Add 2 Numbers
class Alegebra {

    // // Add 2 numbers
    // public int add(int a, int b) {
    // int ans = a + b;
    // return ans;
    // }

    // // Creating own constructor
    // Alegebra(){
    // System.out.println("constructor of alegebra class is called");
    // }

    // Parametarized Constructor // Comment this and uncomment above 2 codes or
    // comment above 2 codes and uncomment this
    int a, b;

    Alegebra(int x, int y) {
        System.out.println("Constructor of ALegebra class called");
        a = x;
        b = y;
    }

    int add() {
        return a + b;
    }

    int subtract() {
        return a - b;
    }

    int multiply() {
        return a * b;
    }

}
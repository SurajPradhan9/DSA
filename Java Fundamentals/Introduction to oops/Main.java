import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // Assignment 1
        // Student obj=new Student();
        // System.out.println("Enter name:");
        // obj.name=sc.next();
        // System.out.println("Enter RollNo:");
        // obj.rollNo=sc.nextInt();
        // System.out.println("Name is:"+obj.name);
        // System.out.println("rollNo is:"+obj.rollNo);

        // // Assignment 2
        // Triangle obj=new Triangle();
        // int a=3,b=4,c=5;
        // System.out.println(obj.Area(a,b,c));
        // System.out.println(obj.Perimeter(a,b,c));

        // // Assignment 3
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // Area obj = new Area(a, b);
        // System.out.println(obj.AreaofRectangle());

        // // Assignment 5
        // Employee obj1 = new Employee();
        // obj1.name = "suraj";
        // obj1.YOJ = 9104;
        // obj1.salary = 100000;
        // obj1.address = "HYD";
        // Employee obj2 = new Employee();
        // obj2.name = "Vaishnavi";
        // obj2.YOJ = 9104;
        // obj2.salary = 100000;
        // obj2.address = "HYD";
        // System.out.println("Name" + "\t" + "Year of Joining" + "\t" + "Salary" + "\t"
        // + "Address");
        // System.out.println(obj1.name + "\t" + obj1.YOJ + "\t" + obj1.salary
        // + "\t" + obj1.address);
        // System.out.println(obj2.name + "\t" + obj2.YOJ + "\t" + obj2.salary
        // + "\t" + obj2.address);

        // // employees Problem
        // System.out.println("enter no of employees");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // System.out.println("Enter name of employee " + i + ":");
        // String name = sc.next();
        // System.out.println("Enter Year of joining of employee " + i + ":");
        // int yearOfJoining = sc.nextInt();
        // System.out.println("Enter Address of employee " + i + ":");
        // String Address = sc.next();
        // Employeee obj = new Employeee();
        // obj.employee1(name, yearOfJoining, Address);
        // }

        // // Assignment 4
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter real part of complexNO 1:");
        // int real1 = sc.nextInt();
        // System.out.println("Enter Imaginary part of complexNo 1:");
        // int img1 = sc.nextInt();
        // System.out.println("Enter real part of complexNO 2:");
        // int real2 = sc.nextInt();
        // System.out.println("Enter Imaginary part of complexNo 2:");
        // int img2 = sc.nextInt();
        // Complex c = new Complex(real1, img1);
        // Complex d = new Complex(real2, img2);
        // Complex e = Complex.Add(c, d);
        // Complex f = Complex.subtract(c, d);
        // Complex g = Complex.product(c, d);
        // e.print();
        // f.print();
        // g.print();

    }
}

// // Assignement 4
// class Complex {
// int real;
// int img;

// public Complex(int r, int i) {
// real = r;
// img = i;
// }

// public static Complex Add(Complex a, Complex b) {
// return new Complex((a.real + b.real), (a.img + b.img));
// }

// public static Complex subtract(Complex a, Complex b) {
// return new Complex((a.real - b.real), (a.img - b.img));
// }

// public static Complex product(Complex a, Complex b) {
// return new Complex(((a.real * b.real) - (a.img * b.img)), ((a.real * b.img) +
// (a.img * b.real)));
// }

// public void print() {
// if (real == 0 && img != 0) {
// System.out.println(img);
// } else if (real != 0 && img == 0) {
// System.out.println(real);
// } else {
// System.out.println(real + "+" + img + "i");
// }
// }
// }

// Assignment 1
class Student {
    String name;
    int rollNo;
}

// Assignment 2
class Triangle {
    public double Perimeter(int a, int b, int c) {
        return (a + b + c) / 2.0;
    }

    public double Area(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

// Assignment 3
class Area {
    int length;
    int breadth;

    Area(int x, int y) {
        length = x;
        breadth = y;
    }

    public int AreaofRectangle() {
        int area = length * breadth;
        return area;
    }
}

// Assignment 5
class Employee {
    String name;
    int YOJ;
    int salary;
    String address;
}

// employyes problem
class Employeee {
    public void employee1(String name, int YOJ, String address) {
        System.out.println(name + " " + YOJ + " " + address);
    }
}
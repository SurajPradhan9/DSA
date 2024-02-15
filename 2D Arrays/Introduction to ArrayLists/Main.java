import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // // Wrapper Class
        // Integer i = Integer.valueOf(4); // we can also write Integer i=new
        // Integer(4);The constructor Integer(int) has
        // // been deprecated since version 9 and marked for removal so we are using new
        // method
        // System.out.println(i);
        // float a = Float.valueOf(9.0f);
        // System.out.println(a);
        // // from above statements we can also write int a=4 but we are writing in
        // terms
        // // of classes and objects because Java is Object oriented programming
        // language so
        // // if we are writing int a =4 it is a normal variable which is voilating the
        // // principal of OOPs to overcome or replace this we are using wrapper class
        // // 1. Java is object oriented language so if we are using wrapper class we
        // are
        // // writing object oriented code instead of using Primitive dataTypes
        // // 2.in java.util package we are using some classes like Scanner etc this
        // // classes work on Objects instead of working with primitive datatypes
        // // 3. in collectiom frameworks we are having datastructures like arraylist
        // stack
        // // queue these datastructures store objects instead of storing primitive
        // // datatypes , if we want some data to store in this it cannot be PDT it
        // should
        // // be object , so we are wrapping the PDT in objects and pass it so wrapper
        // classes are used
        // Wrapper class is present java.lang package i.e java.lang.Integer inbuilt

        // How to declare an ArrayList
        ArrayList<Integer> l1 = new ArrayList<>();

        // ArrayList<Boolean> l2=new ArrayList<Boolean>(null);

        // ArrayList<Float> l3=new ArrayList<>(5);

        // ADD NEW Element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // Get an element at index i
        System.out.println(l1.get(1));// 6

        // print with for loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        // Printing the ArrayList Directly
        System.out.println(l1); // [5,6,7,8]

        // Adding element at index i
        l1.add(1, 100);
        System.out.println(l1);// [5,100,6,7,8]

        // Modifying element at index i
        l1.set(1, 10);
        System.out.println(l1);

        // removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        // removing an element e
        System.out.println(l1.remove(Integer.valueOf(10)));

        // checking if element exists
        System.out.println(l1.contains(Integer.valueOf(6)));

        // if you dont specify class you can put anything in the list- during arrays
        // case they
        // are homogenous but in Arraylist case they are not homogenous
        ArrayList l = new ArrayList();
        l.add("SURAJ");
        l.add(9);
        l.add(9.0f);
        System.out.println(l);

    }
}
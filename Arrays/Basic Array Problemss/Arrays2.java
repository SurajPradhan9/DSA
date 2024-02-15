import java.util.Scanner;

public class Arrays2 {
    // Print Array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Change Array for 4 question
    public static void changeArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    // change Variable for 4 question
    public static void changeVal(int a) {
        a = 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Taking Input array and printing array
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The original Array elements are:");
        printArray(arr);

        // // 2.Array reference copying arr elements to arr2
        // int[] arr_2 = arr;
        // System.out.println("The copied array elements are:");
        // printArray(arr_2);
        // arr_2[0] = 9;
        // arr_2[3] = 90;
        // System.out.println("original Array elements after changing Array 2:");
        // printArray(arr);
        // System.out.println("copied Array elements after changing Array 2");
        // printArray(arr_2);
        // // After changing array 2 the values of original array also changes because
        // arr2
        // // and arr in stack are referencing to same address in heap so after changing
        // // arr2 ,arr also changes this is also known as shallow copying
        // // To prevent this use below method

        // 3.copying arr elements to arr2 using arr.clone() method because after
        // changing the values of arr2 ,arr doesnt change in this inbuilt function the
        // actual array and reference array both are pointing to different memory
        // address this is also known as
        // deep copy (to uncomment 3. we should comment 2 ,1. should be uncomment for
        // both 2 and 3)
        int[] arr_2 = arr.clone(); // or use Arrays.copyOf(the array we want to
        // copy eg:arr,length of required array eg: arr.length) or use
        // Arrays.copyOfRange(the array we want
        // to copy eg: arr ,start index eg: 0,end index eg: 2)
        System.out.println("The copied array elements are:");
        printArray(arr_2);
        arr_2[0] = 9;
        arr_2[3] = 90;
        System.out.println("original Array elements after changing Aarray 2:");
        printArray(arr);
        System.out.println("copied Array elements after changing Array 2");
        printArray(arr_2);

        // // 4.pass by value difference in array and normal variable(Comment 1 2 3 to
        // // uncomment 4)
        // System.out.println("Enter How many elements:");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // arr[0] = 2;
        // arr[1] = 4;
        // arr[2] = 6;
        // System.out.println("IN ARRAYS-value changes after Initializing to zero:");
        // changeArray(arr);
        // printArray(arr);
        // // we know that in java we use pass by value so actual value
        // // doesnt change even after changing the value in method
        // // In arrays after changing the value in Methods(in class) the Original Array
        // // values also changes because it makes the reference variable copy not the
        // heap memory ,the original array and the method array is pointing to same
        // memory address .after changeArray FunctionCall , in stack it removes the
        // Function
        // so the actual value changes because in heap the data is already changed

        // // In variables the value doesnt change even after changing the value because
        // // it makes the reference copy of a variable in stack so the referenced
        // variable
        // // value will be changed & the actual value will be same(primitive datatype
        // // values are made in stack not in heap)
        // System.out.println("IN Variables:");
        // int a = 2;
        // changeVal(a);
        // System.out.println("value doesnt change even after initializing to 0:" + a);

    }
}

import java.util.Scanner;

public class Main {

    // Multiplication of Two Matrices

    public static void multiplyTwoMatrices(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication is not possible- wrong Dimension");
            return;
        }

        int multiply[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {// k<r2
                    /*
                     * multiply[][]= ith row of matrix a * ith column of matrix b
                     */
                    multiply[i][j] = multiply[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multilpication of 2 matrices is:");
        print(multiply);
    }

    // Addition of Two MATRICES
    public static void addTwoMatrices(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Enter equal no of rows and columns");
            return; // it breaks the
        }
        int sum[][] = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        print(sum);
    }

    // print 2D Array
    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // Initialization of 2D Arrays- method 1 & taking input of 2D Array
        // System.out.println("Enter number of rows:");
        // int r=sc.nextInt();
        // System.out.println("Enter number of columns:");
        // int c=sc.nextInt();
        // int[][] arr = new int[r][c];
        // System.out.println("Enter "+r*c+" elements:");
        // for(int i=0;i<r;i++){
        // for(int j=0;j<c;j++){
        // arr[i][j]=sc.nextInt();
        // }
        // }
        // print(arr);

        // // Initialization of 2D Arrays- method 2 & printing of 2D Array
        // int[][] arr2 = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
        // print(arr2);

        // // Addition of 2 Matrices
        // System.out.println("enter no of rows of Matrix A");
        // int r1=sc.nextInt();
        // System.out.println("enter no of columns of Matrix A");
        // int c1=sc.nextInt();
        // int [][] a=new int[r1][c1];
        // System.out.println("enter "+r1*c1+" columns");
        // for(int i=0;i<r1;i++){
        // for(int j=0;j<c1;j++){
        // a[i][j]=sc.nextInt();
        // }
        // }

        // System.out.println("enter no of rows of Matrix B");
        // int r2=sc.nextInt();
        // System.out.println("enter no of columns of Matrix B");
        // int c2=sc.nextInt();
        // int [][] b=new int[r2][c2];
        // System.out.println("enter "+r2*c2+" columns");
        // for(int i=0;i<r1;i++){
        // for(int j=0;j<c1;j++){
        // b[i][j]=sc.nextInt();
        // }
        // }
        // System.out.println("Matrix A:");
        // print(a);
        // System.out.println("Matrix B:");
        // print(b);
        // addTwoMatrices(a,r1,c1,b,r2,c2);

        // Mulilpication of 2 Matrices
        System.out.println("Enter no of rows of matrix A :");
        int r1 = sc.nextInt();
        System.out.println("Enter no of columns of matrix A :");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("enter " + r1 * c1 + " elements");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter no of rows of matrix B :");
        int r2 = sc.nextInt();
        System.out.println("Enter no of columns of matrix B:");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("enter " + r2 * c2 + " elements");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix A:");
        print(a);
        System.out.println("Matrix B:");
        print(b);

        multiplyTwoMatrices(a, r1, c1, b, r2, c2);

    }
}
import java.util.Scanner;

public class Main {

    static int[][] pascalTriangle(int n) {
        int ans[][] = new int[n][];

        for (int i = 0; i < n; i++) {
            // for ith row there are i+1 columns
            ans[i] = new int[i + 1];
            // first and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }

    static void rotateClockWise(int[][] a, int r, int c) {
        transposeInPlace(a, r, c);
        for (int i = 0; i < a.length; i++) {
            /*
             * reverse each row of transposed matrix
             * 1 2 3 --> a[0] //beacuse we have 2d array
             * 4 5 6 --> a[1] // a[0] -> rev({1,2,3})
             * 7 8 9 --> a[2]
             */
            reverse(a[i]);
        }
    }

    static void reverse(int[] a) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    static int[][] transposeMatrix(int[][] a, int r, int c) {
        int ans[][] = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = a[j][i];
            }
        }
        return ans;

    }

    static void transposeInPlace(int a[][], int r, int c) { // it is valid only for same dimensions
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                // Swap[i][j],[j][i]
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }

    static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // problem 1- Transpose of a Matrix
        // System.out.println("Enter number of rows and columns in a Matrix:");
        // int r = sc.nextInt();
        // int c = sc.nextInt();
        // int a[][] = new int[r][c];
        // int totalElements = r * c;
        // System.out.println("enter " + totalElements + " values");
        // for (int i = 0; i < r; i++) {
        // for (int j = 0; j < c; j++) {
        // a[i][j] = sc.nextInt();
        // }
        // }
        // System.out.println("Matrix elements are:");
        // print(a);

        // System.out.println("The Transpose of Matrix A elements are:");
        // // int ans[][]=transposeMatrix(a,r,c);
        // // print(ans);
        // transposeInPlace(a, r, c);
        // print(a);

        // // Problem 2
        // System.out.println("Enter No of rows and columns:");
        // int r = sc.nextInt();
        // int c = sc.nextInt();
        // int a[][] = new int[r][c];
        // int totalElements = r * c;
        // System.out.println("Enter " + totalElements + " values");
        // for (int i = 0; i < r; i++) {
        // for (int j = 0; j < c; j++) {
        // a[i][j] = sc.nextInt();
        // }
        // }

        // System.out.println("Input elements are:");
        // print(a);

        // System.out.println("close wise direction 90 degree matrix A is:");
        // rotateClockWise(a, r, c);
        // print(a);

        // Problem 3 - Pascal Triangle
        System.out.println("Enter n value:");
        int n = sc.nextInt();
        int ans[][] = pascalTriangle(n);
        print(ans);

    }
}
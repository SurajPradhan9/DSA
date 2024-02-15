import java.util.Scanner;

public class Main {

    // For method 2 (comment traverse vertically part) and for 3 uncomment both
    static void prefixSumMatrix(int[][] a) {
        // calculate row wise and column wise sum
        // a[i][j]=sum of rectangle ({0,0}{i,j})
        int r = a.length;
        int c = a[0].length;
        // traverse horizontally to calculate rowwise sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                a[i][j] = a[i][j] + a[i][j - 1];
            }
        }

        // traverse vertically to Calculate columnwise Sum
        for (int j = 0; j < c; j++) { // fixing column
            for (int i = 1; i < r; i++) { // traversing rows
                a[i][j] = a[i][j] + a[i - 1][j];
            }
        }

    }

    // Problem 1 method 3 Optimized Approach
    static int rectangleSum3(int[][] a, int l1, int r1, int l2, int r2) {
        prefixSumMatrix(a);
        int ans = 0, sum = 0, up = 0, left = 0, leftUp = 0;

        sum = a[l2][r2];
        if (l1 >= 1) {
            up = a[l1 - 1][r2];
        }
        if (r1 >= 1) {
            left = a[l2][r1 - 1];
        }
        if (l1 >= 1 && r1 >= 1) {
            leftUp = a[l1 - 1][r1 - 1];
        }

        ans = sum - up - left + leftUp;
        return ans;
    }

    // Problem 1 method 2 Better Approach
    static int rectangleSum2(int[][] a, int l1, int r1, int l2, int r2) {
        int sum = 0;
        prefixSumMatrix(a);
        for (int i = l1; i <= l2; i++) {
            // r1 to r2 sum for row i
            // we are using if block because if r1-1 represent negative index it doesnt
            // gives answer
            if (r1 >= 1) {
                sum = sum + (a[i][r2] - a[i][r1 - 1]);
            } else {
                sum = sum + (a[i][r2]);// for r1==0
            }

        }
        return sum;

    }

    // Problem 1 Brute Force Approach
    static int rectangleSum(int[][] a, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum = sum + a[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 1- Method 1 sum of rectangle ( Brute Force Approach worst)
        System.out.println("Enter no of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " values:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter rectangle boundaries l1,r1,l2,r2 ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        int sum = rectangleSum(a, l1, r1, l2, r2);
        System.out.println("Rectangle sum:" + sum);

        // // Problem 1 - Method 2 sum of rectangle( pre Calculating the horizontal sum
        // for
        // // each row in the matrix better approach)
        // int sum2 = rectangleSum2(a, l1, r1, l2, r2);
        // System.out.println("Rectangle Sum2:" + sum2);

        // Problem 1- Method 3 sum of rectangle ( optimized and best approach - prefix
        // sum over columns and rows both) for problem 1 method 3 to work comment
        // problem 1 method 2

        int sum3 = rectangleSum3(a, l1, r1, l2, r2);
        System.out.println("RectangleSum3:" + sum3);

    }
}
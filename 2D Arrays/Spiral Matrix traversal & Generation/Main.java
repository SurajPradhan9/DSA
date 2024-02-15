import java.util.Scanner;

public class Main {

    static int[][] generateSpiralMatrix(int n) {
        int ans[][] = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftColumn = 0, rightColumn = n - 1;
        int current = 1;
        while (current <= n * n) {
            // topRow -> leftColumn to rightColumn
            for (int j = leftColumn; j <= rightColumn && current <= n * n; j++) {
                ans[topRow][j] = current;
                current++;
            }
            topRow++;
            // rightColumn -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && current < n * n; i++) {
                ans[i][rightColumn] = current;
                current++;

            }
            rightColumn--;
            // bottomRow -> rightColumn to leftColumn
            for (int j = rightColumn; j >= leftColumn && current < n * n; j--) {
                ans[bottomRow][j] = current;
                current++;

            }
            bottomRow--;
            // leftColumn -> bottomRow to TopRow
            for (int i = bottomRow; i >= topRow && current < n * n; i--) {
                ans[i][leftColumn] = current;
                current++;
            }
            leftColumn++;

        }
        return ans;

    }

    static void printSpiralOrder(int[][] a, int r, int c) {
        int topRow = 0, bottomRow = r - 1, rightColumn = c - 1, leftColumn = 0;
        int totalElements = 0;

        while (totalElements < r * c) {
            // topRow -> leftColumn to rightColumn
            for (int j = leftColumn; j <= rightColumn && totalElements < r * c; j++) {
                System.out.print(a[topRow][j] + " "); // because row is fixed so we wrote topRow and column is traversed
                totalElements++;
            }
            topRow++;
            // rightColumn -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.print(a[i][rightColumn] + " ");// column is fixed row is traversed
                totalElements++;
            }
            rightColumn--;
            // bottomRow -> rightColumn to leftColumn
            for (int j = rightColumn; j >= leftColumn && totalElements < r * c; j--) {
                System.out.print(a[bottomRow][j] + " ");// row is fixed column is traversed
                totalElements++;
            }
            bottomRow--;
            // leftColumn -> bottomRow to TopRow
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                System.out.print(a[i][leftColumn] + " ");// column is fixed row is traversed
                totalElements++;
            }
            leftColumn++;
        }

    }

    static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // Problem 1 - spiral matrix traversal
        // System.out.println("Enter no of rows and columns");
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
        // System.out.println("Input Matrix is:");
        // printMatrix(a);
        // System.out.println("Spiral order Matrix is:");
        // printSpiralOrder(a, r, c);

        // Problem 2
        System.out.println("Enter n value:");
        int n = sc.nextInt();

        System.out.println("The generated spiral Matrix is:");
        int ans[][] = generateSpiralMatrix(n);
        printMatrix(ans);

    }
}
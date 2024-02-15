public class Main {

    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void sortArraySwap(int arr[]) {
        int n = arr.length;
        if (n <= 1)
            return; // corner / edge cases
        int x = -1, y = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) {// first conflict
                    x = i - 1;
                    y = i;
                } else {// second conflict x value remains same so x is not initialized
                    y = i;
                }
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void sortNegPos(int arr[]) {
        int n = arr.length;
        int l = 0, r = n - 1;
        while (l < r) {
            while (arr[l] < 0) {
                l++;
            }
            while (arr[r] >= 0) {
                r--;
            }
            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }

    static void approach1ZeroOneTwoSort(int arr[]) {
        int n = arr.length;
        int zeroCount = 0, oneCount = 0, twoCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else if (arr[i] == 1) {
                oneCount++;
            } else {
                twoCount++;
            }
        }
        int k = 0;
        while (zeroCount > 0) {
            arr[k++] = 0;
            zeroCount--;
        }
        while (oneCount > 0) {
            arr[k++] = 1;
            oneCount--;
        }
        while (twoCount > 0) {
            arr[k++] = 2;
            twoCount--;
        }
    }

    static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void approach2ZeroOneTwoSort(int arr[]) {
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;
        // explore the unknown region
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            }
            if (arr[mid] == 1) {
                mid++;
            }
            if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {

        // int arr[] = { 3, 8, 6, 7, 5, 9, 10 };
        // sortArraySwap(arr);
        // display(arr);

        // int arr[] = { -13, 20, 7, 0, -4, -13, 11, -5, -13 };
        // sortNegPos(arr);
        // display(arr);

        // int arr[] = { 1, 2, 0, 2, 1, 2, 0, 0 };
        // approach1ZeroOneTwoSort(arr);
        // display(arr);

        int arr[] = { 2, 1, 1, 2, 2, 0, 0, 1, 1, 2, 2, 0, 1 };
        approach2ZeroOneTwoSort(arr);
        display(arr);

    }
}
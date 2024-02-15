public class Main {

    static void bubbleSort(int a[], int n) {
        for (int i = 0; i < n - 1; i++) { // n-1 itterations/ passes
            boolean flag = false; // has any swapping happened
            for (int j = 0; j < n - i - 1; j++) { // last i elements are already sorted at correct sorted positions so
                                                  // no need to check them
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true; // some swap has happened
                }
            }
            if (flag == false)
                return; // if(!flag) return; // have any swaps happened
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int n = arr.length;
        bubbleSort(arr, n);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
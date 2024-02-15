public class Main {
    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // i represent the current index
            // find the minimun element in unsorted part of array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 4, 5, 1, 2 };
        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
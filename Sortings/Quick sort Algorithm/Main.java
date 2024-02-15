public class Main {

    static void displayArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int arr[], int start, int end) {
        if (start >= end)
            return;
        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }

    static int partition(int arr[], int start, int end) {
        int pivot = arr[start];
        int countElementsLessThanPivot = 0;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= pivot) {
                countElementsLessThanPivot++;
            }
        }
        int pivotIndex = start + countElementsLessThanPivot;
        swap(arr, start, pivotIndex);

        int lb = start;
        int ub = end;
        // elements lessthan or equal partition index leftSide of partitionIdx ,greater
        // right
        // side of partitionIdx
        while (lb < pivotIndex && ub > pivotIndex) {
            while (arr[lb] <= arr[pivotIndex]) {
                lb++;
            }
            while (arr[ub] > arr[pivotIndex]) {
                ub--;
            }
            if (lb < pivotIndex && ub > pivotIndex) {
                swap(arr, lb, ub);
                lb++;
                ub--;
            }
        }
        return pivotIndex;
    }

    public static void main(String[] args) {
        int arr[] = { 20, 35, 10, 16, 54, 20, 21, 25 };
        int n = arr.length;
        System.out.println("Array before sorting");
        displayArray(arr);
        System.out.println();
        quickSort(arr, 0, n - 1);
        System.out.println("Array after sorting");
        displayArray(arr);
    }
}
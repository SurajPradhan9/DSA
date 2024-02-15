import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int findMax(int arr[]) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void basicCountSort(int arr[]) { // 2 4 2 2
        int n = arr.length;
        // find the largest element of the array
        int max = findMax(arr);
        int count[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
            /*
             * 0 0 3 0 1 -> count array // by default count array elements will be 0.
             * 0 1 2 3 4 -> index
             */
            count[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            /*
             * 0 0 3 0 1 - > count array
             * 2 2 2 4 - > ans array i.e we overrided the main array
             */
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    static void countSort(int arr[]) {
        int n = arr.length;
        int output[] = new int[n]; // sc->n
        // find the largest element of the array
        int max = findMax(arr);
        // Frequency array
        int count[] = new int[max + 1]; // sc-> max
        for (int i = 0; i < n; i++) { // Tc-> n
            count[arr[i]]++;
        }
        // make prefix sum arry of frequency array
        for (int i = 1; i < count.length; i++) { // Tc->max
            count[i] += count[i - 1];
        }
        // find the index of each element of the original array in prefix sum array and
        // put it in the output array
        for (int i = n - 1; i >= 0; i--) { // Tc-> n
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        // copy all elements of output to array
        for (int i = 0; i < n; i++) { // Tc->n
            arr[i] = output[i];
        }

    }

    static void countSortForRadisort(int arr[], int place) {
        int n = arr.length;
        int output[] = new int[n]; // Sc->n
        // Frequency array
        int count[] = new int[10];// Sc->10
        for (int i = 0; i < n; i++) { // Tc->n
            count[(arr[i] / place) % 10]++;
        }
        // make prefix sum arry of frequency array
        for (int i = 1; i < count.length; i++) { // Tc->10
            count[i] += count[i - 1];
        }
        // find the index of each element of the original array in prefix sum array and
        // put it in the output array
        for (int i = n - 1; i >= 0; i--) { // Tc-> n
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }
        // copy all elements of output to array
        for (int i = 0; i < n; i++) { // Tc->n
            arr[i] = output[i];
        }

    }

    static void radixSort(int arr[]) {
        int max = findMax(arr); // get maximum element // Tc-> n
        // apply counting sort to sort elements based on place value
        for (int place = 1; max / place > 0; place *= 10) { // Tc-> digits in max vakue
            countSortForRadisort(arr, place); // Tc-> n
        }
    }

    static void bucketSort(float arr[]) {
        int n = arr.length;
        // buckets
        ArrayList<Float> buckets[] = new ArrayList[n];// int a[]=new int[];
        // create empty buckets //arrays of arraylist
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }
        // Add elements in to buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * 10;
            buckets[bucketIndex].add(arr[i]);
        }
        // sort each bucket individually
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }
        // Merge all buckets to get final sorted array
        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currentBucket = buckets[i];
            for (int j = 0; j < currentBucket.size(); j++) {
                arr[index++] = currentBucket.get(j);
            }
        }
    }

    public static void main(String[] args) {

        // int arr[] = { 4, 3, 1, 5, 3, 1, 3, 5 };
        // basicCountSort(arr);
        // display(arr);

        // int[] arr = { 4, 3, 1, 5, 3, 1, 3, 5 };
        // countSort(arr);
        // display(arr);

        // int[] arr = { 170, 45, 75, 90, 802, 2 };
        // radixSort(arr);
        // display(arr);

        float arr[] = { 0.42f, 0.32f, 0.25f, 0.52f, 0.23f, 0.47f, 0.51f, 0.92f, 0.68f, 0.75f };
        bucketSort(arr);
        for (float i : arr) {
            System.out.print(i + " ");
        }

    }
}
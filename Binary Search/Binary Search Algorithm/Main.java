public class Main {

    static int findSquareRoot(int x) {
        int start = 0, end = x;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = mid * mid; // use long DT to avoid overflow
            if (val == x) {
                return mid;
            } else if (val > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    static int lastOccurence(int arrr[], int x) {
        int start = 0;
        int end = arrr.length - 1;
        int lastIndex = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arrr[mid] == x) {
                lastIndex = mid;
                start = mid + 1;
            } else if (x < arrr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return lastIndex;
    }

    static int firstOccurence(int arrr[], int x) {
        int start = 0;
        int end = arrr.length - 1;
        int firstOccurence = -1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arrr[mid] == x) {
                firstOccurence = mid;
                end = mid - 1;
            } else if (x < arrr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return firstOccurence;
    }

    static boolean binarySearchRecursive(int arr[], int target, int start, int end) {
        // base case
        if (start > end)
            return false;

        int mid = (start + end) / 2;

        if (arr[mid] == target) // self work
            return true;
        else if (arr[mid] > target)
            return binarySearchRecursive(arr, target, start, mid - 1); // sub problem
        else
            return binarySearchRecursive(arr, target, mid + 1, end); // sub problem
    }

    static boolean binarySearch(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 2;
        int n = arr.length;
        int start = 0, end = n - 1;
        while (target != 10) {
            System.out.println(binarySearchRecursive(arr, target, start, end));
            System.out.printf("%d exists in arr : %b\n", target, binarySearch(arr,
                    target));
            System.out.println();
            target++;
        }

        int arrr[] = { 5, 5, 5, 5, 6, 6, 8, 9, 9, 9 };
        int targett = 5;
        int ans = firstOccurence(arrr, targett);
        System.out.println("firstIndex : " + ans);
        int ans1 = lastOccurence(arrr, targett);
        System.out.println("lastIndex : " + ans1);

        int x = 24;
        int anss = findSquareRoot(x);
        System.out.println(anss);
    }
}
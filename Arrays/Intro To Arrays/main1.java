class Assignment {
    void positive() {
        int arr[] = { 2, 6, -5, -1, 0, 4, -9 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                System.out.println(arr[i]);
            }
        }
    }

    void oddIndices() {
        String a[] = { "ab", "bc", "cd", "de", "ef", "fg", "gh" };
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                System.out.println(a[i]);
            }
        }

    }

    void traverse() {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int a : arr) {
            if (a % 2 == 0) {
                System.out.println(a);
            }

        }
    }

    void minimum() {
        int arr[] = { 2, -3, 5, 8, 1, 0, -4 };
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }

    void maximum() {
        int arr[] = { 2, -3, 5, 8, 1, 0, -4 };
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            ans = Math.max(ans, arr[i]);
        }
        System.out.println(ans);
    }

    void peekElement() {
        int arr[] = { 1, 1, 3, 4, 2, 3, 5, 7, 0 };
        int ans = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {
                ans = arr[i];
                break;
            }
        }
        System.out.println(ans);
    }

}

public class main1 {
    public static void main(String[] args) {
        Assignment sc = new Assignment();
        // sc.peekElement();
        // sc.minimum();
        // sc.maximum();
        // sc.traverse();
        // sc.oddIndices();
        // sc.positive();
    }
}

public class Main {

    static void sortLexicograph(String[] s) {
        int n = s.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (s[j].compareTo(s[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = s[i];
            s[i] = s[minIndex];
            s[minIndex] = temp;
        }
    }

    static void zeroEnd(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false)
                return;
        }
    }

    public static void main(String[] args) {

        // int arr[] = { 0, 5, 0, 5, 0 };
        // zeroEnd(arr);
        // for (int i : arr) {
        // System.out.println(i);
        // }

        // String s[] = { "papaya","lime","watermelon", "apple", "mango", "kiwi" };
        // String s[]={"college","cot","cottage"};
        String s[] = { "1", "2", "10", "20", "100" };
        sortLexicograph(s);
        for (String i : s) {
            System.out.println(i);
        }

    }
}
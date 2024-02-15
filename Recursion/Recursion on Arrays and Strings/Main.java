public class Main {

    static void KeypadCombinations(String digit, String[] kp, String ans) { // "253"
        if (digit.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        int currentDigit = digit.charAt(0) - '0';// 2
        String currentChoices = kp[currentDigit];// "abc"
        for (int i = 0; i < currentChoices.length(); i++) { // "abc"
            KeypadCombinations(digit.substring(1), kp, ans + currentChoices.charAt(i));
        }
    }

    static int bestFrogJump(int h[], int n, int index) {
        if (index == n - 1) {
            return 0;
        }
        int op1 = bestFrogJump(h, n, index + 1) + Math.abs(h[index] - h[index + 1]);
        if (index == n - 2) {
            return op1;
        }
        int op2 = bestFrogJump(h, n, index + 2) + Math.abs(h[index] - h[index + 2]);
        return Math.min(op1, op2);
    }

    public static void main(String[] args) {

        // int n=4;
        // int [] h={10,30,40,20};
        // int index=0;
        // int minimumCost=bestFrogJump(h,n,index);
        // System.out.println(minimumCost);

        String digit = "23";
        String kp[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        //               0   1    2      3      4      5      6       7      8      9
        KeypadCombinations(digit, kp, "");

    }
}
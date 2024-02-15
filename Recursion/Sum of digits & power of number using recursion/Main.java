import java.util.Scanner;

public class Main {

    static int pow(int p,int q){
        if(q==0) return 1;
        if(q%2==0){
            int smallAns=pow(p,q/2);
            return smallAns*smallAns;
        }else{
            int smallAns=pow(p,q/2);
            return p*smallAns*smallAns;
        }
    }

    static int power(int p,int q){
        if(q==0) return 1;
        return power(p,q-1)*p;
    }

    static int countOfDigits(int n){
        if(n>=0 && n<=9) return 1;
        return countOfDigits(n/10)+1;
    }
    

    static int sumOfDigits(int n) {
        // Base case
        if (n >= 1 && n <= 9) {
            return n;
        }
        // recursive work--> small answer
        int subProblem = sumOfDigits(n / 10);
        // self work
        int selfWork = (n % 10);
        int ans = subProblem + selfWork;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        //// Sum od Digits
        // int ans = sumOfDigits(n);
        // System.out.println(ans);

        //// Count of Digits
        // int ans1=countOfDigits(n);
        // System.out.println(ans1);

        // p raise to the power q
        int p=sc.nextInt();
        int q=sc.nextInt();

        // // Approach 1
        // int ans2=power(p,q);
        // System.out.println(ans2);

        // Approach 2
        int ans3=pow(p,q);
        System.out.println(ans3);
    }
}
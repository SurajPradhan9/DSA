import java.util.Scanner;

public class Main {

    static int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recursive Approach
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = gcd(x, y);
        System.out.println("GCD: "+ans);
        int lcm = (x * y) / ans;
        System.out.println("LCM: "+lcm);

        // // Brute force Approach
        // int x=sc.nextInt();
        // int y=sc.nextInt();
        // int z=Math.min(x,y);
        // for(int i=z;i>=1;i--){
        // if((x%i==0)&&(y%i==0)){
        // System.out.println(i);
        // break;
        // }
        // }

        // // Itterative Approach
        // int x=sc.nextInt();
        // int y=sc.nextInt();
        // int divident=Math.max(x,y);
        // int divisor=Math.min(x,y);
        // while(divident % divisor!=0){
        // int remainder=divident % divisor;
        // divident=divisor;
        // divisor=remainder;
        // }
        // System.out.println(divisor);
    }
}
public class code {
    public static void main(String[] args) {

        // Assignement Q1-- Product

        int x = 2;
        int y = 4;
        int z = x * y;
        System.out.println(z);

        // Assignment Q2 --ASCIII VAlue

        int ch = 'z';
        System.out.println(ch);

        // Assignment Q3--Area of Rectangle

        int length = 7;
        int Breadth = 4;
        int area = length * Breadth;
        System.out.println(area);

        // Assignment Q4--Cube of a number

        // int a=4;
        // int cube=a*a*a;
        // System.out.println(cube);
        int num = 5;
        int ans = (int) Math.pow(num, 3);
        System.out.println(ans);

        // Assignment Q5--Swap using third variable

        int num1 = 2;
        int num2 = 4;
        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        System.out.println(num2);

    }
}
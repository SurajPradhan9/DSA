import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // above problem logic
        int n = 17;
        while (n != 0) {
            n = n & (n - 1);
            System.out.println(n);
        }

        // Assignment Q5-----DOUBT
        System.out.println("Enter s value:");
        int s = sc.nextInt();
        System.out.println("Enter v value:");
        int v = sc.nextInt();
        int num = s ^ v;
        int count = 0; // (Brian Kernighan algorithm)
        while (num != 0) {
            num = num & num - 1;
            System.out.println("num:" + num);
            count++;
        }
        System.out.println("count:" + count);

        // // Assignment Q4
        // int a=55,b=70;
        // System.out.println((a<50)&&(a<b));
        // System.out.println((a<50)||(a<b));

        // // Assignment Q3
        // System.out.println("Enter Number:");
        // int num=sc.nextInt();
        // int sum=0;
        // while(num>0){
        // int result=num%10;
        // sum=sum+result;
        // num=num/10;
        // }
        // System.out.println(sum);

        // // Assignemnt Q2
        // int p=5,q=10;
        // p=p+q;//5+10=15
        // q=p-q;//15-10=5
        // p=p-q;//15-5=10
        // System.out.println(p);
        // System.out.println(q);

        // // Assignment Q1
        // System.out.println("enter value:");
        // int x=sc.nextInt();
        // int y=((((x+8)/3)%5)*5);
        // System.out.println(y);

        // //Bitwise Operators
        // int e=9,f=10;
        // System.out.println(e|f);
        // System.out.println(e&f);
        // System.out.println(e^f);

        // System.out.println(e<<1);
        // System.out.println(e<<2);

        // System.out.println(f>>1);
        // System.out.println(f>>2);

        // // Unary Operators
        // int a=5,b=5;
        // //increment
        // System.out.println(a++);//5
        // System.out.println(a);//6
        // System.out.println(++b);//6
        // System.out.println(b);//6
        // int c=a++;
        // int d=++b;
        // System.out.println(c);//6
        // System.out.println(d);//7
        // System.out.println(a);//7
        // System.out.println(b);//7
        // //Decrement
        // int x=5,y=5;
        // System.out.println(x--);//5
        // System.out.println(x);//4
        // System.out.println(--y);//4
        // System.out.println(y);//4
        // int z=x--;
        // System.out.println(z);//4
        // System.out.println(x);//3

        // // Assignment Operators
        // int s=10,v;
        // v=s;
        // System.out.println(v);
        // v+=s;//v=v+s
        // System.out.println(v);
        // v*=s;//v=v*s
        // System.out.println(v);

        // int p=15,q=10,r=5;
        // // Logical Operators
        // System.out.println((p>q)&&(p>r));
        // System.out.println((p<q)&&(p>r));
        // System.out.println((p>q)||(p<r));
        // System.out.println((p<r)||(p<q));
        // System.out.println(!(p>q));
        // System.out.println(!(p<r));

        // // Relational Operators
        // System.out.println(p==q);
        // System.out.println(p!=q);
        // System.out.println(p>q);
        // System.out.println(p<q);
        // System.out.println(p>=q);
        // System.out.println(p<=q);

        // // ARITHMETIC OPERATORS
        // System.out.println(p+q);
        // System.out.println(p-q);
        // System.out.println(p*q);
        // System.out.println(p/q);
        // System.out.println(p%q);
    }
}
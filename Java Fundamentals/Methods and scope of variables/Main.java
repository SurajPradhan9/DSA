// Pass by value example
public class Main {
    static void changeValue(int a) {
        a = a * 100;
        System.out.println("Inside value" + a);
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before changing value:" + a);
        changeValue(a);
        System.out.println("After changing value" + a);
    }
}

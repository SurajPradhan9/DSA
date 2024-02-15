class ArraysExample {


    void searchInArray() {
        int arr[] = { 111111, 2, 3, 4, 5, 6, 79887444, 89, 978 };
        int x = 978;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);

    }

    void maximum() {
        int arr[] = { 111111, 2, 3, 4, 5, 6, 79887444, 89, 978 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }

    void sum() {
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    void loops() {
        int age[] = new int[5];
        age[0] = 1;
        age[1] = 2;
        age[2] = 3;
        age[3] = 4;
        age[4] = 5;

        System.out.println(age[0] + " " + age[1] + " " + age[2] + " " + age[3] + " " + age[4]);

        // // name-for loop
        // for (int i = 0; i <= 5; i++) {
        //     System.out.println(age[i]);
        // }

        // name- for each loop-limitation it print all values where as in for loop we
        // can decide till where we can print
        for (int a : age) {
            System.out.println(a);
        }

        // name-while loop
        int i = 0;
        while (i <= age.length) {
            System.out.println(age[i]);
            i++;
        }

        // // print multi array using loops
        // int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // for(int i=0;i<=arr.length-1;i++){
        // for(int j=0;j<=arr[i].length-1;j++){
        // System.out.println(arr[i][j]);

        // }
        // }
    }

    void length() {
        int age[] = new int[3];
        String name[] = { "Suraj", "Vaishnavi", "Pradhan", "Dunna" };
        float weight[] = new float[5];

        System.out.println(age.length);
        System.out.println(name.length);
        System.out.println(weight.length);
    }

    void multiArrays() {
        // int arr_1[][]=new int[3][3];
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);

        // int arr_3[][][]=new int[3][3][3];//3*3*3=27 bytes

    }

    void demoArrays() {
        int age[] = new int[5];
        age[0] = 1;
        age[1] = 2;
        age[2] = 3;
        // age[8]=9;//outoff bounds error

        String name[] = { "suraj", "Vaishnavi", "Pradhan" };
        System.out.println(age[0] + " " + age[1] + " " + age[2] + " " + age[3] + " " + age[4]);
        System.out.println(name[0] + " " + name[1] + " " + name[2]);

    }

}

public class Main {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        // obj.searchInArray();
        // obj.maximum();
        // obj.sum();
        // obj.loops();
        // obj.length();
        // obj.multiArrays();
        // obj.demoArrays();

    }
}
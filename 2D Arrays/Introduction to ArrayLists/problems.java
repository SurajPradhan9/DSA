import java.util.ArrayList;
import java.util.Collections;

public class problems {

    static void reverseArrayList(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            /*
             * temp=a
             * a=b
             * b=temp
             */

            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);

            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        // Problem 1 - reverse the string
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(66);
        list.add(90);
        list.add(45);
        list.add(18);
        System.out.println("Original ArrayList:" + list);

        // reverseArrayList(list);//Method 1
        Collections.reverse(list);// Method 2
        System.out.println("Reversed ArrayList:" + list);

        Collections.sort(list);
        System.out.println("Ascending Order:" + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order:" + list);

        // Problem 2 - sort an String in Descending order
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Suraj");
        list1.add("Pradhan");
        list1.add("Vaishnavi");
        list1.add("Dunna");
        System.out.println("Orginal List:" + list1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("Descending order:" + list1);

    }
}

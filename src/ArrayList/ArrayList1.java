package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5072);
        integerList.add(2122);
        integerList.add(5655);
        integerList.add(6846);
        integerList.add(null);/// allows array

        System.out.println(integerList);
        System.out.println();
        System.out.println(integerList.size());
        System.out.println();
        System.out.println(integerList.get(4));
        System.out.println();
        integerList.add(2,5004);
        System.out.println(integerList);
        System.out.println();
        System.out.println(integerList.remove(1));
        System.out.println();
        System.out.println(integerList);
    }
}

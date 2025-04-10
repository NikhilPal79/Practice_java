package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {


        int[] arr =  {10,34,53,23,53,32,34,53,232,53,54323,43,34};

        List<Integer> integerList = Arrays.asList(10, 34, 53, 23, 53, 32, 34, 53, 232, 53, 54323, 43, 34);
        System.out.println("given array converted into list ");
        System.out.println("list : "+ integerList);
        System.out.println(integerList.size());
        System.out.println();

        Collections.sort(integerList);
        System.out.println("sorted list : "+integerList);
        System.out.println(integerList.size());
        System.out.println();
        System.out.println();

        System.out.println("swapping between index 1st and 10th");
        Collections.swap(integerList,1,10);
        System.out.println(integerList);
        System.out.println(integerList.size());
    }
}

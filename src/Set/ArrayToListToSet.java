package Set;

import java.util.*;

public class ArrayToListToSet {
    public static void main(String[] args) {


        /// given array

        int[] arr = {12,562,130,946,1,3,30,61,3,656,90,609,8413,16,49,2,94};

        ///  sort array

        System.out.println("given array : "+Arrays.toString(arr));
        System.out.println();

        Arrays.sort(arr);

        System.out.println("sorted array : "+Arrays.toString(arr));
        System.out.println();


        ///  convert array into list

        List<Integer> list = Arrays.asList(12, 562, 130, 946, 1, 3, 30, 61, 3, 656, 90, 609, 8413, 16, 49, 2, 94);

        System.out.println("array into list : "+list);
        System.out.println();

        /// convert list into set(HashSet = random order)

        Set<Integer> hashSet = new HashSet<>(list);

        System.out.println("list into hashSet : "+hashSet);
        System.out.println();

        /// list into TreeSet (asc order)

        Set<Integer> treeSet = new TreeSet<>(list);

        System.out.println("list into treeSet : "+treeSet);
        System.out.println();

        ///  into LinkedSet (order of insertion)

        Set<Integer> linkedList = new LinkedHashSet<>(list);

        System.out.println("list into linkedList : "+linkedList);
        System.out.println();


    }
}

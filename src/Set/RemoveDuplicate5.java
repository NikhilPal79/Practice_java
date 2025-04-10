package Set;

import java.util.*;

public class RemoveDuplicate5 {
    public static void main(String[] args) {
        /// REMOVE DUPLICATES
        ///  FIND DUPLICATES

        int[] arr = {10,10,15,16,18,49,13,496,161,161,6614,13030,16161,30,10,5964,49,161,49,4961,1310,4961};

        System.out.println("iven array : "+Arrays.toString(arr));
        System.out.println("given length : "+arr.length);
        System.out.println();

        /// To remove duplicate we convert it in set but before that convert it in list

        List<Integer> list = Arrays.asList(10, 10, 15, 16, 18, 49, 13, 496, 161, 161, 6614, 13030, 16161, 30, 10, 5964, 49, 161, 49, 4961, 1310, 4961);

        System.out.println("list : "+list);
        System.out.println(list.size());
        System.out.println();

        List<Integer> originals = new ArrayList<>();
        List<Integer> duplicate = new ArrayList<>();

        for (Integer element : arr) {
            if (!originals.add(element)) {
                duplicate.add(element);
            }else {
                originals.add(element);
            }

        }
        System.out.println("list of originals integers : "+originals);
        System.out.println("originals size : "+originals.size());
        System.out.println("list of duplicates integers : "+duplicate);
        System.out.println("duplicates size "+duplicate.size());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("DID NOT WORK ON LIST");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("************NOW TRYING ON SET*****************");
        System.out.println();
        System.out.println();


        /// convert into set to remove duplicates

        Set<Integer> setOriginals  = new TreeSet<>();
        Set<Integer> setDuplicates   = new TreeSet<>();

        /// finding duplicates

        for (Integer element : list ) {

            if (!setOriginals.add(element)) {
                setDuplicates.add(element);
            }else {
                setOriginals.add(element);
            }

        }

        System.out.println("set of originals words : "+setOriginals);
        System.out.println("size : "+setOriginals.size());
        System.out.println();
        System.out.println("set of duplicates words : "+setDuplicates);
        System.out.println("size : "+setDuplicates.size());





    }
}

package Set;

import java.util.*;

public class OnString {
    public static void main(String[] args) {

        String[] str = {"nikhil","mayank","guri","sawan","ridham","mohit","rohit","tirath","nikhil","harp","luvi","prince"};

        System.out.println("given array : "+Arrays.toString(str));
        System.out.println();

        Arrays.sort(str);
        System.out.println("sorted array : "+Arrays.toString(str));
        System.out.println();

        /// into list

        List<String> stringList = Arrays.asList(str);

        System.out.println("array as list : "+stringList);
        System.out.println();

        ///  into hashSet

        Set<String> hashSet = new HashSet<>(stringList);

        System.out.println("list into hashset : "+hashSet);
        System.out.println();

        /// into treeSet

        Set<String> treeSet = new TreeSet<>(stringList);

        System.out.println("list into tree set : "+treeSet);
        System.out.println();

        ///  into LinkedSet

        Set<String> linkedSet = new LinkedHashSet<>(stringList);

        System.out.println("list into linkedset : "+linkedSet);
    }
}

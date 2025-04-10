package Set;

import java.util.*;

public class ListIteratorClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(46);
        list.add(794);
        list.add(64630);
        list.add(1794);
        list.add(5631);
        list.add(7210);
        /*list.add(null);*/  /// giving exception in list iterator

        System.out.println("created list : "+list);
        System.out.println("list size : "+list.size());
        System.out.println();

        ///  List Iterator only works on list

        ListIterator<Integer> listIterator = list.listIterator();

        // apply traverse{mean for each element of list/set } applying for each loop
        System.out.println(listIterator);
        System.out.println();

        ///  how to remove element on list iterator

        while (listIterator.hasNext()){
            Integer next = listIterator.next();
            if (next == 46) {
                listIterator.remove();
            }
        }
        System.out.println("after removing 46 by using list iterator : "+list);
        System.out.println("list size : "+list.size());
        System.out.println("removed element index from the last index : "+listIterator.previousIndex());
        System.out.println();


        /// Iterator will not work on list, so convert list into set

        Set<Integer> treeSet = new TreeSet<>(list);

        System.out.println("iterator operation can be done on set, so list converted to set ");
        System.out.println("tree set : "+treeSet);
        System.out.println("treeSet size "+treeSet.size());
        System.out.println();

        ///  how to remove element to iterator

        Iterator<Integer> iterator = treeSet.iterator();

        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next == 12) {
                iterator.remove();
            }
        }
        System.out.println("treeSet after removing 12 using iterator : "+treeSet);
        System.out.println("treeSet size : "+treeSet.size());
        System.out.println();


    }
}

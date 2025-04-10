package Set;

import java.util.*;

public class RemoveDuplicate4 {
    public static void main(String[] args) {


        ///  remove duplicates
        ///  find duplicates

        String s = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of de Finibus Bonorum et Malorum (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum Lorem ipsum dolor sit amet. comes from a line in section ";

        System.out.println("given string : "+s);
        System.out.println("given string length : "+s.length());
        System.out.println();

        ///  need to split the string into elements

        String[] splitString = s.split(" ");

        ///  convert string into array
        String string = Arrays.toString(splitString);
        System.out.println("array : "+string);
        System.out.println("array length : "+string.length());
        System.out.println();

        ///  convert into SET to remove duplicates

        Set<String> originals = new TreeSet<>();
        Set<String> duplicates  = new TreeSet<>();

        for ( String element : splitString) {
            if (!originals.add(element)) {
                duplicates.add(element);

            }else {
                originals.add(element);
            }

        }

        System.out.println("originals set of words : "+originals);
        System.out.println(originals.size());
        System.out.println();
        System.out.println("duplicates set of words : "+duplicates);
        System.out.println(duplicates.size());


    }
}

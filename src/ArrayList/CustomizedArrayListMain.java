package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomizedArrayListMain {
    public static void main(String[] args) {

        List<CustomizedArrayList> list = new ArrayList<>();


        ///  need to create new instance for every input

        list.add(new CustomizedArrayList(101, "pinda"));
        list.add(new CustomizedArrayList(161, "deedar"));
        list.add(new CustomizedArrayList(151, "mayank"));
        list.add(new CustomizedArrayList(191, "ridahm"));
        list.add(new CustomizedArrayList(145, "nikhil"));

        System.out.println(list);


    }
}

package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RogersMain {
    public static void main(String[] args) {

        List<Rogers> list = new ArrayList<>();

        list.add(new Rogers(5072,"nikhil",55000));
        list.add(new Rogers(2122,"karan",57000));
        list.add(new Rogers(6846,"harp",65000));
        list.add(new Rogers(6846,"ajay",75000));

        System.out.println(list);
    }
}

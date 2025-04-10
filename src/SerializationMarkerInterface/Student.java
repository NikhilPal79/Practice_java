package SerializationMarkerInterface;

import java.io.*;

public class Student implements Serializable {
    /*Serialization is the process of converting an object into a byte stream
    (e.g., for saving to a file, sending over a network, or storing in a database*/

    private String name;
    private  int age;
    private transient  String password;

    
}

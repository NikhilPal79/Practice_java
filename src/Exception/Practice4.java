package Exception;

public class Practice4 {
    public static void main(String[] args) {

        ///  trying try-catch-finally on null exception
        try{

        int[] arr = {1,2,5,2,0,3,8,9};

        arr = null;


        int l1 = arr.length;
        System.out.println(l1);


        System.out.println("array executed");

            /*Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "arr" is null
            at Exception.Practice4.main(Practice4.java:13)*/


        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            System.out.println("Executed anyway");
        }


        /*java.lang.NullPointerException: Cannot read the array length because "arr" is null
        at Exception.Practice4.main(Practice4.java:14)*/


    }
}

package Exception;

public class Practice2 {
    public static void main(String[] args) {

        ///  PRACTICING TRY-BREAK-FINALLY ON ARITHMETIC EXCEPTION

        try {
            int x = 20;
            int y = 0;

            int result2 = x % y;

            System.out.println(result2);


            System.out.println("did not go through ");


        /*Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exception.Practice2.main(Practice2.java:9)*/


        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("Executed always...");
        }

    }
}

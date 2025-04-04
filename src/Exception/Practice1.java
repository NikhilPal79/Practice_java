package Exception;

public class Practice1 {
    public static void main(String[] args) {


        ///  TRYING TRY-BREAK- FINALLY ON ARITHMETIC EXCEPTION


        try{
            int x = 10;

            int y = 0;

        int result = x/y;

        System.out.println(result);

        System.out.println("applying try-catch & finally ");

        }catch (ArithmeticException e){
            e.printStackTrace();

        }finally {
            System.out.println("Executed always...");
        }
    }
}

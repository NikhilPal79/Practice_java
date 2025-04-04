package Exception;

public class Practice3 {
    public static void main(String[] args) {


        ///  PRACTICING TRY-CATCH-FINALLY ON NULL EXCEPTION
        try {

            String m = "mayank";

            m = null;

            String m1 = m.toUpperCase();
            System.out.println(m1);
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            System.out.println("executed anyway");
        }



    }
}

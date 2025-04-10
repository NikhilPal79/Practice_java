public class WrapperClass {
    public static void main(String[] args) {

        int x = 5;
        float y = 2.00f;
        long z = 50000;
        double a = 2000.00;

        /// AutoBoxing

        Integer intObj = x;
        Float floObj = y;
        Long loObj = z;
        Double doObj = a;

        ///  Integer intObj = 5 (SIMILAR THING)

        System.out.println(intObj);
        System.out.println(floObj);
        System.out.println(loObj);
        System.out.println(doObj);
        System.out.println(intObj.intValue());
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        /// UnBoxing

        Integer intObj1 = 5;
        Float floObj1 = 2.00f;
        Long loObj1 = 50000L;
        Double doObj1 = 2000.00;



        int x1 = intObj1;
        float y1 = floObj1;
        long z1 = loObj1;
        double a1 = doObj1;

        System.out.println(x1);
        System.out.println(y1);
        System.out.println(z1);
        System.out.println(a1);


    }
}

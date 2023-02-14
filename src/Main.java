public class Main {
    public static void main(String[] args) {
        // String variable
        String msg = "Hello World";
        System.out.println(msg);

        /*
         * Number
         *  No Decimal Number
         *      - byte, short, int, long
         *  Decimal Number
         *      - float, double
         */

        // can't accept decimal number
        int intVar = 10;
        System.out.println(intVar);

        // decimal value ends with sign (f or F)
        float floatVar = 10.9F;
        System.out.println(floatVar);

        // surrounded with single quotes
        char charVar = 'A';
        System.out.println(charVar);

        boolean booleanVar = true;
        System.out.println(booleanVar);
    }
}
public class DataType {
    public static void main(String[] args) {
        boolean b;
        char c;
        byte by;
        short s;
        int i;
        long l;
        float f;
        double d;

        b = true;
        System.out.println("boolean = " + b);
        c = 'a'; // char must need too define using singel qut(')
        System.out.println("char = " + c);
        by = 100; //The byte data type can have values from -128 to 127 (8-bit signed two's complement integer).
        System.out.println("byte = " + b);
        s = 2300; //The short data type in Java can have values from -32768 to 32767 (16-bit signed two's complement integer).
        System.out.println("short = " + s);
        i = 1234;
        System.out.println("int = " + i);
        l = 54; //The long data type can have values from -263 to 263-1 (64-bit signed two's complement integer).
        System.out.println("long = " + l);
        f = -24f; /* The float data type is a single-precision 32-bit floating-point.Learn more about single-precision and double-precision floating-point if you are interested. */
        System.out.println("float = " + f);
        d = 43.2; /* The double data type is a double-precision 64-bit floating-point. */
        System.out.println("float = " + f);

    }
}

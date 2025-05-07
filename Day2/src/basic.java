public class basic {
    static {
        System.out.println("Static 1");
    }
    public static void main(String[] args) {
//        char[] a={'N','i','t','i','s','h'};
//        String name=new String(a);
//        System.out.println(name);
        new basic();
        int a,b,c=0;
        a=3;
        b=1;

        try {
            // First risky operation
            c = a / b; // Throws ArithmeticException
        }
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e);
        }
        finally {
            System.out.println("End of World");
        }

    } static{
        System.out.println("Start");
    }
    {
        System.out.println("IIB");//Instance Initialization Block
    }
}
//hierarchy of execution
//1.static
//2.IIB
//3.main method
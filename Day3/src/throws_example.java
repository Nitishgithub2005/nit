class demo{
    int divide(int a ,int b) throws ArithmeticException{
        return a/b;
    }

}
public class throws_example {
    public static void main(String[] args) {
        int a=4,b=0;
        demo d1 = new demo();
        System.out.println(d1.divide(a,b));

    }
}

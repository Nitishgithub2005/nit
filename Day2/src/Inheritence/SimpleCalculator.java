package Inheritence;

class Simple {
    void addition(int a, int b){
        System.out.println(a+b);
    }
}
class Calculator extends SimpleCalculator{
    void subtraction(int a, int b){
        System.out.println(a-b);
    }
}
class AdvancedCalculator extends Calculator{
    void multi(int a,int b){
        System.out.println(a*b);
    }
}
public class SimpleCalculator {
    public static void main(String[] args) {
        AdvancedCalculator ad1= new AdvancedCalculator();
        ad1.subtraction(4,5);
    }
}


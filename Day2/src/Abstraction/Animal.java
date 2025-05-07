package Abstraction;


abstract class Animal1 {
    //Normal or Concrete Methods
    void eat() {
        System.out.println("I was eating");
    }
    //abstract method
    abstract void speed(String s);

}
class Cat extends Animal1{
    @Override
    void speed(String s){
        System.out.println(s +": i am toooo fast");
    }
}
class Dog extends Animal1{
    @Override
    void speed(String s){
        System.out.println( s +": i am faster than you");
    }
}
public class Animal{
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.speed("tommy");
        Dog d1 =new Dog();
        d1.speed("jmmy ");
    }
}
package Inheritence;
//Single level
public class animal {
    String name;
    void eat(){
        System.out.println("My name is : "+ this.name);
    }
}
 class Cat extends animal{
    String speed;
    Cat(String speed, String name){
        this.speed=speed;
        this.name=name;
    }
    void speedData(){
        System.out.println(this.speed +" "+this.name );
    }

     public static void main(String[] args) {
         Cat c= new Cat("fast","tom");
         c.eat();
         c.speedData();
     }
}

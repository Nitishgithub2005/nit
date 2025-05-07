public class ConstructorExample {
    int x=10;  //instance variable
    int y=20; //instance variable
    ConstructorExample(int x,int y){
        this.x=x;
        this.y=y;
    }
    public static void main(String[] args) {
        ConstructorExample obj1 = new ConstructorExample(6,3);
        System.out.println(obj1.x +" "+obj1.y);
    }
}

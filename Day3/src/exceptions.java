public class exceptions {
    public static void main(String[] args) {
        int age=12;
        if (age >= 18 ){
            System.out.println("Eligible ");
        }
        else{
            throw new RuntimeException("\n\nNot Eligible \n\n");
        }

    }
}

public class demo1{
    public static void main(String[] args){
            for (int r=1;r<7;r++){
                for(int c=1;c<15;c++){
                    if (((r+c) % 4 ==0 )|| (c%4==0 && r %2==0))  {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
    }
    }
    
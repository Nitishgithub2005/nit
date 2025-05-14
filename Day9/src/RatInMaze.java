import java.util.Arrays;
import java.util.Scanner;

public class RatInMaze {
    static boolean isPathSafe(int[][] arr,int x,int y,int n){
        return (x<n && y<n && arr[x][y]==1);
    }
    static boolean ratinmaze(int[][] arr,int x,int y,int n,int[][] result){
        if(arr[n-1][n-1]==0){
            System.out.println("Exit is sealed");
            return false;
        }
        //Base Case
        // if the rat has reached the distination [n-1,n-1]
        if(x== n-1 && y ==  n-1){
            result[x][y]=1;
            return true;
        }
        //check if the rat can stand at the current cell(x,y)
        if(isPathSafe(arr,x,y,n)){
            result[x][y]=1;
            //move forward to find a path
            if(ratinmaze(arr,x+1,y,n,result)){
                return true;
            }
            //move dowm to find a path
            if(ratinmaze(arr,x,y+1,n,result)){
                return true;
            }
            //we couldn't find a path ,so we backtrack
            result[x][y]=0;//backtracking
            return false;

        }
        return false;
    }

    public static void main(String[] args) {
        int n=5;
        int[][] arr={{1, 0, 1, 1 ,1},
                    {1, 1, 0, 0, 1},
                    {0, 1, 0, 1, 0},
                    {1 ,1, 1 ,1 ,1},
                    {1, 0, 1, 0, 0}};
        int[][] result={{0, 0,0, 0 ,0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0 ,0, 0 ,0 ,0},
                {0, 0, 0, 0, 0}};
        if(ratinmaze(arr,0,0,n,result)){
            for(int i=0;i<n;i++){
                System.out.println(Arrays.toString(result[i]));
            }
        }
        else {
            System.out.println("No path");
        }
    }
}

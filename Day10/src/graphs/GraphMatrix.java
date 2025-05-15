package graphs;

import java.util.Scanner;

public class GraphMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] adjmatrix=new int[n+1][m+1];
        for (int i = 0; i < m; i++) {
            int u= sc.nextInt();
            int v= sc.nextInt();
            //undirected u <----> v
            adjmatrix[u][v]=1;
            adjmatrix[v][u]=1;//dont do this for directed
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(adjmatrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}

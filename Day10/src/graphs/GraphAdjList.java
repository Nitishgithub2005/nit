package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphAdjList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<List<Integer>> adjList= new ArrayList<>();
        for (int i = 0; i <=n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i <m ; i++) {
            int u=sc.nextInt();
            int v=sc.nextInt();
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("Node -->"+i+"Neighbour");
            for (int v : adjList.get(i)) {
                System.out.print(" "+v);
            }
            System.out.println();
        }
        sc.close();
    }
}

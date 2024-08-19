import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphCreation {
    static class Graph{

        int src;
        int dest;
        int wt;

        public Graph(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void grapCreate(ArrayList<Graph>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        //index 0
        graph[0].add(new Graph(0, 1, 1));

        //index 1
        graph[1].add(new Graph(1, 0, 1));
        graph[1].add(new Graph(1, 2, 1));
        graph[1].add(new Graph(1, 3, 1));

        //index 2
        graph[2].add(new Graph(2, 1, 1));
        graph[2].add(new Graph(2, 3, 1));

        //index 3
        graph[3].add(new Graph(3, 1, 1));
        graph[3].add(new Graph(3, 2, 1));
    }
    public static void main(String[] args) {
        int v=4;
        @SuppressWarnings("unchecked")
        ArrayList<Graph>[] graph = new ArrayList[v];
        grapCreate(graph);
        //printGraph(graph);
        bfsTraversal(graph);
        dfsTraversal(graph,0,new boolean[v]);
    }
    public static void dfsTraversal(ArrayList<Graph>[] edge,int curr,boolean[] visit){
        System.out.println(curr);
        visit[curr]=true;

        for(int i=0;i<edge[curr].size();i++){
            Graph v=edge[curr].get(i);
            if(!visit[v.dest]){
                dfsTraversal(edge,v.dest,visit);
            }
        }
    }
    public static void bfsTraversal(ArrayList<Graph>[] edges){
        Queue<Integer> q=new LinkedList<>();
        boolean visited[] =new boolean[edges.length];
        for(int i=0;i<visited.length;i++){
            visited[i]=false;
        }

        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(visited[curr]==false){
                System.out.print(curr);
                visited[curr]=true;
                for(int i=0;i<edges[curr].size();i++){
                    q.add(edges[curr].get(i).dest);
                }
            }
            
        }
    }
    public static void printGraph(ArrayList<Graph>[] edges){
        for(int i=0;i<edges.length;i++){
            for(int j=0;j<edges[i].size();j++){
                Graph g=edges[i].get(j);
                System.out.println(g.src+" "+g.dest);
            }
        }
    }   

}

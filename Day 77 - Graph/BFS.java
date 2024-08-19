//BFS PRACTISE - GFG
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        boolean[] visited=new boolean[V];
        q.add(0);
        
        while(!q.isEmpty()){
            int curr=q.remove();
            
            if(visited[curr]==false){
                
                visited[curr]=true;
                list.add(curr);
                for(int i: adj.get(curr)){
                    q.add(i);
                }
            }
        }
        return list;
    }
}

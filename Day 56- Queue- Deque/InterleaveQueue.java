//Interleave the First Half of the Queue with Second Half

class Solution {
    public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
        // code here\
        ArrayList<Integer> list=new ArrayList<>();
        int len=N/2;
        Queue<Integer> fhalf=new LinkedList<>();
        while(len>0){
            fhalf.add(q.remove());
            len--;
        }
        
        while(!fhalf.isEmpty() && !q.isEmpty()){
            list.add(fhalf.remove());
            list.add(q.remove());
        }
        while(!fhalf.isEmpty()){
            list.add(fhalf.remove());
        }
        while(!q.isEmpty()){
            list.add(q.remove());
        }
        return list;
    }
}
        

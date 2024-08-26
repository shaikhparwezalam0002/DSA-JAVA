class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i)>1){
                list.add(i);
            }
        }
        if(list.size()==0){
            list.add(-1);
        }else{
            Collections.sort(list);
        }
        return list;
        
    }
}

import java.util.HashMap;
import java.util.HashSet;

public class Itirnary {
    public static String roamMap(HashMap<String,String> map){
        HashSet<String> to=new HashSet<>();
        HashSet<String> from =new HashSet<>();
        for(String itr : map.keySet()){
            to.add(itr);
            from.add(map.get(itr));
        }

        for(String itr : to){
            if(!from.contains(itr)){
                return itr;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");
        String start=roamMap(map);
        System.out.print(start);
        for(String key : map.keySet()){
            System.out.print(" -> "+map.get(start)+" ");
            start=map.get(start);
        }
    }
}


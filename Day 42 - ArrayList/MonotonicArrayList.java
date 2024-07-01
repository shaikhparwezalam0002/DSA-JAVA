
import java.util.ArrayList;

public class MonotonicArrayList{
    public static boolean monoDec(ArrayList<Integer> list){

        if(list.get(0) <= list.get(list.size()-1)){ //for asc
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)>list.get(i+1)){
                    return false;
                }
            }
        }
        else{//for desc
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)<list.get(i+1)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(monoDec(list));
    }
}

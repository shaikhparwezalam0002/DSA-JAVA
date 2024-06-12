import java.util.*;

public class FindShortestPath{
    public static float findPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            //north
            if(str.charAt(i)=='N'){
                x++;
            }
            //soutn
            else if(str.charAt(i)=='S'){
                x--;
            }
            //east
            else if(str.charAt(i)=='E'){
                y++;
            }
            else{
                y--;
            }
        }
        float result = x*x + y*y;
        result=(float)Math.sqrt(result);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(findPath(str));
    }
}
public class Main{
    public static void main (String[] args) {
        String root="WNEENESENNN";
        int x=0;
        int y=0;
        for(int i=0;i<root.length();i++){
            char ch=root.charAt(i);
            if(ch=='W'){
                --y;
            }
            else if(ch=='E'){
                ++y;
            }
            else if(ch=='N'){
                ++x;
            }
            else{
                --x;
            }
            
        }
        x=x*x;
        y=y*y;
       // System.out.print(x+" "+y);
        int path=(int)Math.sqrt(x+y);
        System.out.print(path);
    }
}

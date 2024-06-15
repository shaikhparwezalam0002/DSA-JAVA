import java.util.*;
class GetIthBit{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int bitMask = 1<<i;
        if((n&bitMask) ==0 ){
            System.out.print(0);
        }
        else{
            System.out.print(1);
        }
    }
}

import java.util.*;
public class PrintNumInc{
    private static int c=1;
    public static void printNumAsc(int num){
        if(c==num){
            System.out.print(num);
            return;
        }
        System.out.print(c+" ");
        c++;
        printNumAsc(num);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        printNumAsc(num);
    }
}
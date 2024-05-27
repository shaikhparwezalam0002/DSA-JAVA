import java.util.Scanner;

public class Triangle{
    static int valueTest(int n){
        return 1-n;
        //return (n==0)?1:0; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        int value;
        for(int i=1;i<=line;i++){
            if (i%2!=0) {
                value=1;
                for(int j=1;j<=i;j++){
                    System.out.print(value+" ");
                    value=valueTest(value);
                }
            }
            else{
                value=0;
                for(int j=1;j<=i;j++){
                    System.out.print(value+" ");
                    value=valueTest(value);
                }
            }
            System.out.println();
        }
    }
}

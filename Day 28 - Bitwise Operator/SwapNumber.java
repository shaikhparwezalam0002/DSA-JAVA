public class SwapNumber{
    public static void swapTwoNumber(int a,int b){
        a = a^b;
        b=a^b;
        a=a^b;
        System.out.println("a:="+a +" b:="+b);
    }
    public static void main(String[] args) {
        swapTwoNumber(3,5);
    }
}
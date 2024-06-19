public class Factorial{
    private int fact=1;
    public static int factorial(int num){
        Factorial f=new Factorial();
        if(num!=0){
            f.fact *= num * factorial(num-1);
        }
        return f.fact;
    }
    public static void main(String[] args) {
        int num=Factorial.factorial(5);
        System.out.println(num);

    }
}
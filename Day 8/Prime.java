import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        boolean isPrime=true;
        if (number<2) {
            isPrime=false;
        }
        else if(number==2){
            isPrime=true;
        }
        else{
            for(int i=2;i<=(int)Math.sqrt(number);i++){
                if(number%i==0){
                    isPrime=false;
                }
            }
        }
        if(isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
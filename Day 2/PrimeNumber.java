import java.util.Scanner;
public class PrimeNumber{
        //If a number is prime or not.
        public static boolean  isPrime(int n){
            if(n<2){
                return  false;
            }
            else{
                for(int i=2;i<=Math.sqrt(n);i++){
                    if(n%i==0){
                        return false;
                    }
                }
                return true;
            }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Q2.Print all the prime number from a to b where (a<b & a>1)
        System.out.print("Enter the start number:");
        int st =sc.nextInt();
        System.out.print("Enter the end number:");
        int end =sc.nextInt();
        if(st<end){
        for(int i=st; i<=end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        }
        else{
            System.out.println("Enter the input correctly.");
        }
    }
}
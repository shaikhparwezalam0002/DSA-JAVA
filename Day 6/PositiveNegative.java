import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number>0){
            System.err.println("Positive");
        }
        else if(number<0){
            System.err.println("Negetive");
        }
        else{
            System.err.println("Neutral");
        }
    }
}

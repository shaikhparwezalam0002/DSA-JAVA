
import java.util.Scanner;

class Gst{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter pencil price:");
        float pencil= sc.nextFloat();

        System.err.println("Enter pen price:");
        float pen= sc.nextFloat();

        System.err.println("Enter eraser price:");
        float eraser= sc.nextFloat();

        float totalAmt= pencil+pen+eraser;
        float gst = (totalAmt/100)*18;
        float billAmt = (totalAmt+gst);
        System.err.println("Your amount is : "+totalAmt +"\n"+"with GST of 18% : "+gst+"\n"+"total amount :"+billAmt);
    
        int $=12;

    }
}
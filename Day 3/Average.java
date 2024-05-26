import  java.util.Scanner;
public class Average{
    public static void main(String[] args) {
        /*
        Question1:In a program,input 3 numbers:
        A,B and C.You have to output the average of these 3 numbers.
        */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number:");
        int a= sc.nextInt();
        System.out.println("Enter second Number:");
        int b= sc.nextInt();
        System.out.println("Enter third Number:");
        int c= sc.nextInt();

        int avg= (a+b+c)/3;
        System.out.println("The average is :"+avg);
    }
}
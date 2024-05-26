import java.util.Scanner;

public  class Area{
    public static void main(String[] args) {
        /**
         * In a program,input the side of a square.
         * You have to output the area of the square.
         */
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the side of a square:");
        double side= sc.nextDouble();
        System.err.println(side*side);
        
    }
}

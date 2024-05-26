
import java.util.Scanner;

public class WeekdayWeekend1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch(day) {
            case 1,2,3,4,5:{
                System.out.println("WeekDay");
                break;
            }
            case 6,7:{
                System.out.println("Weekend");
                break;
            }
            default:{
                System.out.println("Invalid");
            }
                
        }
    }
}
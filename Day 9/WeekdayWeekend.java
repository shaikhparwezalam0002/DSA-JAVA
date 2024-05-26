
import java.util.Scanner;

public class WeekdayWeekend{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch(day) {
            case 1:{
                System.out.println("WeekDay");
                break;
            }
            case 2:{
                System.out.println("WeekDay");
                break;
            }
            case 3:{
                System.out.println("WeekDay");
                break;
            }
            case 4:{
                System.out.println("WeekDay");
                break;
            }
            case 5:{
                System.out.println("WeekDay");
                break;
            }
            case 6:{
                System.out.println("Weekend");
                break;
            }
            case 7:{
                System.out.println("Weekend");
                break;
            }
            default:{
                System.out.println("Invalid");
            }
                
        }
    }
}
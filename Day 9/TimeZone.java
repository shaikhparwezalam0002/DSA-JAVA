
import java.util.Scanner;

public class TimeZone{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //convert GMT to IST.
        int day=sc.nextInt();
        int hour =sc.nextInt();
        int min= sc.nextInt();
        int sec= sc.nextInt();
        hour +=5;
        min += 30;

        if(sec>=60){
            min++;
            sec-=60;
        }
        if(min>=60){
            hour++;
            min-=60;
        }

        if(hour>=24){
            day++;
            hour -= 24;
        }


        System.out.println("Day "+day +" hour "+hour+ " min "+min+" sec "+sec);
    }
}
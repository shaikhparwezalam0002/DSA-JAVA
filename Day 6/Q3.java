
class Week{
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1 : 
                System.out.println("Monday");
                break;
            case 2 : 
                System.out.println("Tuesday");
                break;
            case 3 : 
                System.out.println("Wednesday");
                break;
            case 4 : 
                System.out.println("Thrusday");
                break;
            case 5 : 
                System.out.println("Friday");
                break;
            case 6 : 
                System.out.println("Saturday");
                break;
            case 7 : 
                System.out.println("Sunday");
                break;
        }
    }
}
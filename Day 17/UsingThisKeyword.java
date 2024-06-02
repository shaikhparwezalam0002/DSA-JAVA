
import java.util.Scanner;

public class UsingThisKeyword{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Test t=new Test();
        int a=sc.nextInt();
        int b=sc.nextInt();
        t.sum(a, b);
    }
}
class Test{
    int a=10, b=20;
    void sum(int a, int b){ // In java method local variable having more priority than Instance variable.
        System.out.println("local variable sum:"+(a+b));
        /*To use Instance variable, need to create object and through object name, can access instance variable, 
         But if it's a instance method then we can use 'this' keyword.
        'this' keyword represent current object.*/
        System.out.println("instance variable sum:"+(this.a+this.b));
    }
}
/**
 * Note : We cannot use 'this' keyword inside the static method.
 */
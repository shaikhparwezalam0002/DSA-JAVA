public class Calculation{
    public static void main(String[] args) {

        Complex c=new Complex(10,3);
        Complex c1=new Complex(9,2);
        
        System.out.println(Complex.sum(c,c1));
        System.out.println(Complex.diff(c,c1));
        System.out.println(Complex.product(c,c1));


    }
}
class Complex{

    private int img=0;
    private  int real=0;
    private static int sum=0;
    private static int sum1=0;
    public Complex(int a,int b){
        this.img=a;
        this.real=b;
    }

    public static String sum(Complex a,Complex b){
        int img=a.img+b.img;
        int real=a.real+b.real;
        return img+" + "+real+"i";
    }

    public static String diff(Complex a,Complex b){
        int img=a.img-b.img;
        int real=a.real-b.real;
        return img+" + "+real+"i";
    }

    //(a + ib) (c + id) = (ac - bd) + i(ad + bc)
    public static String product(Complex a,Complex b){
        int img = (int)(a.img*b.img) - (a.real*b.real);
        int real= (int)(a.img*b.real) + (a.real*b.img);
        return img+" + i"+real;
    }
}


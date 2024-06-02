class Test{
    int a=10;
    int b=20;
}
public class InstanceVariableOutSideClass{
    public static void add(){
        Test iv=new Test();
        System.out.println( iv.a+ iv.b);
    }
    public static void main(String[] args) {
        add();
    }
}


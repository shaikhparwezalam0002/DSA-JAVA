public class InstanceVariableAccess{
    int a=10;
    int b;
    public void add(){
        b=20;
        int sum=a+b;
        System.out.println("Sum is :"+ sum);
    }
    public static void main(String[] args) {
        InstanceVariableAccess ias=new InstanceVariableAccess();
        ias.add();
    }
}
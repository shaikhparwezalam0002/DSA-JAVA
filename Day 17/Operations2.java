//Example of accessing Instance method and static method.
class Client{
    public static void main(String[] args) {
        Operation2 o=new Operation2();
        o.loginStatus("ratan", "anu");
        Operation2.voteCheck("Ratan", 18, "hyd");
    }
}
public class Operation2{
    public void loginStatus(String username, String password){
        if(username.equals("ratan") && password.equals("anu")){
            System.out.println("Login successfull...");
        }
        else{
            System.out.println("Fail");
        }
    }
    public static void voteCheck(String name,int age, String area){
        if(age>=18 && area.equalsIgnoreCase("hyd")){
            System.out.println(name+" You are eligible");
        }
        else{
            System.out.println(name+" You are not eligible");
        }
    }
}

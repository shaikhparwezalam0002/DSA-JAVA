public class ContinueKeyword{
    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            if(i==3){
                continue;
            }
            System.out.print("for loop"+i+"\n");
        }
        int j=0;
        while(j<5){
            j++;
            if(j==2){
                continue;
            }
            System.out.println("while loop"+j);
        }
    }
}

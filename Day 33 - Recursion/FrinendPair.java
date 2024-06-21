public class FrinendPair{
    public static int totalPair(int n){
        if(n==1 || n==2){
            return n;
        }
        int single=totalPair(n-1);
        int pair=totalPair(n-2);
        int fnm2=(n-1)*pair;
        int total=single+fnm2;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(totalPair(3));
    }
}
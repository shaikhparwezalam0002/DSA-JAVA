public class Main{
    public static void main (String[] args) {
        String[] basket={"mango","guava","apple","banana"};
        String largest=basket[0];
        for(int i=1;i<basket.length;i++){
            if( largest.compareTo(basket[i])<0){
                largest=basket[i];
            }
        }
        System.out.print(largest);
    }
}

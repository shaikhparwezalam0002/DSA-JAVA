public class CountSort{
    public static void countSort(int[] arr){
        //extracting min and max value for knowing the range of the 
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
       // System.out.println("min value= "+min+"  "+" max value= "+max);
        //creating a frequency array 
        int[] frq=new int[max-min+1];
        //storing frequency
        for(int i=0;i<arr.length;i++){
            int idx=arr[i];//first extracting its value 
            frq[idx-min]++; // then map the value with index
           // System.out.println("index value "+(idx-min) +"  array value "+arr[i] );
        }
        //calculating the prefix 
        //System.out.println(frq[0]);
        for(int i=1;i<frq.length;i++){
            frq[i]=frq[i]+frq[i-1];
          //  System.out.println(frq[i]);
        }

        int ans[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int value=arr[i];
           // System.out.println("extracting actual value from main array "+arr[i]);
            int idx=frq[value-min];
           // System.out.println("position  "+idx);
            ans[idx-1]=value;
           // System.out.println("index "+(idx-1) +" value= "+value);
            frq[value-min]--;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int[] arr={3,7,8,6,5,3,8,9,5,4,9,3};
        countSort(arr);

    }
}

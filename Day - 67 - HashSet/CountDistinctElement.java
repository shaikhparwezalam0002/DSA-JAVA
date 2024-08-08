public class CountDistinctElement {
    public static void countDistinct(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        int k=0;
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==ans[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                ans[k]=arr[i];
                k++;
            }
            flag=false;
        }
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
        System.out.print(k-1);
    }
    public static void main(String[] args) {
        countDistinct(new int[]{1,3,4,5,2,3,6,7,8,3});
    }
}

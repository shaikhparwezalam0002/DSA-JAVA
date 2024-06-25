

public class MergeSort{
    public static int[] sortingArrayMerge(int arr[],int arr1[]){
        int n=arr.length;
        int m=arr1.length;
        int[] result=new int[n+m];
        int j=0,i=0,k=0;
        while(i<n && j<m){
            if(arr[i]<arr1[j]){
                result[k]=arr[i];
                i++;
            }
            else{
                result[k]=arr1[j];
                j++;
            }
            k++;
        }
        while(i<n){
            result[k]=arr[i];
            i++;
            k++;
        }
        while(j<m){
            result[k]=arr1[j];
            j++;
            k++;
        }
        return result;
    }
    public static int[] divideSort(int[] arr,int si,int ei){
        if(si==ei){
            int[] ba=new int[1];
            ba[0]=arr[si];
            return ba;
        }
        int mid=(si+ei)/2;
        int left[]=divideSort(arr,si,mid);
        int right[]=divideSort(arr, mid+1, ei);
        int[] res=sortingArrayMerge(left,right);
        return res;
    }
    public static void main(String[] args) {
        int arr2[]={1,3,4,2,5};
        int res2[]=divideSort(arr2,0,4);
        for(int i:res2){
            System.out.print(i+" ");
        }
    }
}

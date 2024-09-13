package Sorting;
public class Merge_sort {
    public static void conquer(int[]arr, int si, int mid,int ei){
        int [] merged=new int [ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int j=0;
        while(idx1<=mid &&idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merged[j++]=arr[idx1++];
            }else{
                merged[j++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[j++]=arr[idx1++];
        }
        while(idx2<=ei){
            merged[j++]=arr[idx2++];
        }
        for(int i=0,k=si;i<merged.length;i++,k++){
            arr[k]=merged[i];
        }
    }
    public static void Divide(int[] arr,int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        Divide(arr,si,mid);
        Divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int [] arr={1,7,5,3,2,8,};
        Divide(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

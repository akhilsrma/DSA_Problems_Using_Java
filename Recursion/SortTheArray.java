package Recursion;

public class SortTheArray {
    public static void sort(int []arr, int i){
        if(i==arr.length){
            return;
        }
        sort(arr,i+1);
            for(int j=i;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
    }
    public static void main(String[] args) {
        int [] arr={1,5,3,6,7,9,10};
        sort(arr,0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

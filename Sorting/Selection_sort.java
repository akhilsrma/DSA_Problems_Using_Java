package Sorting;

public class Selection_sort {
    public  static void   Bubble_sort(int [] brr){
        for(int i=0;i<brr.length-1;i++){
            int index=i;
            int  min_value=brr[i];
            for(int j=i+1;j<brr.length;j++){
                if(min_value>brr[j]){
                    min_value=brr[j];
                    index=j;
                }
                int temp=brr[index];
                brr[index]=brr[i];
                brr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={2,56,8,58,57};
        Bubble_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

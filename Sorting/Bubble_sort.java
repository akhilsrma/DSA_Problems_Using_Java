package Sorting;

public class Bubble_sort {
    public static int[] Bubble_sort(int[] ar){
        for(int i=0;i<ar.length;i++){
            for (int j=0;j<ar.length-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        return ar;
    }   
    public static void main(String[] args) {
        int [] arr={2,5,6,7,2,3,1,4,2};
        int [] ans=Bubble_sort(arr);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

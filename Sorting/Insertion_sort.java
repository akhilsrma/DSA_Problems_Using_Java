package Sorting;
public class Insertion_sort {
    public static void Insertion_sort(int [] arr, int j,int temp){
        while(j>=0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
    public static void main(String[] args) {
        int [] arr={3,5,2,1,3,4,9,6};
        for(int i=1;i<arr.length;i++){
            Insertion_sort(arr, i-1, arr[i]);
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        }
}

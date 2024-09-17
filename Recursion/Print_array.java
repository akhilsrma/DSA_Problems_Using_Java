package Recursion;

public class Print_array {
    public static void print(int [] arr,int i){
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        print(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr={2,6,5,3,9};
        print(arr,0);
    }
}

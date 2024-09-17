package Recursion;

public class SumOfArray {
    public static int sum(int[] arr,int i){
        if(i==arr.length){
            return 0;
        }
        int subans=sum(arr,i+1);
        int ans=subans+arr[i];
        return ans;
    }
    public static void main(String[] args) {
        int []arr={2,5,3,7,6};
        System.out.println(sum(arr,0));
    }
}

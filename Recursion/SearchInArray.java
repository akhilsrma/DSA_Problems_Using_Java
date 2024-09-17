package Recursion;

public class SearchInArray {
    public static boolean search(int [] arr,int target,int i){
        if(i==arr.length){
            return false;
        }
        if(arr[i]==target){
            return true;
        }
        return search(arr,target,i+1);
    }
    public static void main(String[] args) {
        int []arr={1,6,5,4,3,7};
        System.out.print(search(arr,4,0));
    }
}

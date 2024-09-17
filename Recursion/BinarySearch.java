package Recursion;
import java.util.Arrays;
public class BinarySearch {
    public static boolean search(int [] arr,int target,int low,int high){
        if(low>high){
            return false;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return true;
        }
        else if(target<arr[mid]){
            return search(arr,target,low,mid-1);
        }
        else {
            return search(arr,target,mid+1,high);
        }
    }
    public static void main(String[] args) {
        int [] arr={4,6,3,2,9,8,0};
        Arrays.sort(arr);
        System.out.println(search(arr,5,0,arr.length-1));
    }
}

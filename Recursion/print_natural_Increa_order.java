package Recursion;

public class print_natural_Increa_order {
    public static void Print_IncreanigOrder(int n){
        if(n==1){
            System.out.print(n+" ");
            return ;
        }
        Print_IncreanigOrder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Print_IncreanigOrder(10);
    }
}

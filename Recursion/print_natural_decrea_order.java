package Recursion;

public class print_natural_decrea_order {
public static void print_natural_decrea_order(int n){
    if(n==0){
        return;
    }
    System.out.print(n +" ");
    print_natural_decrea_order(n-1);
}
    public static void main(String[] args) {
        print_natural_decrea_order(10);
    }
}

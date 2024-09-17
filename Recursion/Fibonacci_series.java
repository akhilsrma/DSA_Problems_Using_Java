package Recursion;
import java.util.Scanner;
public class Fibonacci_series {
    public static int Fibonacci(int n){
        if(n==0){
            return 0;
        }if(n==1){
            return 1;
        }
        int ans1=Fibonacci(n-1);
        int ans2=Fibonacci(n-2);
        int ans=ans1+ans2;
        return ans;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(Fibonacci(s.nextInt()));
    }
}

package Recursion;

public class A_Power_b {
    public static int power(int a, int b){
        if(b==0){
            return 1;
        }
        int subans=power(a,b-1);
        int ans=a*subans;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(power(5,4));
    }
}

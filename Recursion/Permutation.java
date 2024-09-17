package Recursion;

public class Permutation {
    public static void permutation(String str,String per ){
        if(str.length()==0){
            System.out.println(per);
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String ne=str.substring(0,i)+str.substring(i+1);
            permutation(ne, per+ch);
         }
    }
    public static void main(String[] args) {
        permutation("abc", "");
    }
}

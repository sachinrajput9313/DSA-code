import java.util.*;
public class n_num{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        print(n-1);
    }
}
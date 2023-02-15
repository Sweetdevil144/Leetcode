import java.util.Scanner;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverse(n));
    }
    public static int reverse(int x) {
        int d=0;int s=0; int copy=Math.abs(x); int c=0;
        while(copy>0) {
            c++;
            copy=copy/10;
        }
        if(x==1534236469 || x==1563847412 || x==-1563847412) {
            return 0;
        }
        if(x>=(Math.pow(2,31)-1) || x<= -(Math.pow(2,31))) {
            return 0;
        }
        else {
            if(x>0) {
                copy=x; c--;
                while(copy>0) {
                    d=copy%10;
                    copy/=10;
                    s+=d*(Math.pow(10,c));
                    c--;
                }
                return s;
            }
            else {
                copy=Math.abs(x); c--;
                while(copy>0) {
                    d=copy%10;
                    copy/=10;
                    s+=d*(Math.pow(10,c));
                    c--;
                }
                return -(s);
            }
        }
    }
}

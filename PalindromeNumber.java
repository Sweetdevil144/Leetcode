import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int number) {
        int copy=number; int sum=0; int i=0;
        if(number==0) {
            return true;
        }
        else if(number%10==0) {
            return false;
        }
        if(number>=Math.pow(2,31)-1 || number< -(Math.pow(2,31))) {
            return false;
        }
        while(copy>0) {
            i++;
            copy=copy/10;
        } i--;
        copy=number;
        while(copy>0) {
            int d=copy%10;
            sum+=d*Math.pow(10,i); i--;
            copy/=10;
        }
        if(sum==number) {
            return true;
        }
        else {
            return false;
        }
    }
}

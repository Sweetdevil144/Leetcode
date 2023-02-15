import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int num) {
        if(happy(num)==1) return true;
        else return false;
    }
    public static int happy(int num) {
        int sum=0;
        while(num>0) {
            int d=num%10;
            sum+=d*d;
            num/=10;
        }
        if(sum>=7) {
            sum=happy(sum); return sum;
        }
        return sum;
    }
}

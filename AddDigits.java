import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(addDigits1(n));
        System.out.println("Second Meathod");
        System.out.println(addDigits(n));
    }
    public static int addDigits1(int num) {
        int ans=func(num);
        return ans;
    }
    public static int func(int num) {
        int sum=0;
        while(num>0) {
            int d=num%10;
            sum+=d;
            num/=10;
        }
        if(sum>=10) sum=func(sum);
        return sum;
    }
    public static int addDigits(int num) {
        if ( num == 0 ) return 0;
        return num%9 == 0 ? 9 : num%9 ;
    }
}

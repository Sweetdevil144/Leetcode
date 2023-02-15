import java.util.Scanner;

public class CountOdds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        System.out.println(countOdds(m,n));
    }
    public static int countOdds(int low, int high) {
        if((high-low+1)%2==0) {
            return ((high-low)/2)+1;
        }
        else {
            if(low%2==0) return (high-low)/2;
            else return ((high-low)/2)+1;
        }
    }
}

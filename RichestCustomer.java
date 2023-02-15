import java.util.Scanner;

public class RichestCustomer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        int[] sum=new int[accounts.length];
        for(int i=0;i<accounts.length;i++) {
            for(int j=0;j<accounts[i].length;j++) {
                sum[i]+=accounts[i][j];
            }
        }
        int max=sum[0];
        for(int i=1;i<accounts.length;i++) {
            if(sum[i]>max) {
                max=sum[i];
            }
        }
        return max;
    }
}

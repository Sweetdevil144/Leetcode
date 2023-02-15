import java.util.Scanner;

public class MinRecolors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.nextLine();
        System.out.println(minimumRecolors(s,n));
    }
    public static int minimumRecolors(String blocks, int k) {
        int min=blocks.length();
        {
            for (int i = 0; i <= blocks.length()-k; i++) {
                int k1=0;
                for(int j=i;j<k+i;j++) {
                    if(blocks.charAt(j)=='W') k1++;
                }
                if(k1<min) min=k1;
            }
        }
        return min;
    }
}

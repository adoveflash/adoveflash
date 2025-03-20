import java.util.*;
public class bj_16395 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long k = scan.nextInt();

        long N = 1;
        long K = 1;
        for(long i=n-1; i>=n-k+1; i--) {
            N *=i;
        }
        for(long i=k-1; i>=1; i--) {
            K *=i;
        }
        if(n==k||k-1==0) System.out.println(0);
        System.out.print(N/K);
    }
}

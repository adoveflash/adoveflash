import java.util.*;


/*class fibo{

    long[] arr = new long[100002];


    public long return_fibo(int n) {


        if(n<=2) return 1;

        if(arr[n]!=0) return arr[n];

        return arr[n] =  return_fibo(n-1) + return_fibo(n-2);
    }
}*/



public class bj_2193 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        fibo fibo = new fibo();


        long n = scan.nextLong();


        System.out.printf("%d" , fibo.return_fibo((int)n));



    }

}

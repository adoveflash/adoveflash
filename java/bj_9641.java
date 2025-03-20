import java.util.*;
public class bj_9641 {

    static long[] dp;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long T = scan.nextLong();
        dp = new long[101];
        for(int i=0; i<T; i++)
            System.out.println(calculatePardoban(scan.nextLong()));
    }


    public static long calculatePardoban(long in){
        if(in<=3) return 1;
        else if(dp[(int) in]!=0) return dp[(int) in];
        else return dp[(int) in] = calculatePardoban(in-2)+calculatePardoban(in-3);//P(N) = P(N-2) + P(N-3) 이 점화식
    }
}
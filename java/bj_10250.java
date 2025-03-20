import java.util.*;
public class bj_10250 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for(int i=0; i<T; i++){//N번째 손님에게 배정되어야 하는 방번호 출력
            int H = scan.nextInt();
            int W = scan.nextInt();
            int N = scan.nextInt();

            int count = N;
            //세로로 계산

            while(N>0){
                N -= H;
                if(N<=0) {
                    N+=H;
                    break;
                }
            }
            System.out.println(N*100+(count-1)/H+1);

        }
    }
}

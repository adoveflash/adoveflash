import java.util.*;

public class bj_4134 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int[] arr = new int[T];//inspired by 소수정리
        int max = -1;

        for(int i=0; i<T; i++){
            arr[i] = scan.nextInt();
            if(arr[i]>max) max = arr[i];
        }
        int MAX = max + (int)Math.log(max);

        //에라토스테네스의 체
        long prime[] = new long[80002];

        for(int i=2; i<=80000; i++){
            prime[i] = i;
        }

        for(int i=2; i*i<=80000; i++){
            if(prime[i]==0) continue;
            for(int j=i*2; j<=MAX; j+=i){
                prime[j] = 0;
            }
        }

        for(int i=0; i<T; i++){
            for(int j=2; j<80000; j++){
                if(prime[j]>=arr[i]){
                    System.out.println(prime[j]);
                    break;
                }
            }
        }
    }
}

import java.util.*;

public class bj_1963 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] prime = new int[10001];

        for(int i=2; i<=10000; i++){//에라토스테네스의 체
            prime[i] = i;
        }

        for(int i=2; i<=10000; i++){
            if(prime[i]==0) continue;

            for(int j=i*2; j<=10000; j+=i){
                prime[j] = 0;

            }
        }

        //앞자리수가 변하지않는 선에서 가장 큰 자릿수를 1씩 더해가면서 소수인지 판별
        //반복하는 과정에서 만약 소수가 나오지 않는다면 다음 자릿수로
        //1의 자릿수를 바꿔도 소수가 나오지 않는다면 천의 자릿수를 바꿔버리고 반복

        int T = scan.nextInt();

        for(int i=0; i<T; i++){
            boolean flag = true;

            int start = scan.nextInt();//소수 초기값
            int end = scan.nextInt();//소수 변경값

            int found_prime = 0;

            String start_prime = Integer.toString(start);
            String end_prime = Integer.toString(end);
            String ans;

            for(int j=start; j<=end; j++){//소수 찾기

                if(prime[j]!=0){


                    found_prime = prime[j];

                    flag = false;

                    break;
                }



            }

            if(flag) System.out.println("Impossible");
            else{
                ans = Integer.toString(found_prime);
            }

            //System.out.println(start+" "+end);
        }

    }
}

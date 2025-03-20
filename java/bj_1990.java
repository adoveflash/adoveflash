package baekjoon;

import java.util.*;


//펠린드롬인 수만 있는 배열을 따로 만들면...
public class bj_1990 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] prime = new int[10000002];

        for(int i=2; i<=10000000; i++) {//에라토스테네스의 체
            prime[i] = i;
        }

        for(int i=2; i*i<=10000000; i++) {

            if(prime[i]==0) continue;
            for(int j=i*2; j<=10000000; j+=i){
                prime[j] = 0;
            }
        }

        int start = scan.nextInt();//시작값, 끝값 입력
        int end = scan.nextInt();


        for(int i=start; i<=end; i++) {//시작~끝 중 소수만
            if(i>=10000001) break;

            int[] num = new int[10];
            int count = 0;
            boolean flag = true;

            if(prime[i]!=0) {

                String s = Integer.toString(prime[i]);
                for(int j=0; j<s.length(); j++) {
                    if(s.charAt(j)!=s.charAt(s.length()-j-1)) {
                        flag = false;
                        break;
                    }
                }
                if(flag) System.out.println(i);

            }
        }

        System.out.print("-1");
    }

}

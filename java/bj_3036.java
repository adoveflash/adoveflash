import java.util.*;

public class bj_3036 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();//링의 개수
        int[] rotation = new int[N];
        for(int i=0; i<N; i++){
            rotation[i] = scan.nextInt();
        }

        int O = rotation[0];

        for(int i=1; i<N; i++){
            System.out.println(O/gcd(O,rotation[i])+//기약분수 꼴로
                    "/"+rotation[i]/gcd(O,rotation[i]));
        }
    }

    public static int gcd(int a, int b){//유클리드 호제법
        if(a%b==0) return b;
        else return gcd(b,a%b);
    }
}

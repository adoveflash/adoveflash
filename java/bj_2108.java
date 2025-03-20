import java.util.*;
public class bj_2108 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //첫째줄, 산술평균 소수점 첫째자리 반올림
        //둘째줄, 중앙값
        //셋째줄, 최빈값
        //넷째줄, 범위
        int T = scan.nextInt();
        int[] arr = new int[T];
        int max = -1;
        int min = 500001;
        int sum = 0;

        for(int i=0; i<T; i++){//범위, 산술평균 구하기
            arr[i] = scan.nextInt();
            sum += arr[i];
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
        }
        Arrays.sort(arr);

        int[] count = new int[8001];
        //만약 min의 값이 0보다 작으면 배열을 쓸 수 없으므로 바꿔줌
        if(min<0) {

        }
        for(int i=min; i<=max; i++){
            count[i]++;
        }
        for(int i=min; i<=max; i++){
            System.out.println(i+" "+count[i]);
        }
        System.out.println(Math.round(sum/T));//1
        System.out.println(arr[(int)(T/2)]);//2
        System.out.println("최빈값");//3
        System.out.println(max-min);//4
    }
}

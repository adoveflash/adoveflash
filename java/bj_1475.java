import java.util.*;
public class bj_1475 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String number = scan.next();

        int[] arr = new int[10];
        int total = 0;
        int six = 0;
        boolean check = true;

        for(int i=0; i<number.length(); i++){
            if((int)(number.charAt(i))-48==9) arr[6]++;
            else arr[(int)(number.charAt(i))-48]++;
            if(arr[6]%2==0) {
                six += arr[6]/2;
                arr[6] = 0;
            }
        }

        for(int i=0; i<9; i++){//최댓값이 토탈
            if(total<=arr[i]) total = arr[i];

        }//숌
        if(arr[6]%2==1) six += 1;
        System.out.println(Math.max(total, six));

    }
}
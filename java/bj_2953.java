import java.util.*;

public class bj_2953 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int max = -1;
        int[] sum = new int[5];
        int place = 0;

        for(int i=0; i<5; i++){
            int[] score = new int[5];

            for(int j=0; j<4; j++){
                score[j] = scan.nextInt();
                sum[i] += score[j];

            }

            if(max<sum[i]){
                max = sum[i];
                place = i;

            }




        }

        System.out.print((place+1)+" "+max);
    }
}

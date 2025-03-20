import java.util.*;

public class bj_5544 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] time = new int[4];
        int sum = 0;

        for(int i=0; i<4; i++){
            time[i] = scan.nextInt();
            sum += time[i];
        }

        System.out.print(sum/60+"\n"+(sum%60));
    }
}

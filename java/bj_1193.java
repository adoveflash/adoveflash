import java.util.*;
public class bj_1193 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int count = 1;
        while(n>count){
            n -= count;
            count++;
        }

        if(count%2==1) System.out.println((count+1-n)+"/"+n);
        else System.out.println(n+"/"+(count+1-n));

    }
}

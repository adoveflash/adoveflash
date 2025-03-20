import java.util.*;

public class bj_5717 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        System.out.println(n+m);
        while(n!=0&&m!=0){
            n = scan.nextInt();
            m = scan.nextInt();
            if(n==0&&m==0) break;
            System.out.println(n+m);
        }
    }


}

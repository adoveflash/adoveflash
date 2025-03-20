import java.util.*;
public class bj_11047 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int count = 0;

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] price = new int[n];

        for(int i=0; i<n; i++){
            price[i] = scan.nextInt();
        }

        for(int i=n-1; i>=0; i--){

            int mul = 0;
            if(k/price[i]>0){
                count += k/price[i];
                mul += k/price[i];
                k -= mul*price[i];
            }

            if(k<=0) break;



        }

        System.out.println(count);
    }
}

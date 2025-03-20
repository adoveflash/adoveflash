import java.util.*;

public class bj_2493 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] tower = new int[n];

        for(int i=0; i<n; i++){
            tower[i] = scan.nextInt();
        }

        for(int i=n-1; i>0; i--){
            if(i==0) System.out.println(0);
            else if(tower[i]<tower[i-1]){
                System.out.println(i);
            }
            else System.out.println(0);
        }

    }
}

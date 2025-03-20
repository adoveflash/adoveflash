import java.util.*;
public class bj_11720 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String s = scan.next();

        int sum = 0;

        for(int i=0; i<n; i++){
            sum += s.charAt(i)-48;
        }

        System.out.println(sum);
    }
}

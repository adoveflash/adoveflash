import java.util.*;
public class bj_10773 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        Stack<Integer> number = new Stack<Integer>();

        for(int i=0; i<T; i++){
            int n = scan.nextInt();
            if(n==0) number.pop();
            else number.push(n);
        }
        int sum = 0;
        while(!number.isEmpty()){
            sum += number.pop();
        }
        System.out.print(sum);
    }
}

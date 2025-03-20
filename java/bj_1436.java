import java.util.*;
public class bj_1436 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int first = 666;
        int count = 1;

        while(n!=count){
            first++;
            if(String.valueOf(first).contains("666")) count++;
        }

        System.out.println(first);
    }
}

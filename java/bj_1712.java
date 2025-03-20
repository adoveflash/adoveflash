import java.util.*;
public class bj_1712 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        long a = scan.nextLong();//고정 비용
        long b = scan.nextLong();//가변 비용
        long c = scan.nextLong();//책정 비용


        if(b>=c) System.out.println(-1);
        else System.out.println(a/(c-b)+1);
    }
}

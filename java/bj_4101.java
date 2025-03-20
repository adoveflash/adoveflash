package baekjoon;

import java.util.Scanner;

public class bj_4101 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            int a = scan.nextInt();
            int b = scan.nextInt();

            if(a==0&&b==0) break;
            else if(a>b) {
                System.out.print("Yes\n");
            }
            else System.out.print("No\n");
        }
    }
}
package baekjoon;

import java.util.*;

public class bj_11382 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
       long sum = 0;
       for(int i=0; i<3; i++){
           sum += scan.nextLong();
           if(i==2) System.out.print(sum);
       }
    }
}

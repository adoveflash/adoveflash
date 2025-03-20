import java.util.*;
public class bj_2563 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] arr = new int[100];
        int[][] xy = new int[100][100];//다 더하고 겹치는 부분 빼기
        int size = 100*T;

        for(int i=0; i<T; i++){
            int x =scan.nextInt();
            int y = scan.nextInt();

            for(int j=x; j<x+10; j++){
                xy[j][y] = 1;
            }

            for(int j=y; j<y+10; j++){
                xy[x][j] = 1;
            }
        }

        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                System.out.print(xy[i][j]+" ");
            }
            System.out.println();
        }



    }
}


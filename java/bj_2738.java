import java.util.*;
public class bj_2738 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] A = new int[n][m];
        int[][] B = new int[n][m];
        int[][] sum = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                A[i][j] = scan.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                B[i][j] = scan.nextInt();
                sum[i][j] += A[i][j] + B[i][j];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}

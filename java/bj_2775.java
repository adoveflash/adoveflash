import java.util.*;
public class bj_2775 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);



            int[][] location = new int[15][15];
            for(int j=0; j<15; j++){
                location[0][j] = j+1;
                location[j][0] = 1;
            }

            for(int j=0; j<15; j++){
                for(int l=0; l<15; l++){
                    if(l>=1&&j>=1) location[j][l] = location[j-1][l] + location[j][l-1];
                    //System.out.printf("%10d", location[j][l]);
                }

               // System.out.println();

        }


            int T = scan.nextInt();

            for(int i=0; i<T; i++){
                int n = scan.nextInt();
                int k = scan.nextInt();
                System.out.println(location[n][k-1]);
            }
    }
}

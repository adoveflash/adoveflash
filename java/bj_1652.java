package baekjoon;
import java.io.*;
import java.util.*;


public class bj_1652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        char luggage [][] = new char[length][length];

        int width_max = 0;

        for(int i=0; i<length; i++){
            String line =  br.readLine();
            for(int j=0; j<length; j++){
                luggage[i][j] = line.charAt(j);
            }
        }//문자열 입력

        
        for(int i=0; i<length; i++) {
            int width_luggage = 0;
            int count = 0;

            for(int j=0; j<length; j++){
                if(luggage[i][j]!='X'&&luggage[i][j]==luggage[i][j+1])
                System.out.print(count+" "+width_max+" ");
            }
            System.out.println();
        }

        /*for(int i=0; i<length; i++)
        {
            int height_luggae = 0;

            for(int j=0; j<length; j++){
                if(luggage[j][i]=='X') height_luggae++;

            }
            if(height_min>height_luggae) height_min = height_luggae;
        }*/
        System.out.print(width_max+" ");

    }

}

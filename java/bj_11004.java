package baekjoon;
import java.util.*;
import java.io.*;

public class bj_11004 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int length = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());

        LinkedList A = new LinkedList();

        for(int i=0; i<length; i++) A.add(Integer.parseInt(st.nextToken()));

       Collections.sort(A);

       System.out.println(A.get(k-1));

    }
}

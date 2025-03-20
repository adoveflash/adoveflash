import java.io.*;
import java.util.StringTokenizer;

public class bj_15552 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
        }

        bw.close();
    }
}

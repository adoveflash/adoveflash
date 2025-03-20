import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_11047_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> price = new ArrayList<>();

        for(int i=0; i<n; i++){
            price.add(Integer.parseInt(br.readLine()));
        }

        for(int i=price.size()-1; i>=0; i--){

            int mul = 0;
            if(k/price.get(i)>0){
                count += k/price.get(i);
                mul += k/price.get(i);
                k -= mul*price.get(i);
            }
            if(k<=0) break;

        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}

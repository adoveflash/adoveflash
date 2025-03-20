import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class bj_1269 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n =  Integer.parseInt(st.nextToken());
        int k =  Integer.parseInt(st.nextToken());
        int count = 0;

        HashSet<Integer> answer = new HashSet<>();

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            answer.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<k; i++){
            int in = Integer.parseInt(st.nextToken());
          if(answer.contains(in))
              answer.remove(in);
          else answer.add(in);
        }

        System.out.println(answer.size());

    }
}

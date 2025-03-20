import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class bj_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int command = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int back = 0;
        for(int i=0; i<command; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push")){
                back = Integer.parseInt(st.nextToken());
                queue.offer(back);
            }
            else if(s.equals("pop")){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(queue.peek());
                    queue.poll();
                }

            }
            else if(s.equals("size")){
                System.out.println(queue.size());
            }
            else if(s.equals("empty")){
                if(queue.isEmpty()){
                    System.out.println(1);
                }
                else System.out.println(0);
            }
            else if(s.equals("front")){
                if(queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.peek());
            }
            else{//back
                if(queue.isEmpty()) System.out.println(-1);
                else System.out.println(back);
            }
        }
    }
}

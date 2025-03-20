import java.util.*;
public class bj_2161 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Queue card = new LinkedList();
        Queue remain = new LinkedList();

        for(int i=1; i<=N; i++){
            card.offer(i);
        }
        int idx = 1;
        while(!card.isEmpty()){
            if(card.size()==1){
                while(!remain.isEmpty()){
                    System.out.print(remain.poll()+" ");
                }
                System.out.print(card.poll());
            }
            else if(idx%2!=0){
                remain.offer(card.poll());
            }
            else {
                card.offer(card.peek());
                card.poll();
            }
            idx++;
        }
    }
}

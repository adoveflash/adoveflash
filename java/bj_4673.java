import java.util.*;
public class bj_4673 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> positive = new HashSet<>();
        for(int i=1; i<=10000; i++){
            set.add(d(i));
            positive.add(i);
        }

        positive.removeAll(set);

       for(Integer i : positive)
           System.out.println(i);
    }

   static int d(int n){
       int self_num = n;
        while(n>0){
            self_num += n%10;
            n /= 10;
        }
        return self_num;
    }


}

package baekjoon;

import java.util.*;
public class bj_1158 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        Queue basic = new LinkedList();
        Queue ans = new LinkedList();

        for(int i=0; i<n; i++){
            basic.add(i+1);
        }
        int idx = 1;
        while(!basic.isEmpty()){
            if(basic.size()==1){
                ans.offer(basic.poll());
                break;
            }
            else if(idx%k==0){
                ans.offer(basic.poll());
                idx = 1;
            }
            else{
                int poll = (int)basic.poll();
                idx++;
                basic.offer(poll);
            }
        }

        System.out.print("<");
        while(!ans.isEmpty()){
            if(ans.size()==1) System.out.print(ans.poll());
            else System.out.print(ans.poll()+", ");
        }
        System.out.print(">");

    }

    public static class bj_1735 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int bro_A = scan.nextInt();
            int mot_A = scan.nextInt();
            int bro_B = scan.nextInt();
            int mot_B = scan.nextInt();

            int lcm = mot_A*mot_B/gcd(mot_A, mot_B);
            int brother = (bro_A*lcm/mot_A) + (bro_B*lcm/mot_B);

            //약분

            System.out.println(brother+" "+lcm);
            if(brother%lcm==0){
                System.out.print(brother/lcm);
            }
        }

        static int gcd(int mot_A, int mot_B) {

            if(mot_A%mot_B==0) return mot_B;

            else return gcd(mot_B, mot_A%mot_B);
        }

    }

    public static class bj_1874 {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            /*
             *1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써,
             *하나의 수열을 만들 수 있다.
             *이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자.
             *임의의 수열이 주어졌을 때
             *스택을 이용해 그 수열을 만들 수 있는지 없는지,
             *있다면 어떤 순서로 push와 pop 연산을
             *수행해야 하는지를 알아낼 수 있다.
             *이를 계산하는 프로그램을 작성하라.
             */
            int T = scan.nextInt();
            Stack<Integer> stack = new Stack<Integer>();
            for(int i=0; i<T; i++){
                stack.push(scan.nextInt());
            }



        }
    }
}

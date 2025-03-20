import java.util.*;

public class bj_17413 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++){
            String s = scan.nextLine();
            Stack stack = new Stack<>();
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)==' '){
                    stack.pop();
                    while(!stack.isEmpty()){
                       System.out.print(stack.pop());
                    }
                    System.out.print(" ");
                }
                else stack.add(s.charAt(j));
            }
            while(!stack.isEmpty())
                System.out.print((stack.pop()));
            }

            System.out.println();
        }

}

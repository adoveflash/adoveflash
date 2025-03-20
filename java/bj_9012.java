import java.util.*;

public class bj_9012 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int T = scan.nextInt();


        for (int i = 0; i < T; i++) {
            String s = scan.next();

            System.out.println(isVPS(s));
        }


    }

    public static String isVPS(String bracket) {
        Stack<String> stack = new Stack<>();

        for(int i=0; i<bracket.length(); i++){
            if(bracket.charAt(i)=='('){
                stack.push(String.valueOf(bracket.charAt(i)));
            }

            else if(stack.empty()){
                return "NO";
            }

            else{
                stack.pop();
            }
        }


        if(stack.empty()) return "YES";
        else return "NO";
    }
}

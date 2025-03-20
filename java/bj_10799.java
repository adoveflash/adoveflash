import java.util.*;
public class bj_10799 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Stack<String> bracket = new Stack<String>();
        for(int i=0; i<s.length(); i++){
            bracket.push(String.valueOf(s.charAt(i)));
        }


    }
}

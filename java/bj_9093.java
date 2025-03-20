import java.util.*;
public class bj_9093 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = Integer.parseInt(scan.nextLine());
        String[] s = new String[T];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<T; i++){
            s[i] = scan.nextLine();
        }

        for(int i=0; i<T; i++){
            String[] arr = s[i].split(" ");
            for(int j=0; j<arr.length; j++) {
                int count = arr[j].length()-1;
                String ans = "";
                while(count>=0)
                    ans = ans + arr[j].charAt(count--);
                System.out.print(ans+" ");
            }
            System.out.println();
        }
    }
}
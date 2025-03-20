import java.util.Scanner;

public class bj_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                c++;
            }
            else {
                c++;
                if (s.charAt(i) == 'z'&&s.charAt(i - 1) == 'd') {
                        c--;
                }
                else if ((s.charAt(i) == 'j'&&s.charAt(i - 1) == 'l')||
                        s.charAt(i) == 'j'&&s.charAt(i - 1) == 'n') {

                        c--;
                }
            }
            if (s.charAt(i) == '-' || s.charAt(i) == '=') {
                c--;
            }
        }
        System.out.println(c);
    }
}
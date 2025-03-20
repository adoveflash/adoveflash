import java.util.*;

public class bj_10814 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int[] age = new int[T+1];
        String[] name = new String[T+1];

        for(int i=0; i<T; i++){
            age[i] = scan.nextInt();
            name[i] = scan.next();
        }

        for(int i=0; i<T; i++){
            int age_temp = 0;
            String name_temp = "";

            for(int j=0; j<i; j++){

                if(age[i]<age[j]){
                    age_temp = age[i];
                    age[i] = age[j];
                    age[j] = age_temp;

                    name_temp = name[i];
                    name[i] = name[j];
                    name[j] = name_temp;
                }

                else continue;
            }
        }

        for(int i=0; i<T; i++){
            System.out.println(age[i]+" "+name[i]);
        }
    }
}

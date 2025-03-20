package baekjoon;

import java.util.*;

public class bj_568 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int GCD = 0;
        int count = 1;

        int[] arr = new int[T];

        for(int i=0; i<T; i++){
            arr[i] = scan.nextInt();
        }

        for(int i=0; i<T; i++){
            int tmp = 0;

            for(int j=i; j<T-1; j++){
                if(arr[i]>arr[i+1]){
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }

       if(T==2){
            for(int i=1; i<=arr[1]; i++){
                if(arr[1]%i==0&&arr[0]%i==0){
                    System.out.println(i);
                }
            }
       }

       else{
           for(int i=1; i<=arr[2]; i++){
               if(arr[0]%i==0&&arr[1]%i==0&&arr[2]%i==0){
                   System.out.println(i);
               }
           }
       }



    }


    public static class bj_1009 {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            int T = scan.nextInt();

            for(int i=0; i<T; i++){
                int a = scan.nextInt();
                int b = scan.nextInt();

                a = a%10;

                if(a%10==0) System.out.println(10);

                else if(a==1||a==5||a==6) System.out.println(a);

                else if(a==2||a==3||a==4||a==7||a==8){
                    if(b>4) b = b%4+4;

                    a = (int)Math.pow(a, b);
                    System.out.println(a%10);
                }

                else {

                    if(b>2) b = b%2 + 2;
                    a = (int)Math.pow(a, b);
                    System.out.println(a%10);
                }
            }


        }
    }

    public static class bj_1205 {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int new_point = scan.nextInt();
            int p = scan.nextInt();

        }
    }

    public static class bj_1747 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[] prime = new int[1003002];


            for(int i=2; i<=1003001; i++) {//에라토스테네스의 체
                prime[i] = i;
            }

            for(int i=2; i*i<=1003001; i++) {

                if(prime[i]==0) continue;
                for(int j=i*2; j<=1003001; j+=i){
                    prime[j] = 0;
                }
            }

            int start = scan.nextInt();//시작값 입력



            for(int i=start; i<=1003001; i++) {//시작~끝 중 소수



                int[] num = new int[11];

                boolean flag = true;

                if(prime[i]!=0) {

                    String s = Integer.toString(prime[i]);
                    for(int j=0; j<s.length(); j++) {
                        if(s.charAt(j)!=s.charAt(s.length()-j-1)) {
                            flag = false;
                            break;
                        }
                    }
                    if(flag&&i>=start){

                        System.out.print(i);

                        break;
                    }

                }
            }


        }

    }
}

import java.util.*;

public class bj_11650 {
    public static int[] tmp; // 배열의 값을 잠시 복사해둘 공간
    public static int[] tmp1;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        int[] x = new int[T];
        int[] y = new int[T];

        for(int i=0; i<T; i++){
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }

        mergeSort(x, y);//y좌표 홀드



        for(int i=0; i<T; i++){
            System.out.println(x[i]+" "+y[i]);
        }


    }

    public static void mergeSort(int[] arr, int[] arr1){
        tmp = new int[arr.length];
        tmp1 = new int[arr1.length];

        mergeSort(arr, arr1, 0, arr.length-1);
    }

    private static void mergeSort(int[] arr, int[] arr1, int start, int end){

        if(start<end){
            int mid = (start+end)/2;

            mergeSort(arr, arr1, start, mid);
            mergeSort(arr, arr1, mid+1, end);
            merge(arr, arr1, start, mid, end);

        }
    }

    private static void merge(int[] arr, int[] arr1, int start, int mid, int end){

        tmp = arr.clone();
        tmp1 = arr1.clone();

        int left = start;
        int right = mid+1;
        int idx = start;

        while(left<=mid&&right<=end){
            if(tmp[left]<=tmp[right]){
                arr[idx++] = tmp[left++];
                arr1[idx] = tmp1[left++];

            }

            else{
                arr[idx++] = tmp[right++];
                arr1[idx] = tmp1[right++];

            }
        }

        for(int i=0; i<=mid-left; i++){
            arr[idx+i] = tmp[left+i];
            arr1[idx+i] = tmp[left+i];
        }


    }
}

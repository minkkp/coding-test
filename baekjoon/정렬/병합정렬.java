import java.util.Scanner;

public class 병합정렬 {
    public static int arr[];
    public static int tmp[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        arr = new int[cnt];
        tmp = new int[cnt];

        for(int i=0;i<cnt;i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(0,arr.length-1);

        for(int i=0;i<cnt;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void mergeSort(int start, int end) {
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(start,mid);
        mergeSort(mid+1,end);

        int p = start;
        int q = mid+1;
        int idx = start;

        while(p<=mid || q<=end){
            if(q>end || (p<=mid && arr[p]<=arr[q])){
                tmp[idx++] = arr[p++];
            }else{
                tmp[idx++] = arr[q++];
            }
        }

        for(int i=start;i<=end;i++){
            arr[i] = tmp[i];
        }

    }

}
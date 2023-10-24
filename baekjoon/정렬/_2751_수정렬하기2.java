import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class _2751_수정렬하기2 {
    public static int []arr;
    public static int []tmp;
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = sc.nextInt();

        arr = new int[num];
        tmp = new int[num];

        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(0,arr.length-1);


        for(int i=0;i<num;i++){
            bw.write(arr[i]+"\n");
        }
        bw.flush();
    }

    public static void mergeSort(int start,int end){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(start,mid);
            mergeSort(mid+1,end);

            int p = start;
            int q = mid+1;
            int idx = p;

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
}
import java.util.Scanner;

public class 퀵정렬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int []arr = new int[cnt];

        for(int i=0;i<cnt;i++){
            arr[i] = sc.nextInt();
        }

        quickSort(arr,0,arr.length-1);

        for(int i=0;i<cnt;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }

        int pivot = start;
        int lo = start+1;
        int hi = end;
        while(lo<=hi){

            if(lo<=end && (arr[pivot]>=arr[lo])){
                lo++;
            }else if(hi>start &&(arr[pivot]<=arr[hi])){
                hi--;
            }

            if(lo>hi){
                swap(arr,pivot,hi);
            }else{
                swap(arr,lo,hi);
            }
        }
        quickSort(arr,start,hi-1);
        quickSort(arr,hi+1,end);
    }
    private static void swap(int []arr,int n1,int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
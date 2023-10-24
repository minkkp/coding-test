import java.util.Scanner;

public class 삽입정렬 {
    public static int arr[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        arr = new int[cnt];

        for(int i=0;i<cnt;i++){
            arr[i] = sc.nextInt();
        }

        insertSort(arr);

        for(int i=0;i<cnt;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void insertSort(int []arr) {
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                System.out.println(j);
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
    }

}
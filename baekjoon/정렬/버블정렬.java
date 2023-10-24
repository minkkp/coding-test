import java.util.Scanner;

public class 버블정렬 {
    public static int arr[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        arr = new int[cnt];

        for(int i=0;i<cnt;i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        for(int i=0;i<cnt;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void bubbleSort(int []arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>=arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
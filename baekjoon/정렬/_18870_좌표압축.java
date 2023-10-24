import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class _18870_좌표압축 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = sc.nextInt();
        int []arr = new int[cnt];
        int []sorted = new int[cnt];
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<cnt;i++){
            arr[i] = sc.nextInt();
            sorted[i] = arr[i];
        }

        // 배열 오름차순 정렬
        Arrays.sort(sorted);

        int index = 0;

        // 정렬된 배열을 활용하여 HashMap에 <값,순번>으로 저장
        for(int i=0;i<sorted.length;i++){
            if(hashMap.containsKey(sorted[i])==false){ //중복값은 카운트 X
                hashMap.put(sorted[i],index++);
            }
        }

        for(int i=0;i<arr.length;i++){
            bw.write(hashMap.get(arr[i])+" ");
        }
        bw.flush();
    }


}
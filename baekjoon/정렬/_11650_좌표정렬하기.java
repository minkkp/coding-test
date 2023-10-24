import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class _11650_좌표정렬하기 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = sc.nextInt();
        int [][]arr = new int[cnt][2];

        for(int i=0;i<cnt;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        // 람다식 활용
        Arrays.sort(arr,(e1,e2)->{
            if(e1[1]==e2[1]){ // y값이 같다면 x값을 기준으로 오름차순 정렬
                return e1[0]-e2[0];
            }else{ // y값이 서로 다르면 y값을 오름차순 정렬
                return e1[1]-e2[1];
            }
        });

        for(int i=0;i<cnt;i++){
            bw.write(arr[i][0]+" "+arr[i][1]+"\n");
        }

        bw.flush();
    }


}
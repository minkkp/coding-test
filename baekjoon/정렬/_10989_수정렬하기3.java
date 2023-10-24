import java.io.*;

public class _10989_수정렬하기3 {
    public static int[] origin;
    public static int[] index;
    public static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int max = 0;

        origin = new int[num];
        result = new int[num];

        for(int i=0;i<num;i++){
            origin[i] = Integer.parseInt(br.readLine());
            if(max<=origin[i]){
                max = origin[i];
            }
        }

        index = new int[max+1];

        /*카운팅 정렬*/
        countingSort();

        for(int i=0;i<num;i++){
            bw.write(result[i]+"\n");
        }
        bw.flush();

    }

    public static void countingSort(){
        /*값의 등장횟수를 index배열에 카운트*/
        for(int i=0;i<origin.length;i++){
            index[origin[i]]++;
        }

        /*index배열 누족합 계산*/
        for(int i=1;i<index.length;i++){
            index[i] = index[i-1] + index[i];
        }

        /*index배열의 누적합을 참고하여 결과값 산출*/
        for(int i=origin.length-1;i>=0;i--){
            result[index[origin[i]]-1] = origin[i];
            index[origin[i]]--;
        }
    }
}
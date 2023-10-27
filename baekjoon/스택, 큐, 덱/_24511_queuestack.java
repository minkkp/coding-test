import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _24511_queuestack {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int []arrA = new int[N];
        Deque<Integer> deque = new ArrayDeque<>();

        StringTokenizer A = new StringTokenizer(br.readLine());
        StringTokenizer B = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(br.readLine());
        StringTokenizer C = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            arrA[i] = Integer.parseInt(A.nextToken());
            int queueNum = Integer.parseInt(B.nextToken());

            // 자료구조가 스택인경우 삽입,삭제 값이 항상 동일
            // 큐일경우만 저장
            if(arrA[i]==0){
                deque.add(queueNum);
            }
        }

        for(int i=0;i<M;i++){
            int popNum = Integer.parseInt(C.nextToken());
            // 큐가 없다면 입력숫자를 그대로 출력
            // 큐가 있다면 수열을 하나씩 삽입하면서 원소들을 뒤로 이동
            if(deque.size()>0){

                int temp = popNum;
                // 마지막 원소를 POP
                popNum = deque.pollLast();

                // 수열을 앞에 삽입하면 한칸씩 뒤로 밀림
                deque.addFirst(temp);
            }

            bw.write(popNum+" ");
        }

        bw.flush();
        bw.close();

    }

}
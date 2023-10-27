import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _11866_요세푸스문제0 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();

        String res = "<";

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for(int i=0;i<n1;i++){
            queue.add(i+1);

            // K가 1이면 그대로 출력
            if(n2==1){
                res+= i+1+", ";
            }
        }

        // K가 2이상이면 요세푸스 순열 계산
        while(n2>1){
            cnt+=1;

            // 카운트가 K개면 출력문자에 누적
            if(cnt==n2){
                res += queue.poll()+", ";
                cnt=0;

            // 카운트가 K개가 아닐때 큐뒤에 삽입
            }else if(queue.size()>0){
                queue.add(queue.poll());

            // 큐를 모두 추출했으면 while 탈출
            }else{
                break;
            }
        }

        res = res.substring(0,res.length()-2) + ">";
        bw.write(res);
        bw.flush();
    }

}
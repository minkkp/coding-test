import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class _2164_카드2 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();

        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            queue.add(i+1);
        }

        while(queue.size()>1){
            // 가장 위의수 제거
            queue.poll();

            // 가장 위의수 제거, 제거값을 가장 밑으로 이동
            queue.add(queue.poll());
        }

        bw.write(queue.peek()+"");
        bw.flush();
    }

}
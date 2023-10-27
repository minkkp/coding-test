import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class _2346_풍선터뜨리기 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> res = new ArrayDeque<>();

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int []arr = new int[num];

        for(int i=0;i<num;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            deque.add(i+1);
        }

        // 1번풍선을 터뜨림
        res.addFirst(deque.pop());

        // 1번풍선의 값을 추출
        int move = arr[res.getLast()-1];

        while(deque.size()>0){
            // 종이의 값이 양수라면 덱의 첫번째부터 추출
            if(move>0){
                for(int i=0;i<move-1;i++){
                    // 지나친 값들은 덱의 뒤로 이동
                    deque.addLast(deque.pollFirst());
                }
                res.addLast(deque.pollFirst());
                move = arr[res.getLast()-1];

            // 종이의 값이 음수라면 덱의 마지막값부터 역순으로 추출
            }else{
                move = Math.abs(move);
                for(int i=0;i<move-1;i++){
                    // 지나친 값들은 덱의 앞으로 이동
                    deque.addFirst(deque.pollLast());
                }
                res.addLast(deque.pollLast());
                move = arr[res.getLast()-1];
            }
        }
        for(int out : res){
            bw.write(out+" ");
        }
        bw.flush();
        bw.close();
    }

}
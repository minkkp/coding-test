import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class _12789_도키도키간식드리미 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        int start = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 앞줄부터 큐에 삽입
        for(int i=0;i<N;i++){
            queue.add(Integer.parseInt(st.nextToken()));
        }

        // 들어온 순서부터 선입선출
        while(queue.size()>0){
            // 대기자중 순번에 맞으면 바로 입장
            if(queue.peek()==start){
                queue.poll();
                start+=1;

            // 대기자중 순번에 맞지 않는다면 옆줄로 들어감
            } else{
                stack.push(queue.poll());
            }

            // 옆줄로 빠진사람중에서 순번이 맞다면 순서대로 간식수령
            if(stack.size()>0){
                while(stack.peek()==start){
                    stack.pop();
                    start+=1;
                    if(stack.size()==0){
                        break;
                    }
                }
            }
        }

        // 옆줄 대기인이 남아있다면 순서대로 수령하지 못한것임
        System.out.println(stack.size()==0 ? "Nice" : "Sad");
    }

}
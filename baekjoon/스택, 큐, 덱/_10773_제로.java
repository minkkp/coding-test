import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _10773_제로 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());
        int res = 0;
        for(int i=0;i<K;i++){
            int num = Integer.parseInt(br.readLine());
            if(num==0) { // 0 입력시 가장 최근에 입력된수를 스택에서 pop
                res -= stack.pop();
            }else{ // 0이외 정수 입력시 스택에 push
                res+= num;
                stack.push(num);
            }
        }

        System.out.println(res);

    }


}
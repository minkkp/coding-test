import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class _28278_스택2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            StringTokenizer num = new StringTokenizer(br.readLine());
            switch (Integer.parseInt(num.nextToken())){
                case 1: // 정수 X를 스택에 삽입
                    int value = Integer.parseInt(num.nextToken());
                    stack.push(value);
                    break;
                case 2: // 스택에서 제일위에 있는 수 꺼내고 출력
                    if(stack.empty()){
                        bw.write("-1"+"\n");
                    }else{
                        bw.write(stack.pop()+"\n");
                    }
                    break;
                case 3: // 스택의 크기
                    bw.write(stack.size()+"\n");
                    break;
                case 4: // 스택의 자료유무
                    if(stack.empty()){
                        bw.write("1"+"\n");
                    }else{
                        bw.write("0"+"\n");
                    }
                    break;
                case 5: // 스택의 제일위에 있는 수 출력
                    if(stack.empty()){
                        bw.write("-1"+"\n");
                    }else{
                        bw.write(stack.peek()+""+"\n");
                    }
                    break;
            }
        }
        bw.flush();
    }


}
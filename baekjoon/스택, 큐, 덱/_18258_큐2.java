import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _18258_큐2 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());


        int last = 0;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    queue.add(num);

                    //  가장 마지막에 삽입된 정수 저장
                    last = num;
                    break;
                case "pop":
                    bw.write(queue.isEmpty()? "-1"+"\n":Integer.toString(queue.poll())+"\n");
                    break;
                case "size":
                    bw.write(queue.size()+"\n");
                    break;
                case "empty":
                    bw.write(queue.isEmpty()?"1"+"\n":"0"+"\n");
                    break;
                case "front":
                    if(queue.isEmpty()){
                        bw.write("-1"+"\n");
                    }else{
                        bw.write(Integer.toString(queue.peek())+"\n");
                    }
                    break;
                case "back":
                    if(queue.isEmpty()){
                        bw.write("-1"+"\n");
                    }else{
                        bw.write(last+"\n");
                    }
                    break;
            }
        }
        bw.flush();
    }

}
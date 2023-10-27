import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _28279_덱2 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int select = Integer.parseInt(st.nextToken());
            int num;
            switch (select){
                case 1:
                    num = Integer.parseInt(st.nextToken());
                    deque.addFirst(num);
                    break;
                case 2:
                    num = Integer.parseInt(st.nextToken());
                    deque.addLast(num);
                    break;
                case 3:
                    bw.write(deque.isEmpty()?"-1"+"\n":Integer.toString(deque.pollFirst())+"\n");
                    break;
                case 4:
                    bw.write(deque.isEmpty()?"-1"+"\n":Integer.toString(deque.pollLast())+"\n");
                    break;
                case 5:
                    bw.write(deque.size()+"\n");
                    break;
                case 6:
                    bw.write(deque.isEmpty()?"1"+"\n":"0"+"\n");
                    break;
                case 7:
                    bw.write(deque.isEmpty()?"-1"+"\n":Integer.toString(deque.peekFirst())+"\n");
                    break;
                case 8:
                    bw.write(deque.isEmpty()?"-1"+"\n":Integer.toString(deque.peekLast())+"\n");
                    break;
            }

        }
        bw.flush();
        bw.close();
    }

}
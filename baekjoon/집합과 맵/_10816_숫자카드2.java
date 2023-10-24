import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Scanner;

public class _10816_숫자카드2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            if(hashMap.containsKey(num)){
                hashMap.put(num,hashMap.get(num)+1);
            }else{
                hashMap.put(num,1);
            }
        }

        int M = sc.nextInt();
        int []res = new int[M];

        for(int i=0;i<M;i++){
            int num = sc.nextInt();
            if(hashMap.containsKey(num)){
                res[i] = hashMap.get(num);
            }else{
                res[i] = 0;
            }

        }

        for(int output : res){
            bw.write(output+" ");
        }
        bw.flush();

    }

}
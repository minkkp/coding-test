import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class _1620_나는야포켓몬마스터이다솜 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> hashMap = new HashMap<>();

        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i=1;i<=N;i++){
            String name = sc.next();
            hashMap.put(name,Integer.toString(i));
            hashMap.put(Integer.toString(i),name);
        }
        for(int i=0;i<M;i++){
            String find = sc.next();
            System.out.println(hashMap.get(find));
        }
    }

}
import java.util.HashMap;
import java.util.Scanner;

public class _14425_문자열집합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> hashMap = new HashMap<>();

        int N = sc.nextInt();
        int M = sc.nextInt();
        int res = 0;

        for(int i=0;i<N;i++){
            String str = sc.next();
            hashMap.put(str,0);
        }

        for(int i=0;i<M;i++){
            String str = sc.next();
            if(hashMap.containsKey(str)){
                res++;
            }
        }
        System.out.println(res);
    }

}
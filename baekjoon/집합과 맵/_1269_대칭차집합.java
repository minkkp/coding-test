import java.util.HashMap;
import java.util.Scanner;

public class _1269_대칭차집합 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i=0;i<A;i++){
            int num = sc.nextInt();
            hashMap.put(num,0);
        }
        for(int i=0;i<B;i++){
            int num = sc.nextInt();
            if(hashMap.containsKey(num)){
                hashMap.remove(num);
            }else{
                hashMap.put(num,0);
            }
        }
        System.out.println(hashMap.size());
    }
}
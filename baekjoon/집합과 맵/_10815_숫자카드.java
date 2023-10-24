import java.util.HashMap;
import java.util.Scanner;

public class _10815_숫자카드 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<n1;i++){
            int num = sc.nextInt();
            if(hashMap.containsKey(num)==false){
                hashMap.put(num,0);
            }
        }

        int n2 = sc.nextInt();
        int []res = new int[n2];
        for(int i=0;i<n2;i++){
            int num = sc.nextInt();
            if(hashMap.containsKey(num)){
                res[i] = 1;
            }else{
                res[i] = 0;
            }
        }

        for(int i=0;i<n2;i++){
            System.out.print(res[i]+" ");
        }

    }

}
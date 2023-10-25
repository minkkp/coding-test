import java.io.IOException;
import java.util.Scanner;

public class _4134_다음소수 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            long num = sc.nextLong();
            System.out.println(check(num));
        }
    }

    public static long check(long num) {
        // 2이하의 가장큰 소수는 2
        if (num < 3) {
            return 2;
        }
        while (true) {
            boolean check = true;
            // N의 제곱근까지 확인해도 소수 판별 가능
            // N의 약수는 대칭을 이룸 (10 = 1,2,5,10 // 1*10=10 , 2*5=10)
            for (int i = 2; i < Math.sqrt(num) + 1; i++) {
                if (num % i == 0) {
                    check = false;
                    num++;
                }
            }
            if(check){
                return num;
            }
        }

    }
}
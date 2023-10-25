import java.io.IOException;
import java.util.Scanner;

public class _4948_베르트랑공준 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true){
            int N = sc.nextInt();
            if(N==0){
                break;
            }else{
                System.out.println(countPrime(N));
            }
        }
    }

    public static int countPrime(int num){
        int cnt=0;
        // i+1 ~ 2i 사이에는 최소 1개이상 소수가 존재
        for(int i=num+1;i<=num*2;i++){
            boolean isPrime = true;
            // N의 제곱근까지 확인해도 소수 판별 가능
            for(int j=2;j<(int)Math.sqrt(i)+1;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                cnt++;
            }
        }
        return cnt;
    }

}
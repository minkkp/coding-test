import java.io.IOException;
import java.util.Scanner;

public class _17103_골드바흐파티션 {
    public static int []prime;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        prime = new int[1000001];

        // 1000000이하의 소수 구하기
        getPrime();

        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            int cnt = 0;

            // 2 ~ N/2까지 순회하면서 소수의 합을 검사
            // N이 8이라면 (2,6) (3,5) (4,4)
            // N이 10이라면 (2,8) (3,7) (4,6) (5,5)
            for(int j=2;j<=num/2;j++){
                if(prime[j]==0 && prime[num-j]==0){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

    public static void getPrime(){
        // 에라토스테네스의 체로 prime 배열에 소수 저장
        for(int i=2;i<=Math.sqrt(1000000);i++){
            if(prime[i]==0){
                for(int j=i*2;j<=1000000;j+=i){
                    prime[j]=1;
                }
            }
        }
    }
}
import java.util.Scanner;

public class _2485_가로수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int []arr = new int[N];
        int []space = new int[N-1];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        // 가로수의 간격 저장
        for(int i=1;i<N;i++){
            space[i-1] = arr[i]-arr[i-1];
        }

        int resGdc = space[0];

        // 가로수 간격들의 최대공약수 구하기
        for(int i=1;i<space.length;i++){
            resGdc = gcd(resGdc,space[i]);
        }

        int res = 0;

        // 필요한 공간 = (가로수 간격 / 간격의 최대공약수) -1
        for(int i=0;i<space.length;i++){
            res = res+ ((space[i]/resGdc) - 1);
        }
        System.out.println(res);
    }

    // 최대공약수 (유클리드 호제법)
    public static int gcd(int a,int b){
        if(a%b==0){
            return b;
        }else{
            return gcd(b,a%b);
        }
    }

}
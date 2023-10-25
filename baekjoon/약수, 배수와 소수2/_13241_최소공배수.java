import java.util.Scanner;

public class _13241_최소공배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        System.out.println(lcm(A,B));

    }

    // 최소공배수
    public static long lcm(long a,long b){
        // 최소공배수 = (A x B / 최대공약수)
        return (a*b) / gcd(a,b);
    }

    // 최대공약수 (유클리드 호제법)
    public static long gcd(long a,long b){
        if(a%b==0){
            return b;
        }else{
            return gcd(b,a%b);
        }
    }

}
import java.util.Scanner;

public class _1934_최소공배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0;i<num;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(lcm(A,B));
        }
    }

    // 최소공배수
    public static int lcm(int a,int b){
        // 최소공배수 = (A x B / 최대공약수)
        return (a*b) / gcd(a,b);
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
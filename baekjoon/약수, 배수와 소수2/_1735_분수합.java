import java.util.Scanner;

public class _1735_분수합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a0 = sc.nextInt();
        int a1 = sc.nextInt();

        int b0 = sc.nextInt();
        int b1 = sc.nextInt();

        //분모합
        int c0 = (lcm(a1,b1)/a1)*a0 + (lcm(a1,b1)/b1)*b0;
        //분자합
        int c1 = lcm(a1,b1);

        // 기약분수 = (분모합/최대공약수) / (분자합/최대공약수)
        System.out.println(c0/gcd(c0,c1)+" "+c1/gcd(c0,c1));
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
import java.util.HashSet;
import java.util.Scanner;

public class _11478_서로다른부분문자열의개수 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();
        String S = sc.next();

        for(int i=0;i<S.length();i++){
            for(int j=0;j<S.length()-i;j++){
                hashSet.add(S.substring(j,j+i+1));
            }
        }
        System.out.println(hashSet.size());
    }
}
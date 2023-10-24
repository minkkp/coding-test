import java.util.Arrays;
import java.util.Scanner;

public class _10814_나이순정렬 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        String [][] str = new String[cnt][3];

        // 인덱스별로 나이, 이름, 가입순 저장
        for(int i=0;i<cnt;i++){
            str[i][0] = sc.next();
            str[i][1] = sc.next();
            str[i][2] = Integer.toString(i);
        }

        // 람다함수 활용
        Arrays.sort(str,(e1,e2)->{
            if(Integer.parseInt(e1[0])==Integer.parseInt(e2[0])){ // 나이가 같으면 가입순으로 오름차순 정렬
                return Integer.parseInt(e1[2]) - Integer.parseInt(e2[2]);
            }else{
                return Integer.parseInt(e1[0])-Integer.parseInt(e2[0]); // 나이가 다르면 나이순으로 오름차순 정렬
            }
        });

        for(int i=0;i<cnt;i++){
            System.out.println(str[i][0]+" "+str[i][1]);
        }

    }


}
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class _1181_단어정렬 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = sc.nextInt();
        String []str = new String[cnt];

        for(int i=0;i<cnt;i++) {
            str[i] = sc.next();
        }

        // HashSet활용 중복제거
        HashSet<String> hashSet = new HashSet<String>(Arrays.asList(str));
        str = hashSet.toArray(new String[0]);

        // 람다함수 활용
        Arrays.sort(str,(e1,e2)->{
            if(e1.length()==e2.length()){ // 길이가 같으면 사전순으로 오름차순 정렬
                return e1.compareTo(e2);
            }else { // 길이가 다르다면 짧은순으로 오름차순 정렬
                return e1.length() - e2.length();
            }
        });

        // 결과 출력
        for(int i=0;i<str.length;i++){
            bw.write(str[i]+"\n");
        }


        bw.flush();
    }


}
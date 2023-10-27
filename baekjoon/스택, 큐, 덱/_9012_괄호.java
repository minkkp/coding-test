import java.io.*;

public class _9012_괄호 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String PS = br.readLine();
            // 문자열에서 괄호 문자열을 순차적으로 삭제
            while(PS.indexOf("()")>=0){
               int findIndex = PS.indexOf("()");
               PS = PS.substring(0,findIndex) + PS.substring(findIndex+2,PS.length());
            }
            // 괄호 문자열을 모두 삭제했을때 괄호가 남아있을시 VPS가 아님
            if(PS.length()>0){
                bw.write("NO"+"\n");
            }else{
                bw.write("YES"+"\n");
            }
        }
        bw.flush();
    }


}
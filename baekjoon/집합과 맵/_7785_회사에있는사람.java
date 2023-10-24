import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class _7785_회사에있는사람 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String,Integer> hashMap = new HashMap<>();

        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            String s1 = sc.next();
            String s2 = sc.next();
            if(s2.equals("enter")){
                hashMap.put(s1,0);
            }else{
                hashMap.remove(s1);
            }
        }

        String []res = hashMap.keySet().toArray(new String[0]);
        Arrays.sort(res,Collections.reverseOrder());


        for(String str : res){
            bw.write(str+"\n");
        }
        bw.flush();
    }

}
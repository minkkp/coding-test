import java.io.*;

public class _4949_균형잡힌세상 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();
            String temp = "";
            if(str.equals(".")){
                break;
            }else{
                // 괄호만 필터링하여 temp변수에 저장
                for(int i=0;i<str.length();i++){
                    char find = str.charAt(i);
                    if(find=='(' || find==')'||find=='['||find==']'){
                        temp+=find;
                    }
                }

                // 소괄호, 대괄호 짝을 찾으면 한쌍씩 제거
                while(temp.indexOf("()")>=0 || temp.indexOf("[]")>=0){
                    int findSmall = temp.indexOf("()");
                    if(findSmall>=0){
                        temp = temp.substring(0,findSmall) + temp.substring(findSmall+2,temp.length());
                    }

                    int findBig = temp.indexOf("[]");
                    if(findBig>=0){
                        temp = temp.substring(0,findBig) + temp.substring(findBig+2,temp.length());
                    }
                }

                // 짝을 제거하고 홀수의 괄호만 남으면 불균형
                if(temp.length()>0){
                    System.out.println("no");
                }else{
                    System.out.println("yes");
                }
            }
        }

    }


}
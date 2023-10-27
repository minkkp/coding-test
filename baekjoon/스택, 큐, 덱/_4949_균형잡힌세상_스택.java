import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _4949_균형잡힌세상_스택 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            if(str.equals(".")){
                break;
            }else{

                // 문자열을 순회하면서 괄호만 필터링
                for(char find : str.toCharArray()){

                    // 열린 괄호가 입력되면 stack에 바로 삽입
                    if(find=='(' || find=='['){
                        stack.push(find);

                    // 닫힌괄호가 입력되면 열린괄호와 일치여부 확인, 틀리면 종료
                    }else if(find==')'){
                        if(stack.size()!=0 && stack.peek()=='('){
                            stack.pop();
                        }else{
                            stack.push(find);
                            break;
                        }
                    }

                    // 닫힌괄호가 입력되면 열린괄호와 일치여부 확인, 틀리면 종료
                    else if(find==']'){
                        if(stack.size()!=0 && stack.peek()=='['){
                            stack.pop();
                        }else{
                            stack.push(find);
                            break;
                        }
                    }
                }

                // 모든괄호쌍이 pop되면 스택크기는 0
                if(stack.size()==0){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }

            }
        }

    }


}
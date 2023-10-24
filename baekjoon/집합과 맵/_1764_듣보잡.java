import java.util.*;

public class _1764_듣보잡 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> hashMap = new HashMap<>();
        List<String> res = new ArrayList<>();

        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int i=0;i<N;i++){
            String name = sc.next();
            hashMap.put(name,0);
        }
        for(int i=0;i<M;i++){
            String name = sc.next();
            if(hashMap.containsKey(name)){
                res.add(name);
            }
        }

        Collections.sort(res);

        System.out.println(res.size());

        for(String output:res){
            System.out.println(output);
        }
    }
}
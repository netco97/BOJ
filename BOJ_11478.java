import java.io.*;
import java.util.HashSet;

public class BOJ_11478 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();

        String S = br.readLine();
        for(int i=0;i<S.length();i++)
        {
            String name = "";
            for(int j=i;j<S.length();j++)
            {
                name += S.substring(j,j+1);
                System.out.println(name); //baekjoon에는 이거빼고 해야함->출력초과 남(테스트용)
                set.add(name);
            }
        }
        //ababc
//i = 0 j = 0,1,2,3,4
//i = 1 j = 1,2,3,4
//i = 2 j = 2,3,4
//i = 3 j = 3,4
//i = 4 j = 4
        System.out.println(set.size());
    }
}

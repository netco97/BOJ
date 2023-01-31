import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String str_arr[] = new String[n];
        String answer[] = new String[m];
        int count = 0;

        for(int i=0;i<n;i++)
        {
            str_arr[i] = br.readLine();
        }//#
        for(int i=0;i<m;i++)
        {
            answer[i] = br.readLine();
            for(int j=0;j<n;j++)
            {
                if(answer[i].equals(str_arr[j]))
                    count++;
            }
        }

        System.out.println(count);
    }
}

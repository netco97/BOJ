import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        long distance [] = new long[N-1];
        long gas_stations [] = new long[N];
        st = new StringTokenizer(br.readLine()); //거리 입력
        for(int i=0;i<N-1;i++)
            distance[i]=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()); // 주요소 L당 가격 입력
        for(int i=0;i<N;i++)
            gas_stations[i]=Integer.parseInt(st.nextToken());
        long total = 0;
        long min = gas_stations[0];

        for(int i=0;i<N-1;i++)
        {
            if(gas_stations[i]<=min)
            {
                min=gas_stations[i];
            }
            total+=(min*distance[i]);
        }
        System.out.println(total);
    }
}
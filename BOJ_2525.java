import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        StringTokenizer st = new StringTokenizer(n);
        int n_hour = Integer.parseInt(st.nextToken());
        int n_minute = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        n_minute += m;
        int n_remain = n_minute/60;
        if(n_minute>=60)
        {
            n_hour += n_remain;
            n_minute -= 60*(n_remain);
        }

        if(n_hour>=24)
        {
            n_hour = n_hour-24;
        }
        System.out.println(n_hour+" "+n_minute);


    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        float arr[] = new float[n];
        float max = 0;
        float avg = 0;

        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str.nextToken());
            if (arr[i] > max)
                max = arr[i];
        }

        for (int i = 0; i < n; i++) {
            avg += (arr[i]/max*100)/n; // 이부분에서 sum으로 하고 /n 했었는데 안됬었음.
        }
        System.out.println(avg);
    }
}

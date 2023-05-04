import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int temp = 0;

        while(N!=count)
        {
            temp++;
            if(Integer.toString(temp).contains(("666")))
            {
                count++;
            }
        }

        System.out.println(temp);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        //A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        //B = Integer.parseInt(new StringBuilder().append(B).reverse().toString()); --> StringBuilder에 append후->reverse후-> 다시 String으로 하는 방법도 있음.

        int reverse_A = 0;
        int reverse_B = 0;
        while (A != 0 && B !=0) {
            int digit_A = A % 10;
            int digit_B = B % 10;
            reverse_A = reverse_A * 10 + digit_A;
            reverse_B = reverse_B * 10 + digit_B;
            A /= 10;
            B /= 10;
        }
        if(reverse_A>=reverse_B)
        {
            System.out.println(reverse_A);
        }
        else{
            System.out.println(reverse_B);
        }
    }
}

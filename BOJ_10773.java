import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack= new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int num, sum=0;

        for(int i=0; i<n;i++)
        {
            num = Integer.parseInt(br.readLine());
            if(num == 0)
            {
                stack.pop();
            }
            else{
                stack.push(num);
            }
        }

        for(int i=0;i<stack.size();i++)
        {
            sum += stack.elementAt(i);
        }
        System.out.println(sum);

    }
}

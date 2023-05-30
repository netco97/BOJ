import java.io.*;
import java.util.*;

public class BOJ_1874 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int temp = 1;
        boolean err = false;

        for(int i=0;i<N;i++) {
            int M = Integer.parseInt(br.readLine());
            for (; temp <= M; temp++) {
                stack.push(temp);
                sb.append("+").append("\n");
            }
            if (stack.peek() == M){
                stack.pop();
                sb.append("-").append("\n");
            }
            else
            {
                err = true;
            }
        }

        if(err)
        {
            System.out.println("No");
        }
        else{
            System.out.print(sb);
        }
    }
}
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alpha_arr[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String input = br.readLine();

        for(int i=0;i<alpha_arr.length;i++)
        {
            if(input.contains(alpha_arr[i]))
            {
                input = input.replace(alpha_arr[i], "x");
            }
        }

        System.out.println(input.length());
    }
}

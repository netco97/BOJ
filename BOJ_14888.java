import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14888 {
    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;
    static int N;
    static int operator[];
    static int number[];
    public static void main(String[] args) throws Exception{
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        N  = Integer.parseInt(Br.readLine());
        operator = new int[4]; //연산자
        StringTokenizer st;
        number = new int[N]; //피연산자

        st = new StringTokenizer(Br.readLine()," ");
        for(int i=0;i<N;i++)
        {
            number[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(Br.readLine(), " ");
        for(int i=0;i<operator.length;i++)
        {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(number[0], 1);

        System.out.println(MAX);
        System.out.println(MIN);

    }
    public static void dfs(int num, int idx){
        if (idx==N){
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN,num);
            return;
        }

        for(int i=0;i<4;i++){
            if(operator[i]>0){
                operator[i]--;

                switch (i){
                    case 0 : dfs(num + number[idx], idx+1); break;
                    case 1 : dfs(num - number[idx], idx+1); break;
                    case 2 : dfs(num * number[idx], idx+1); break;
                    case 3 : dfs(num / number[idx], idx+1); break;
                }

                operator[i]++;
            }
        }
    }
}
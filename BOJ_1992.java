import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1992 {
        static int arr[][];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for(int i=0;i<N;i++)
        {
            String str = br.readLine();
            for(int j=0;j<N;j++)
            {
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        quadtree(0,0,N);

    }
    public static void quadtree(int row,int col, int N){
        if(isNumber(row,col,N))
        {
            System.out.print(arr[row][col]);
            return;
        }

        System.out.print("(");
        N = N/2;
        quadtree(row,col,N); //왼쪽 위
        quadtree(row,col+N,N); //오른쪽 위
        quadtree(row+N,col,N); //왼쪽 아래
        quadtree(row+N,col+N,N); //오른쪽 아래
        System.out.print(")");

    }

    public static boolean isNumber(int row,int col,int N){
        int cur = arr[row][col];
        for(int i=row;i<row+N;i++)
        {
            for(int j=col;j<col+N;j++)
            {
                if(arr[i][j]!=cur){
                    return false;
                }
            }
        }
        return true;
    }
}

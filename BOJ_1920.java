
import java.io.*;
import java.util.*;

public class BOJ_1920 {
    static int A_N[];
    static int A_M[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        A_N = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A_N[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        A_M = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            A_M[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A_N);
        for (int i = 0; i < M; i++) {
            int target = A_M[i];
            int start = 0;
            int end = A_N.length - 1;
            A_M[i] = binarySearch(target, start, end);
        }
        for (int i = 0; i < M; i++) {
            System.out.println(A_M[i]);
        }
    }

    public static int binarySearch(int target, int start, int end) {
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target == A_N[mid]) {
                return 1;
            } else if (target > A_N[mid]) {
                start = mid + 1;
            } else if (target < A_N[mid]) {
                end = mid - 1;
            }
        }
        return 0;
    }
}

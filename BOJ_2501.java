package test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2501 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		
		for(int i=1; i<=n;i++)
		{
			if(n%i==0)
			{
				A.add(i);
			}
		}
		
		if(A.size()<k)
		{
			System.out.println(0);
		}
		else {
			System.out.println(A.get(k-1));
		}
		
	}

}
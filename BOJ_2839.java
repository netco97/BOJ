package test_test2;

import java.util.*;

public class BOJ_2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int N = sc.nextInt();
		
		while(true) {
			if ( N % 5 == 0 ) {
				System.out.println(N/5+count);
				break;
			}
			else if(N<=0 ){
				System.out.println(-1);
				break;
			}
			
			N=N-3;
			count++;
			
		}
		
	}

}

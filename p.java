package kolklklk;

import java.io.*;

public class p {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		int []count = new int[26];
		int max = 0;
		char result = 'a';
		
		for(int i=0;i<str.length();i++)
		{
			int index = str.charAt(i) - 65;
			count[index]++;
			
			if(max<count[index])
			{
				max = count[index];
				result = str.charAt(i);
			}
			else if(max==count[index]){
				result='?';
			}
		}
		
		System.out.println(result);
	}
}

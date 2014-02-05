/*
 * Find the elements in an array that occur for odd number of times.
 */

package learn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountOddOccurancesInArray {

	
	public static void main(String[] args) throws Exception {
		
		int a[] = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 10; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		CountOddOccurancesInArray s = new CountOddOccurancesInArray();
		a = s.countOddOccurances(a);
		for(int i = 0;i<a.length; i++)
			System.out.println(a[i]+" ");
	}
	
	int[] countOddOccurances(int[] a)
	{
		int t[] = new int[10];
		int index = 0;
		boolean b[]=new boolean[10];
		for(int i = 0;i<a.length;i++)
		{
			b[i] = false;
		}
		for(int i = 0;i<a.length;i++)
		{
			b[a[i]] ^= true; 
		}
		
		for(int i = 0;i<a.length;i++)
		{
			if(b[i])
				t[index++] = i;
		}
		return t;
	}
}

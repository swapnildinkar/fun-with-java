/*
 * Given an integer array with some zeroes, push all the zeroes to the end 
 * without changing the order.
 */

package learn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AllZerosToEnd {

	public static void main(String[] args) throws Exception{
		int a[]=new int[20];
		int i, zeroIndex=0, temp;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(i=0;i<20;i++)
		{
			a[i] = Integer.parseInt(br.readLine());
		}
		for(int t = 0;t<a.length;t++)
		{
			System.out.print(a[t]+" ");
		}
		
		//Shift numbers to the left, overwriting the zeroes.
		
		for(i=0;i<a.length;i++)
		{
			while(a[i] == 0)
			{
				i++;
			}
			a[zeroIndex++] = a[i];			
		}
		for(i=zeroIndex;i<a.length;i++)
			a[i]=0;
		System.out.println();
		System.out.println("After shifting: ");
		for(int t = 0;t<a.length;t++)
		{
			System.out.print(a[t]+" ");
		}
	}
}

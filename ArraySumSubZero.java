package learn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArraySumSubZero {
	public static void main(String args[]) throws Exception
	{
		ArraySumSubZero ar = new ArraySumSubZero();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number of elements:");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Enter "+n+" elements:");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		
		}
		System.out.println(ar.checkSumDiff(a, 0, 0, false, n));
		
	}
	
	boolean checkSumDiff(int a[], int index, int sum, boolean add, int n)
	{
		if(index == n)
		{
			if(sum == 0)
				return true;
			else
				return false;
		}
		if(add)
			sum += a[index];
		else
			sum -= a[index];
		if(checkSumDiff(a, index+1, sum, true, n))
			return true;
		else 
			return checkSumDiff(a, index+1, sum, false, n);
	}
}

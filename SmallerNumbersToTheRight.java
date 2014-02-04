/*
 * Program to count number of smaller elements on right of each element in an array.

	Example:

	Input:   arr[] =  {9,4,6,7,3}
	Output:  countSmaller[]  =  {4,1,1,1,0} 
 * 
 */

package learn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SmallerNumbersToTheRight {

	public static void main(String[] args) throws Exception {
		SmallerNumbersToTheRight s = new SmallerNumbersToTheRight();
		int a[] = new int[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		a = s.smallerNumbersToTheRight(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
	}

	int[] smallerNumbersToTheRight(int ip[]) {
		int s[] = new int[ip.length];
		int count;
		for (int i = ip.length - 1; i >= 0; i--) {
			for (int j = i; j < ip.length; j++) {
				if (ip[j] < ip[i]) {
					s[i]++;
				}
			}
		}
		return s;
	}
}

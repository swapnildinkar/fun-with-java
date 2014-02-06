/*
 * Under Construction.
 * 
 */

package learn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinimumDistanceInArray {

	public static void main(String[] args) throws Exception {
		MinimumDistanceInArray m = new MinimumDistanceInArray();
		int a[] = new int[20];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 20; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter x and y");
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		System.out.println(m.calculateMinDist(a, x, y));
	}

	int calculateMinDist(int a[], int x, int y) {
		int limit = -(a.length + a.length);
		int xIndex = limit, yIndex = limit, min = 99999, xAltIndex = limit, yAltIndex = limit;
		boolean xfound = false, yfound = false;
		
		//Loop through the array
		for (int i = 0; i < a.length; i++) {
		
			//Check if the current number is 'x'
			if (a[i] == x) {	
				if(yIndex == limit)
				{
					xIndex = i;
					continue;
				}
				else if(i - yIndex < min)
				{
					xIndex = i;
					min = xIndex - yIndex;
				}
				else if(i - yAltIndex < min)
				{
					xIndex = i;
					min = xIndex - yAltIndex;
				}
				else
				{
					xAltIndex = i;
				}
			} 
			
			//Check if the current number is 'y'
			else if (a[i] == y) {
				if(xIndex == limit)
				{
					yIndex = i;
					continue;
				}
				else if(i - xIndex < min)
				{
					yIndex = i;
					min = yIndex - xIndex;
				}
				else if(i - xAltIndex < min)
				{
					yIndex = i;
					min = yIndex - xAltIndex;
				}
				else
				{
					yAltIndex = i;
				}
			} 
		}
		return min;
	}
}

/*
Input:
1
7
6
5
4
3
2
1
5
6
7
8
9
7
6
5
4
3
2
1

x = 2
y = 5

Output: 2
*/
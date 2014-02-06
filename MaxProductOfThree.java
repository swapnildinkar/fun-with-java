/*
 * Find the Increasing subsequence of length three with maximum product
 * Given a sequence of non-negative integers, find the subsequence of length 3 having maximum product with the numbers of the subsequence being in ascending order.
 */

package learn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxProductOfThree {

	public static void main(String[] args) throws Exception {
		int a[] = new int[20];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 20; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		MaxProductOfThree m = new MaxProductOfThree();
		System.out.println(m.maxOfThree(a));
	}

	int maxOfThree(int a[]) {
		int high, low, prod = 0;
		for (int i = 0; i < a.length; i++) {
			high = -1;
			low = a[0];
			for (int j = 0; j < a.length; j++) {
				if (a[j] > a[i] && i < j) {
					high = a[j];
				}
				if (a[j] < a[i] && a[j] > low && i > j) {
					low = a[j];
				}
			}
			if (low == 10000 || high == -1) {
				continue;
			}
			if (prod < (low * high * a[i])) {
				prod = low * high * a[i];
			}
		}
		return prod;
	}
}

/* 
 * Input: 1 2 3 4 5 4 3 4 5 6 7 6 5 6 7 8 1 8 7 6
 * 
 * Output: 336
 */

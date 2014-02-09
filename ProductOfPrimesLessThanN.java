/*
 * Program to calculate the pairs of Prime Numbers whose product is less than 'N'.
 */

package learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductOfPrimesLessThanN {

	public static void main(String[] args) throws IOException {
		ProductOfPrimesLessThanN p = new ProductOfPrimesLessThanN();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 'N': ");
		p.findProductOfPrimesLessThanN(Integer.parseInt(br.readLine()));

	}

	// Calculate all Prime numbers less than 'n'.
	int[] findPrimes(int n) {
		int primes[] = new int[n];
		boolean b[] = new boolean[(n)];
		int j = 1, k = 1;
		for (int i = 0; i < b.length; i++) {
			b[i] = true;
		}
		for (int i = 2; i < n; i++) {
			if (b[i] == true) {
				for (j = i*i; j < n; j += i) {
					b[j] = false;
				}
				primes[k++] = i;
			}
		}
		j = 0;
		return primes;
	}

	// Find prime number pairs whose product is less than 'n'.
	void findProductOfPrimesLessThanN(int n) {

		int primes[] = findPrimes(n / 2);
		System.out.println("The prime number pairs with product less than " + n
				+ " are: ");
		for (int i = primes.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if ((primes[i] * primes[j]) < n) {
					if (primes[i] == 0 || primes[j] == 0)
						continue;
					System.out.println(primes[i] + "," + primes[j]);
				}
			}
		}
	}
}

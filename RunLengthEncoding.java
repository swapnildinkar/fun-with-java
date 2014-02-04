/*
 * Program to compress a string by using RunLength Encoding.
 * Output the original string if runlength encoding does not reduce the length.
 */

package learn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunLengthEncoding {
	public static void main(String[] args) throws Exception{
		System.out.println("Enter the string to compress: ");
		String s = new String((new BufferedReader(new InputStreamReader(System.in)).readLine()));
		char a[] = s.toCharArray();
		char b[] = new char[20];
		int p=0, count=1, bIndex=0,i=1;
		for(i=1;i<s.length();i++)
		{
			if(a[i] == a[p])
			{
				count++;
			}
			else
			{
				b[bIndex++] = a[p];
				b[bIndex++] = (char)(count+48);
				count=1;
			}
			p = i;
		}
		
		b[bIndex++] = a[p];
		b[bIndex++] = (char)(count+48);
		if(a.length > bIndex)
			System.out.println(new String(b));
		else
			System.out.println(new String(a));
		
		
		
	}
}

/*
Problem code - RAMDEV
Problem link - https://www.codechef.com/problems/RAMDEV
*/

import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    long l = sc.nextLong();
	    long b = sc.nextLong();
	    long n = sc.nextLong();
	    long res = 0;
	    while(n>0) {
	        long L = sc.nextLong();
	        long B = sc.nextLong();
	        long hor = (L/b) * (B/l);
	        long ver = (L/l) * (B/b);
	        res += Math.max(hor, ver);
	        n--;
	    }
	    System.out.print(res);
	}
}

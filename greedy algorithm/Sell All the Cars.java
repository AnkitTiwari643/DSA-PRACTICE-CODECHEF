/*
Problem Code - CARSELL
Problem Link - https://www.codechef.com/problems/CARSELL
*/

import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		while(t>0) {
		    long res = 0;
		    int n = sc.nextInt();
		    long[] price = new long[n];
		    for(int i=0; i<n; i++) {
		        price[i] = sc.nextLong();
		    }
		    Arrays.sort(price);
		    int i=0;
		    int index=n-1;
		    while(index>=0) {
		        if((price[index]-i)>0){
		            res=(res+price[index]-i)%1000000007;
		            i++;
		        }
		        index--;
		        
		    }
		    System.out.println(res);
		    t--;
		}
	}
}

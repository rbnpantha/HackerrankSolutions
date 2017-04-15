package edu.mum.assignment11b.lcs;

public class LCSRecursive {
	static int recursiveCount=0;
	public static void main(String[] args){
		String s1 = "GAATTCAGTTA";
		String s2 = "GGATCGA";
		
		System.out.println("The value of Lowest Common Sequence using recursion is : "+recursiveLCS(s1,s2,s1.length(),s2.length()) );
		System.out.println("The number of recursive count is :"+recursiveCount);
	}
	static int recursiveLCS(String s1, String s2, int m , int n){
		recursiveCount++;
		if(n==0){
			return 0;
		}
		else if (m==0)
				return 0;
		else if (s1.charAt(m-1) ==(s2.charAt(n-1))){
			return recursiveLCS(s1,s2, m-1, n-1)+1;
		}
		return Math.max(recursiveLCS(s1, s2,m,n-1),recursiveLCS(s1,s2,m-1,n));
		
	}
}

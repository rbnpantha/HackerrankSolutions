import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MelidiousPassword {
	static char pwd[];
	static int c;
	static int length;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		length = n;
		//int count = 'a';
		//while(count < 'z' && count != 'y'){
		getFirst(n);
		//count ++;
		//}

	}

	static void getFirst(int n){
	        for( char ch = 'a'; ch <= 'z'; ch++){
	        	c = 0;
	        	pwd = new char[n];
	            if(ch != 'y'){
	            	pwd[0] =ch;
	            	getRest(n-1);
	            }
	        }
	    }
	static void getRest(int n){
		if(n==0){
		//	System.out.println(pwd);
			printPassword();
			
		}
		else{
			c++;
			if(isVowel(pwd[c-1]))
            {
                int temp1 = c;    // value of c will be changed, hence it is stored in temp1 variable
                for(char ch='a';ch<='z';ch++)
                {
                    if(!isVowel(ch) && ch != 'y')
                    {
                        pwd[c] = ch;
                        getRest(n-1);
                    }
                    c=temp1;    //retreiving back the value of c.
                }
            }
            else
            {
                int temp2=c;  // value of c will be changed, hence it is stored in temp2 variable
                char vowels[]={'a','e','i','o','u'};
                for(char ch : vowels)
                {
                    pwd[c] = ch;
                    getRest(n-1);
                    c=temp2;  //retreiving back the value of c.
                }
            }
			
			
		 
		   
			
		}
		
		
		
	}
	static void printPassword()
    {
        for(int i=0; i<length; i++)
        {
            System.out.print(pwd[i]);
          
        }
        System.out.println();
       }
	
	 static boolean isVowel(char ch)
	    {
	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	            return true;
	        else
	            return false;
	    }
}

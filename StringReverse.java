import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
	//convert string to array and reverse into another array
	String[] forwardArray = A.split("");
	String[] backwardArray = new String[forwardArray.length];
	for(int i = 0;i < forwardArray.length;i++)
	    {
		backwardArray[i] = forwardArray[forwardArray.length-i-1];
	    }
	
	//write reverse string to a StringBuffer
	StringBuffer sb = new StringBuffer();
	for(int j = 0; j < forwardArray.length;j++)
	    {
		sb.append(backwardArray[j]);
	    }
	String B = sb.toString();
	
	//test is the string is a palindrome
	System.out.println(A.equals(B) ? "Yes" : "No");
	

	/*
	  This was the top-rated submission
	  
	  System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );

	*/

    }
}
import java.io.*;
import java.util.*;

public class JavaStringsHack {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
	// get lengths and add together
	int aLength = A.length();
	int bLength = B.length();
	int totalLength = aLength + bLength;
	System.out.println(totalLength);

	//compare the strings lexicographically
	int result = A.compareTo(B);
	System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
	if(result < 0)System.out.println("No");
	else System.out.println("Yes");

	//convert the first letter of each string to uppercase
	String aCap = A.substring(0, 1).toUpperCase() + A.substring(1);
	String bCap = B.substring(0, 1).toUpperCase() + B.substring(1);
	System.out.println(aCap + " " + bCap);
        
    }
}

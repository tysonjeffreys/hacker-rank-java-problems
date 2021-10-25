import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInit {
    static int B, H;
    static boolean flag;
    
    static {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
	  H = Integer.parseInt(br.readLine());
	  B = Integer.parseInt(br.readLine());
	}catch (IOException ioe){
	  System.out.println(ioe);
	}
	//try {
	    if(H > 0 && B > 0){
		flag = true;
	    }
	    //}catch (Exception ex) {
	    else System.out.println("java.lang.Exception: Breadth and height must be positive");
	    //}


    }

    public static void main(String[] args){
	if(flag){
	int area=B*H;
	System.out.println(area);
	}
    
}//end of main

}//end of class

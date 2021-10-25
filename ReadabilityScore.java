//package readability;
import java.io.*;


public class ReadabilityScore {
    public static void main(String[] args) {
	String line;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	try{
	    line = reader.readLine()
	    if(line.length() > 100)System.out.println("HARD");
	    else System.out.println("EASY");
	}catch (IOException ex) {
	    System.out.println(ex);
	}
	//       System.out.print("Hello world!");
        
    }
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] args) {

	//	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in);
	Scanner scanner = new Scanner(System.in);
	//	String firstLine = scanner.nextLine();
	int i = 0;
	while(scanner.hasNextLine()) {
	    i++;
		//	    String line = scanner.nextLine();
	    System.out.println(i + scanner.next());
	} 
	scanner.close();




        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

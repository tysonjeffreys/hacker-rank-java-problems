import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayListHack {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	//enter the number of lines(inner arrays)
	System.out.println("enter number of lines");
	int numLines = sc.nextInt();
	ArrayList<ArrayList<Integer>> outterArr = new ArrayList<ArrayList<Integer>>();
	for(int i = 0;i < numLines;i++)
	    {
		System.out.println("enter quantity of numbers inside inner array");
		int k = sc.nextInt();
		outterArr.add(i, new ArrayList<Integer>(k));
		for(int j = 0;j < k;j++)
		    {
			System.out.println("enter number");
			int num = sc.nextInt();
			outterArr.get(i).add(num);
		    }
	    }
	ArrayList<Integer> queries = new ArrayList<>();
	System.out.println("enter number of queries");
	int q = sc.nextInt();
	for(int l = 0;l < q;l++)
	    {
		System.out.println("enter the number for queries");
		int x = sc.nextInt();
		int y = sc.nextInt();
		try{
		    System.out.println(outterArr.get(x-1).get(y-1));
		}catch (IndexOutOfBoundsException ex){
		    System.out.println("ERROR!");
		}
	    }
	     
	    
	
	
		
     

 





   }
}
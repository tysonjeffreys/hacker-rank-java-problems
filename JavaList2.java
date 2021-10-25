import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList2 {
    
    public static void main(String[] args) {
	
	//Get the integers and create ArrayList
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	List<Integer> L = new ArrayList<Integer>();
	//System.out.println("Enter multiple numbers");
	for(int i = 0; i < N;i++)
	    {
		L.add(sc.nextInt());
	    }

	//Get the number of queries and perform queries
	System.out.println("Enter the number of queries");
	int Q = sc.nextInt();
	for(int j = 0; j < Q; j++){

            System.out.println("enter query");
            String query = sc.next();
	    if(query.equals("Insert"))
		    {
			System.out.println("enter insert position and number");
			int index = sc.nextInt();
			int addNum = sc.nextInt();
			L.add(index, addNum);
			}
		   
		else if(query.equals("Delete"))
		    {
			System.out.println("enter index to delete");
			int deleteNum = sc.nextInt();
			L.remove(deleteNum);
		    }
	}

	//Print the ArraList
	for(int elem : L)
	    {
		System.out.println(elem);
	    }

    }
}

    
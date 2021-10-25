import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList {
    
    static List<Integer> L = new ArrayList<Integer> ();

   
    Scanner sc;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Q;
    int n = 3;
    int a[] = new int[n];
    String[] M = new String[Q];

    void getArrayList() 
    {
	try {
	    sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    //br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter multiple numbers");
	    String[] M = br.readLine().split(" ");
	    for(String num : M)
		{
		    L.add(Integer.parseInt(num));
		}
	
	}catch(IOException ex) {
	    System.out.println(ex);
	}
	
	
    }
    
    void getQueries()
	{
	    sc = new Scanner(System.in);
	    System.out.println("Enter the number of queries");
	    int Q = sc.nextInt();
	    for(int j = 0; j < Q; j++){

	    System.out.println("enter query");
	    String query = sc.next();
	    try {

	    if(query.equals("Insert"))
	       {
		   System.out.println("enter insert position and number");
		   String[] Q2 = br.readLine().split("\\s");
		   for(int i = 0; i <= 1; i++){
		       a[i] = Integer.parseInt(Q2[i]);
		   	   
		   this.insertNum(a[0],a[1]);
		   }
	       }
	    else if(query.equals("Delete"))
		  {
		      System.out.println("enter index to delete");
		      int num = sc.nextInt();
		      this.deleteNum(num);
		  }
	    }catch (IOException ex){
		System.out.println(ex);
	    }
	    }
	
	}
	

    void insertNum(int x, int y)
	    {
		L.add(x, y);
	    }
    void deleteNum(int num)
    {
	L.remove(num);
    }

    /*void printArray()
    {
	for(int num : L)
	    {
		System.out.print(num + " ");
	    }
	    }*/
    
    public static void main(String[] args) {
	
	JavaList jl = new JavaList();
	
	jl.getArrayList();
	jl.getQueries();
	//jl.printArray();
	for(int num : L)
            {
                System.out.print(num + " ");
            }

	/*
	

	//try{
	// System.out.println("enter number of ints"); 
	//   int N = sc.nextInt();
	   
	  
	   //Get the number of queries
	   System.out.println("Enter the number of queries to run");
	   int Q = sc.nextInt();
	   
	   //Get the first query 
	   System.out.println("enter query")
	   String query  = sc.next();
	   
	   //run for loop based on the amount of queries to perform
	   //for(int i = 0;i < Q;i++)
	   //  {
	   
	   if(query.equals("Insert")
	      {
		  
	      


	

       }catch (IOException ex) {
	   System.out.println(ex);
       }

	  /*		  
	   queryMetho
	   

	    //int Q = sc.nextInt();
	    //System.out.println(Q);
       } catch(IOException e)
	    {
	    System.out.println(e);
	    }
       System.out.println("enter number of queries");
       int numOfQuery = sc.nextInt();
       for(int i = 0; i <= numOfQuery; i++)
	   {
	       System.out.println("Enter query type");
	       String query = sc.next();
	       if(query.equals("Insert"))
		  {
		      int[] a = new int[2];
		      try{
			  // int[] a = new int[2];
			  String[] insert = bufferedReader.readLine().split(" ");
			  for(int j = 0; j < 2; i++)
			      {
				  a[j] = Integer.parseInt(insert[j]);
			      }
		      }catch (IOException ex){
			  System.out.println(ex);
		      }
		  }
		  }
	   
   
	       
	       



	/*
5
12 0 1 78 12
2
Insert
5 23
Delete
0
	*/
 
   }
}
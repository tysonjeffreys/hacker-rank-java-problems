import java.util.*;
import java.io.*;

class JavaLoopsTwo{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
	int t=in.nextInt();
        for(int i=0;i<t;i++){
	    System.out.println("enter a");
            int a = in.nextInt();
	    System.out.println("enter b");
            int b = in.nextInt();
	    System.out.println("enter n");
            int n = in.nextInt();
	    int x = 0;
	    int y = 0;
	    int z = 0;
	
	    for(int j = 0;j < 1;j++)
		{
		    x = a + ((int) Math.pow(2, 0) * b);
		    System.out.print(x + " ");
		    for(int k = 0;k < 1;k++)
			{
			    y = ((int) Math.pow(2, k-1)*b)+x;
			    
			    for(int m = 2;m < n+1;m++)
				{
				    z += ((int) Math.pow(2, m-1)*b);
				    
				
				    System.out.print(z + y + " ");
				}
			    System.out.println("");

			}
		}
	}
	

    }
}
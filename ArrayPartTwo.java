import java.util.*;

public class ArrayPartTwo {

    public static boolean canWin(int leap, int[] game) {
    
	int[] game1 = game;
	int leap1 = leap;
	int i = 0;
	int n = game1.length - 1;
	//int n = 2;
	boolean go = true;
	boolean win = false;
	int k = 0;
	//while(win == false)
	while(go)
	    {
		System.out.println("beginning i: " + i);
		k++;
		System.out.println("loop: " + k);
		if(i >= n-1){System.out.println("First If: i = " + i);win = true; go = false;}
	    
		else if(i + leap >= n){win = true; go = false;System.out.println("Second If: i = " + i);}

//this statement test if the move is 'blocked' ie moving one space forward or leap forward is not possible 
		
		else if(game1[i + 1] == 1 && game1[i + leap] == 1 && game1[i - 1] == 1){System.out.println("Third If: i = " + i);win = false; go = false;}
		
		else if(game[i + leap] == 0){i = i + leap;System.out.println("Fourth If: " + i);}
		
		else if(game1[i + leap] == 0 || i+leap >= n ){i = i + leap; System.out.println("Fifth If: i = " + i);}

		else if(game1[i + 1] == 0){i++;System.out.println("Sixth If: i = " + i);}
		
		System.out.println("i = " + i);

		//else win = true; go = false;
		game1[i]=1;
		

	      }




	return win;
    
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("enter query");
	//int q = scan.nextInt();
	int q = 1;
	while (q-- > 0) {
	    //System.out.println("enter n");
	    //int n = scan.nextInt();
	    int n = 6;
	    //System.out.println("enter leap");
            //int leap = scan.nextInt();
            int leap = 3;
            //int[] game = new int[n];
            /*for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
		
		}*/
	    int[] game ={0,0,1,1,1,0};

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
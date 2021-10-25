import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
	Calendar calendar = Calendar.getInstance();
	calendar.set(2015, 7, 5);
	return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }

}

public class DayOfWeek {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = 8; // Integer.parseInt(firstMultipleInput[0]);

	int day = 5; //Integer.parseInt(firstMultipleInput[1]);

        int year = 2015; //Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
	System.out.println(res);
	//        bufferedWriter.write(res);
        //bufferedWriter.newLine();

	//        bufferedReader.close();
        //bufferedWriter.close();
    }
}

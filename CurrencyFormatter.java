import java.util.*;
import java.text.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale local = new Locale("fra", "FRANCE");
	//Currency usd = Currency.getInstance(local);
	//System.out.println(usd.getCurrencyCode());
	//System.out.println(usd);
	NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
	NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
	NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
	NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	//currencyFormat.setCurrency(usd);
	//	System.out.println(currencyFormat.format(payment));

	        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
		
}
}
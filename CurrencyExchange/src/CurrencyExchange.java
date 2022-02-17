/*
 * 	File: 		CurrencyExchange.java
 * 	Author:		Jennifer Leigh
 * 	Date:		2022/02/16
 * 	Purpose:	To convert CND to USD or USD to CND
 * */


import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyExchange {
	

	public static void main(String[] args) {
		
		double	exchangeRate = 0.0;
		double	userAmount = 0.00;
		double	convertedAmount = 0.00;
		char	exchangeType = 'C';	
		
		String convertFrom ="CAD";
		String convertTo = "USD";
		
		Scanner userInput = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("0.00");
		
		System.out.println("Canada - United States Currency Converter");
		
		
		System.out.print("\nEnter the CAN-US exchange rate in Canadian dollars: ");
		exchangeRate = userInput.nextDouble();
		
		System.out.print("Do you want to exchange [Canadian] currency or [U]S currency: ");
		exchangeType = userInput.next().toUpperCase().charAt(0);
		
		System.out.print("How much do you want to exchange: ");
		userAmount = userInput.nextDouble();
		
		userInput.close();
		
		if (exchangeType == 'U') {
			convertedAmount = userAmount * exchangeRate;
			convertFrom ="USD";
			convertTo = "CAD";
		}
		else {
			convertedAmount = userAmount / exchangeRate;
		}	

		
		System.out.printf("You can exchange %s %s for %s %s.",formatter.format(userAmount), convertFrom,  formatter.format(convertedAmount), convertTo);		
		
	}

}

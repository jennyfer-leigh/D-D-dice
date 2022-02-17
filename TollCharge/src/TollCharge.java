/*	File:		TollCharge.java
 * 	Author:		Jennifer Leigh
 * 	Date:		2022/02/16
 * 	Purpose:	To calculate and report the toll for a vehicle.
 */

import java.text.DecimalFormat;
import java.util.Scanner;



public class TollCharge {
	
		final static double REGULAR_ZONE_KM_PRICE = 0.302;
		final static double LIGHT_ZONE_KM_PRICE = 0.287;
		final static double TRIP_TOLL_CHARGE = 0.8;
		final static double ACCOUNT_FEE = 3.40;


	public static void main(String[] args) {
	
		char transponder = 'Y';
		int	kmInRegular = 0;
		int kmInLight = 0;
		double videoTollCharge = 0.00;
		//Video Toll charge and account fee is used if the vehicle hasn't got a transponder. 
		
		
		Scanner userInput = new Scanner(System.in);
		DecimalFormat toCurrency = new DecimalFormat("0.00");
		
		System.out.print("Does your vehicle carry a transponder? (Y/N): ");
		transponder = userInput.next().toUpperCase().charAt(0);
			if (transponder != 'Y'){
				videoTollCharge = 3.95;	
			}
			
		System.out.print("Enter the kilometres travelled in the regular zone: ");
		kmInRegular = userInput.nextInt();
		
		System.out.print("Enter the kilometres travelled in the light zone: ");
		kmInLight = userInput.nextInt();
		
		userInput.close();
		
	
		double totalRegular = kmInRegular * REGULAR_ZONE_KM_PRICE;
		System.out.println("\nToll charge for traveling 25.0 km in the regular zone: $" + toCurrency.format(totalRegular));
		
		double totalLight = kmInLight * LIGHT_ZONE_KM_PRICE;
		System.out.println("Toll charge for traveling 25.0 km in the regular zone: $" + toCurrency.format(totalLight));
		
		toCurrency.applyPattern("#.##");
		System.out.println("Video toll charge: %" + toCurrency.format(videoTollCharge));	
		
		toCurrency.applyPattern("0.00");
		System.out.println("Trip toll charge: %" + toCurrency.format(TRIP_TOLL_CHARGE));
		
		System.out.println("TOTAL TOLL CHARGE: %" + toCurrency.format(totalRegular + totalLight + videoTollCharge + TRIP_TOLL_CHARGE));
		
			if (transponder != 'Y') {
				System.out.printf("\nYour monthly bill will also include a $%s account fee.", toCurrency.format(ACCOUNT_FEE));
			}		
		
	}

}

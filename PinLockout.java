/*
 * Eniola 
 * 11/22/2021
 */

import java.util.*;
import java.io.*;

public class PinLockout {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Account.");
	
		Scanner scan = new Scanner(System.in);
		String garbage;
		String errorMsg = "Invalid.";                       // for any invalid input 
		
		final int PIN = 1234;                               //pin to access the account
		int tries = 1;                                     // initialized to 1 to count number of tries
		
		
		System.out.println("ENTER YOUR PIN: ");          
		
		
		while ( !scan.hasNextInt())                         //  guide user to type in the correct data type
		{
			//flush
			garbage = scan.nextLine();
			
			//re-prompt
			System.out.println(errorMsg);
			System.out.println("ENTER YOUR PIN: ");
		}	
		
		int pinNum = scan.nextInt();                             
		
		while (pinNum != PIN)                                    // to check if the pin is correct and re-prompt if wrong 
		{
			System.out.println("INCORRECT PIN. TRY AGAIN.");     
			
			System.out.println("ENTER YOUR PIN: ");
		     pinNum = scan.nextInt();
			tries++;
			
			if(tries == 3 && pinNum != PIN)                    // locks account if pin is wrong three times
			{
				System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
			    break;
			}  
		}
	    
	 if (pinNum == PIN)                                          
		 System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	    
	}

}

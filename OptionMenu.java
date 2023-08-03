package AtmMachine;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account{
	
	Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException{
    	int x=1;
    	do {
    		try {
    			data.put(952545, 2222);
    			data.put(657585, 3333);
    			System.out.println("welcome to the Atm");
    			System.out.print("Enter your Account Number: ");
    			setCustomerNumber(menuInput.nextInt());
    			
    			System.out.println("enter your Pin Number : ");
    			setPinNumber(menuInput.nextInt());
    		}
    		catch(Exception e) {
    			System.out.println("\n" + "Invalid Charachters.only Numbers" + "\n");
    			x=2;
    			
    		}
    		
    		int cn = getCustomerNumber();
    		int pn = getPinNumber();
    		if(data.containsKey(cn) && data.get(cn)==pn) {
    			getAccountType();
    		}
    		else {
    			System.out.println("\n"+ "Wrong customer number or Pin number" + "\n");
    		}
    		
    	}
    	while(x==1);
    }

	public void getAccountType() {
	 System.out.println("select the account you want to access : ");
	 System.out.println("Type 1 -- checking Account");
	 System.out.println("Type 2 -- saving Account");
	 System.out.println("Type 3 -- exit");
		int selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			  getChecking();
		      break;
		      
		      case 2:
		            getSaving();
		             break;
		 
		             case 3:
		            	 System.out.println("thankyou for using the  Atm , bye \n");
		            	 break;
		default:
			System.out.println("\n" +"Invalid choice " + "\n");
			getAccountType();
		}
	}
	         
	    public void getChecking() {
	    	System.out.println("Checking Account : ");
	    	System.out.println("Type 1-- View balance");
	    	System.out.println("Type2-- Withdraw funds");
	    	System.out.println("Type 3 -- deposit Funds");
	    	System.out.println("Type 4 -- exit");
	    	System.out.print("choice : ");
	    	int selection = menuInput.nextInt();
	    	switch(selection) {
			case 1:
				System.out.println("checking Account Balance :"+moneyFormat.format(getCheckingBalance()));
				getAccountType();
			      break;
			      
			      case 2:
			            getCheckingWithdrawInput();
			            getAccountType();
			        
			             break;
			      case 3:
			    	  getCheckingDepositInput();
			    	  getAccountType();
			    	  break;
			 
			             case 4:
			            	 System.out.println("thankyou for using the  Atm , bye \n");
			            	 break;
			default:
				System.out.println("\n" +"Invalid choice " + "\n");
				getChecking();
			}
	    }
	
	    public void getSaving() {
	    	System.out.println("saving Account : ");
	    	System.out.println("Type 1-- View balance");
	    	System.out.println("Type2-- Withdraw funds");
	    	System.out.println("Type 3 -- deposit Funds");
	    	System.out.println("Type 4 -- exit");
	    	System.out.print("choice : ");
	    	int selection = menuInput.nextInt();
	    	switch(selection) {
			case 1:
				System.out.println("saving Account Balance :"+moneyFormat.format(getSavingBalance()));
				getAccountType();
			      break;
			      
			      case 2:
			            getSavingWithdrawInput();
			            getAccountType();
			        
			             break;
			      case 3:
			    	  getSavingDepositInput();
			    	  getAccountType();
			    	  break;
			 
			             case 4:
			            	 System.out.println("thankyou for using the  Atm , bye \n");
			            	 break;
			default:
				System.out.println("\n" +"Invalid choice " + "\n");
				getChecking();
			}
	    }
}
	


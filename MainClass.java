package App;

import java.util.Arrays;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		final String inputExp = ReadInput.read();
		
		
		Queue<String> numbers;
		Queue<String> operations;
		
		String numberArr[] = inputExp.split("[-+*/]");
		
		String operArr[] = inputExp.split("[0-9]+");
		
		numbers = new LinkedList<>(Arrays.asList(numberArr)); 
		
	    operations = new LinkedList<>(Arrays.asList(operArr));
		
	    Double res = Double.parseDouble(numbers.poll());
	    
	    while(!numbers.isEmpty()) {
	    	String opr = operations.poll();
	    	
	    	Operate operate;
	    	
	    	switch(opr) {
	    	
	    	case "+":
	    		operate = new Add();
	    		break;
	    		
	    	case "-":
	    		operate = new Subtract();
	    		break;
	    		
	    	case "*":
	    		operate = new Multiply();
	    		break;
	    		
	    	case "/":
	    		operate = new Divide();
	    		break;
	    		
	    	default :
	    		continue;
	    	}
	    	Double num = Double.parseDouble(numbers.poll());
	    	res = operate.getResult(res,num);
	    	
	    	}
	    System.out.println(res);
	    }
	}



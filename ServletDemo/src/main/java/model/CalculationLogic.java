package model;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Sep 18, 2021
 */
public class CalculationLogic {
	
	int num1;
	int num2;
	int total;
	String operation;
	
	
	public CalculationLogic(int num1, int num2, String operation) {
		
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.operation = operation;
		getTotal(num1, num2, operation);
		
	}
	
	
	public void getTotal(int num1, int num2, String operation) {
		
		if (operation.equals("+")) {
			
			this.total = num1 + num2;
			
		}
		
		else if (operation.equals("-")) {
			
			this.total = num1 - num2;
			
		}
		
		else if (operation.equals("/")) {
			this.total = num1 / num2;
			
		}
		
		else if (operation.equals("*")) {
			this.total = num1 * num2;
			
		}
		
	}
	
	
	/**
	 * @return the num1
	 */
	public int getNum1() {
		return num1;
	}
	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	/**
	 * @return the num2
	 */
	public int getNum2() {
		return num2;
	}
	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}
	/**
	 * @return the operation
	 */
	public String getOperation() {
		
		
		return operation;
	}
	/**
	 * @param operation the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	@Override
	
	public String toString() {
		return "You entered the calculation: " + num1 + " " + operation + " " + num2 +" = " + " " + total;
	}

}

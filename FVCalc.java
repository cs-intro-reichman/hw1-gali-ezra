// Computes the future value of a saving investment.



public class FVCalc {
	public static void main(String[] args){


		//System.out.println("enter your invested sum");
	    int currentValue = Integer.parseInt(args[0]);

		//System.out.println("enter the annual interest rate");
	    double rate = Double.parseDouble(args[1])/100;

		//System.out.println("enter the number of years of investing");
	    int numOfYears = Integer.parseInt(args[2]);

		double futureValue = currentValue * Math.pow((1 + rate), numOfYears);

		System.out.println("After "+ numOfYears + " years, a $" + currentValue + " saved at " +(double) rate*100 + "% will yield $" +(int) futureValue);
		
	}
}
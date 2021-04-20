package assignment;

public abstract class AbstractAccount {
	public double loanValue;	
	public double rateValue;
	public int daysActive;
	
	public double getLoan() {
		System.out.println("The loan value is ");
		return loanValue;
	}
	
	public double getRate() {
		System.out.println("The rate is ");
		return rateValue;
	}
	
	//must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		System.out.println("The monthly rate is ");
		return loanValue*rateValue;
	}
	
	//The function sets the loan value; If the value is less than 0 it throws and exception
	public void setLoanValue(double loanValue) throws Exception {
		if(loanValue<0)
			throw new UnsupportedOperationException("Value must be greater than 0");
		else
		{
			this.loanValue = loanValue;
		}
	}
	
	//The function sets the rate value; If the value is less than 0 it throws and exception
	public void setRateValue(double rateValue) throws Exception {
		if(rateValue<0)
			throw new UnsupportedOperationException("Value must be greater than 0");
		else
		{
			this.rateValue = rateValue;
		}
	}
	
	//The function sets the days of activity; If the value is less than 0 it throws and exception
	public void setDaysActive(int daysActive) throws Exception {
		if(daysActive<0)
			throw new UnsupportedOperationException("Value must be greater than 0");
		else
		{
			this.daysActive = daysActive;
		}
	}
	
	public String printLoan() {
		return "The loan value is: "+this.loanValue
				+"; The rate value is: "+this.rateValue
				+"; Total number of days active is:"+daysActive;
	}

	public void calculatePrincipalInterest()
	{
	double totalFee=0.0;
	totalFee+=.0125	*	(	//	1.25%	broker's	fee
			this.loanValue*Math.pow(this.rateValue,(this.daysActive/365)) - this.loanValue);	//	interest-principal
	
	System.out.println("The principal interest is:"+totalFee);
	}

}

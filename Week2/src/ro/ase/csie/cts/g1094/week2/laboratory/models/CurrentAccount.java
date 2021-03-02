package ro.ase.csie.cts.g1094.week2.laboratory.models;

import ro.ase.csie.cts.g1094.week2.laboratory.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1094.week2.laboratory.exceptions.InsufficientFundsExceptions;

public class CurrentAccount extends BankAccount {
	
	public static final double MAX_CREDIT=5000;

	public CurrentAccount(String iban) {	
		super(iban, CurrentAccount.MAX_CREDIT);
	}
		
		
	@Override
	public void deposit(Double amount) {
		this.balance += amount;
	}

	@Override
	public void withdraw(Double amount) throws InsufficientFundsExceptions {
		if(amount  > this.balance) {
			throw new InsufficientFundsExceptions("You don't have the required amount");
		}
		else {
			this.balance -= amount;
		}
	}

	@Override
	public void transfer(Account destination, Double amount) throws InsufficientFundsExceptions, IllegalTransferException {

		if(this == destination) {
			throw new IllegalTransferException();
		}
		this.withdraw(amount);
		destination.deposit(amount);
		
	}

}

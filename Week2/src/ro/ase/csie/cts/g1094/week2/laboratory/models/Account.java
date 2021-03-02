package ro.ase.csie.cts.g1094.week2.laboratory.models;

import ro.ase.csie.cts.g1094.week2.laboratory.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1094.week2.laboratory.exceptions.InsufficientFundsExceptions;

public abstract class Account {

	public abstract void deposit(Double amount);
	public abstract void withdraw(Double amount) throws InsufficientFundsExceptions, InsufficientFundsExceptions;
	public abstract Object getBalance();
	public abstract void transfer(Account destination, Double amount) throws InsufficientFundsExceptions, IllegalTransferException;
}

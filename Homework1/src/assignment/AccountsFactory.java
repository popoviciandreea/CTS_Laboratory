package assignment;

public class AccountsFactory {
public static AbstractAccount getAccount(AccountType type, double loanValue, double rateValue, int daysActive) {
		
	    AbstractAccount account = null;
		switch(type) {
		case STANDARD:
			account = new Standard(loanValue, rateValue, daysActive);
			break;
		case BUDGET:
			account = new Budget(loanValue, rateValue, daysActive);
			break;
		case PREMIUM:
			account = new Premium(loanValue, rateValue, daysActive);
			account.calculatePrincipalInterest();
			break;
		case SUPER_PREMIUM:
			account = new SuperPremium(loanValue, rateValue, daysActive);
			account.calculatePrincipalInterest();
			break;
			default:
				throw new UnsupportedOperationException("Type not covered");
		}
		
		return account;
	}
}

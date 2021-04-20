package assignment;

public class MainClass {

	public static void main(String[] args) {
		
		User newUser = 
				new User("Popescu Ion", AccountsFactory.getAccount(AccountType.PREMIUM, 2000, 0.5,20));
		newUser.setAccount(AccountsFactory.getAccount(AccountType.SUPER_PREMIUM, 2000, 0.3,60));
		
		

	}

}

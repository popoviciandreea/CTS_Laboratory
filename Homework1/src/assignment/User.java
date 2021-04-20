package assignment;

public class User {
	
String userName;
	
AbstractAccount account;

public User(String userName, AbstractAccount account) {
	super();
	this.userName = userName;
	this.account = account;
}

public void setAccount(AbstractAccount account) {
	this.account = account;
}
}

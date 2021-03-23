package ro.ase.csie.cts.g1094.singleton;

public class DbConnection {
	
	String connString;
	String schema;
	
	private static DbConnection connection = null;
	
	private DbConnection(){
		System.out.println("Creating connection");
		System.out.println("Loading config......");
		this.connString="127.0.0.1:1443";
		this.schema="cts";
	}
	
    private DbConnection(String connString, String schema) {
    	super();
    	this.connString=connString;
    	this.schema=schema;
    }
    
    //Is not clean and misleading - others will think they have multiple connections
    public static DbConnection getConnection() {
    	if(DbConnection.connection == null) {
    		connection = new DbConnection();
    	}
    	
    	return DbConnection.connection;
    }
    
    
}

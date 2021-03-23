package ro.ase.csie.cts.g1094.singleton.registry;

public class TestRegistry {

	public static void main(String[] args) {
		
		DbConnection con1 = DbConnection.getDbConnection("121.0.0.1","devDB");
		DbConnection con2 = DbConnection.getDbConnection("121.0.0.1","devDB");
		
		DbConnection con3 = DbConnection.getDbConnection("10.0.0.1","prodDB");
		
		if(con1 == con2) {
			System.out.println("They are the same");
		}
		
		if(con2 != con3) {
			System.out.println("They are diff");
		}

	}

}

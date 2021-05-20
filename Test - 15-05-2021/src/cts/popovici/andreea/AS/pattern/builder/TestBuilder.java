package cts.popovici.andreea.AS.pattern.builder;
import cts.popovici.andreea.AS.pattern.builder.DoubleBed;
import cts.popovici.andreea.AS.pattern.builder.SingleBed;


public class TestBuilder {

	public static void main(String[] args) {
		
		HollydayTrip hollydayTrip1 = new HollydayTrip.HollydayTripBuilder("Buena Vista")
				.isBreakfast()
				.addBedType(new DoubleBed())
				.build();
		
		HollydayTrip hollydayTrip2 = new HollydayTrip.HollydayTripBuilder("Buena Vista")
				.isBreakfast()
				.addBedType(new SingleBed())
				.build();
		
		HollydayTrip hollydayTrip3 = new HollydayTrip.HollydayTripBuilder("Sunset Valley")
				.isSmokingRoom()
				.isSeasideView() 
				.addBedType(new DoubleBed())
				.addFloorLevel(2)
				.build();
	}

}

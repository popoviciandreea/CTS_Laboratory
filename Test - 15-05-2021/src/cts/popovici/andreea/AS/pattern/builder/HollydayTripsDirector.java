package cts.popovici.andreea.AS.pattern.builder;

import cts.popovici.andreea.AS.pattern.builder.HollydayTrip.HollydayTripBuilder;

public class HollydayTripsDirector {

	HollydayTrip.HollydayTripBuilder builder;
	
	public HollydayTripsDirector(HollydayTrip.HollydayTripBuilder builder) {
		this.builder = builder;
	}
	
	public HollydayTrip buildBuenaVista() {
		return builder.isBreakfast()
			.addBedType(new DoubleBed())
			.addBedType(new SingleBed())
			.addPersonNumber(1)
			.build();
	}
	
	public HollydayTrip buildSunsetValley() {
		return builder.isSmokingRoom()
		.isSeasideView() 
		.addBedType(new DoubleBed())
		.addFloorLevel(2)
		.build();
	}
	
}

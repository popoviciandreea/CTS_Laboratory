package cts.popovici.andreea.AS.pattern.builder;


public class HollydayTrip {

	String hotel;
	boolean isBreakfast;
	int personNumber;
	boolean isSeasideView;
	int floorLevel;
	boolean isSmokingRoom;
	
	BedInterface bedType;
	
	private  HollydayTrip() {
	}
	
	private HollydayTrip(String hotel,boolean isBreakfast,int personNumber,boolean isSeasideView,int floorLevel,boolean isSmokingRoom,BedInterface bedType) {
		super();
		this.hotel=hotel;
		this.isBreakfast=isBreakfast;
		this.personNumber=personNumber;
		this.isSeasideView=isSeasideView;
		this.floorLevel=floorLevel;
		this.isSmokingRoom=isSmokingRoom;
		this.bedType=bedType;
	}
	
	public static class HollydayTripBuilder{
		private HollydayTrip hollydayTrip=null;
		
		public HollydayTripBuilder(String hotel) {
			hollydayTrip = new HollydayTrip();
			hollydayTrip.hotel = hotel;
		}
		
		public  HollydayTripBuilder isBreakfast() {
			hollydayTrip.isBreakfast = true;
			return this;
		}
		
		public HollydayTripBuilder addPersonNumber(int personNumber) {
			hollydayTrip.personNumber = personNumber;
			return this;
		}
		
		public  HollydayTripBuilder isSeasideView() {
			hollydayTrip.isSeasideView = true;
			return this;
		}
		
		public HollydayTripBuilder addFloorLevel(int floorLevel) {
			hollydayTrip.floorLevel = floorLevel;
			return this;
		}
		
		public  HollydayTripBuilder isSmokingRoom() {
			hollydayTrip.isSmokingRoom = true;
			return this;
		}
		
		public HollydayTripBuilder addBedType(BedInterface bed) {
			hollydayTrip.bedType = bed;
			return this;
		}
		
		public HollydayTrip build() {
			return this.hollydayTrip;
		}
	}
}

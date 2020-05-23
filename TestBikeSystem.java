package bikesystem;

public class TestBikeSystem{
	
	public static void main(String[] args){
		//Creates a new bikeSystem with 9 storage spaces, inserts and prints bikes, 
		//then closes system.
		BikeSystem bikeSystem = new BikeSystem(9);
		bikeSystem.insertBike("Bike|Emily|Spinner|14|0|1");
		bikeSystem.insertBike("MTB|Kirstin|Explorer|26|10|200|120");
		bikeSystem.insertBike("RB|Alexander|Roadster|27|12|100|5");
		bikeSystem.insertBike("Bike|Sharon|Alley|24|5|20");
		bikeSystem.printSystem();
		bikeSystem.printServiceIntervals();
		bikeSystem.closeShop();
	}
}
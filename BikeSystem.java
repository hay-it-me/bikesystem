package bikesystem;

import java.util.ArrayList;

public class BikeSystem{
	private int storageSpace;
	private int bikesStored;
	ArrayList<Bike> bikeArrayList = new ArrayList<>();
	
	public void setStorageSpace(int storageSpace){
		this.storageSpace = storageSpace;
	}
	public int getStorageSpace(){
		return storageSpace;
	}
	public void setBikesStored(int bikesStored){
		this.bikesStored = bikesStored;
	}
	public int getBikesStored(){
		return bikesStored;
	}	
	BikeSystem(){
		
	}
	BikeSystem(int storageSpace){
		this.storageSpace = storageSpace;
		this.bikesStored = 0;	
	}
	public boolean insertBike(String bikeString){
		//bikeString is split into a temporary array of Strings using split with a "|" regex.
		String [] temp = bikeString.split("\\|",-2);
		//Checks for if bike already exists or bikeSystem is full.
		if (bikeExists(temp[1], temp[2]) == false && getBikesStored()< getStorageSpace()){
			//Checks the start of the string for MTB or RB substrings to create appropriate Bike objects.
			if (bikeString.substring(0,3).equals("MTB")){
				MountainBike newBike = new MountainBike(temp[1], temp[2], Integer.parseInt(temp[3]),
														Integer.parseInt(temp[4]), Integer.parseInt(temp[5]), 
														Integer.parseInt(temp[6]));
				bikeArrayList.add(newBike);
			}
			else if (bikeString.substring(0,2).equals("RB")){
				RoadBike newBike = new RoadBike(temp[1], temp[2], Integer.parseInt(temp[3]), 
												Integer.parseInt(temp[4]), Integer.parseInt(temp[5]), 
												Integer.parseInt(temp[6]));
				bikeArrayList.add(newBike);
			}
			else {
				Bike newBike = new Bike(temp[1], temp[2], Integer.parseInt(temp[3]), 
										Integer.parseInt(temp[4]), Integer.parseInt(temp[5]));
				bikeArrayList.add(newBike);
			}
			setBikesStored(getBikesStored() + 1);
			return true;
		}
		else {
			return false;
		}
	}
	public boolean bikeExists(String owner, String model){
		//Scans through bike array for same owner and model strings.
		for (Bike b : bikeArrayList){
			if (owner.equals(b.getOwner()) && (model.equals(b.getModel()))){
				return true;
			}	
		}
		return false;
	}
	public void printSystem(){
		for (Bike b : bikeArrayList){
				System.out.println(b.toString());
		}
	}
	public void closeShop(){
		bikeArrayList.clear();
		setBikesStored(0);
	}
	public void printServiceIntervals(){
		for (Bike b : bikeArrayList){
			System.out.println(b.getOwner() + ", " + b.getModel() + ", " + b.calcServiceInterval());
		}
	}
}
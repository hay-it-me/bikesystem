package bikesystem;

public class MountainBike extends Bike{
	private int suspensionDepth;
	
	public void setSuspensionDepth(int suspensionDepth){
		this.suspensionDepth = suspensionDepth;
	}
	public int getSuspensionDepth(){
		return suspensionDepth;
	}
	public MountainBike(){
		
	}
	public MountainBike(String owner, String model, int wheelDiameter, int gears, 
						int kmsRidden, int suspensionDepth){
		super(owner, model, wheelDiameter, gears, kmsRidden);
		this.suspensionDepth = suspensionDepth;
	}
	@Override
	public String toString(){
		return "MTB|" + getOwner() + "|" + getModel() + "|" + getWheelDiameter() + "|" 
				+ getGears() + "|" + getKmsRidden() + "|" + getSuspensionDepth();
	}
	@Override
	public int calcServiceInterval(){
		return getWheelDiameter()* getGears() - getSuspensionDepth();
	}
}
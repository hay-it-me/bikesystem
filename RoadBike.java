package bikesystem;

public class RoadBike extends Bike{
	private int reflectorsFitted;
	
	public void setReflectorsFitted(int reflectorsFitted){
		this.reflectorsFitted = reflectorsFitted;
	}
	public int getReflectorsFitted(){
		return reflectorsFitted;
	}
	public RoadBike(){
		
	}
	public RoadBike(String name, String model, int wheelDiameter, int gears, 
					int kmsRidden, int reflectorsFitted){
		super(name, model, wheelDiameter, gears, kmsRidden);
		this.reflectorsFitted = reflectorsFitted;
	}
	@Override
	public String toString(){
		return "RB|" + getOwner() + "|" + getModel() + "|" + getWheelDiameter() + "|" 
				+ getGears() + "|" + getKmsRidden() + "|" + getReflectorsFitted();
	}
	@Override
	public int calcServiceInterval(){
		return getKmsRidden() * getReflectorsFitted();
	}
}
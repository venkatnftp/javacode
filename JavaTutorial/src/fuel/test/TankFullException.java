package fuel.test;

public class TankFullException extends Exception{
	int numberOfGallons;
	
	public TankFullException(int gallons){
		this.numberOfGallons = gallons;
	}
}

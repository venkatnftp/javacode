package fuel.test;

public class GasStation {
	public static void main(String[] args) {
		GasStation station = new GasStation();
		try {
			System.out.println("Filling started");
			station.fillCarWithGas(30, 20);
			System.out.println("Filling Finished");
		} catch (TankFullException e) {
			System.err.println("Tank is Full");
			e.printStackTrace();
		} finally {
			System.out.println("Please close the lid and pay the bill");
		}
	}
	
	public void fillCarWithGas(int numberOfGallonsToFill, int capacityOfCar) throws TankFullException{
		if(numberOfGallonsToFill > capacityOfCar)
			throw new TankFullException(capacityOfCar);
	}
	
}

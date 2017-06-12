public class Ch7Ex6
{
	public static void main(String[] argv)
	{
		Vehicle V1 = new Vehicle();
		Truck T1 = new Truck();
		V1.setVehicle("Chevy", 5);
		T1.setTruck(2.4, 50);
		T1.readOutput();
		V1.readOutput();
	}
}

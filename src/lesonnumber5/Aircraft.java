package lesonnumber5;

public class Aircraft {
	int passengers;
	int cruiseSpeed;
	double fuelCapacity;
	double foulBurnRate;

	public static void main(String[] args) {
		Aircraft american = new Aircraft();
		Aircraft delta = new Aircraft();

		american.passengers = 100;
		american.cruiseSpeed = 200;
		american.fuelCapacity = 65.50;
		american.foulBurnRate = 8.5;

		System.out.println("american passengers " + american.passengers);
		System.out.println("american cruiseSpeed " + american.cruiseSpeed + " mph");
		System.out.println("\n***********************************");
		delta.passengers = 120;
		delta.cruiseSpeed = 300;
		delta.fuelCapacity = 50.00;
		delta.foulBurnRate = 10.00;

		System.out.println("delta passengers " + delta.passengers);
		System.out.println("delta burnRate " + delta.foulBurnRate + " mph");

	}

}

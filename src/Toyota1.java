
public class Toyota1 extends ElectricCar1 implements Car1,Drone1{
	public Toyota1() {
		System.out.println("This constructor is from Toyota class");
	}
	
	// method is implemented inside class, not declared
	// also called non abstract method
	public static void toyotaInfo() { // static method
		System.out.println("This method is from Toyota class");
	}
	
	public int toyotaPrice() {
		int price = 45000;
		System.out.println("The price for Toyota is: "+price);
		return price;
	}

	@Override
	public void canFloat() {
		
		
	}

	@Override
	public void lightWeight() {
		
	}

	@Override
	public void price() {
		
	}

	@Override
	public String electricCarName() {
		
		return null;
	}

	@Override
	public void autoPilot() {
		
		
	}

	@Override
	public void rent() {
		
		
	}

	@Override
	public void carryingpassenger() {
		
		
	}

	@Override
	public void carryingGoods() {
		
	}

	@Override
	public void start() {
		
	}

	@Override
	public String stop() {
		
		return null;
	}

	@Override
	public void brake() {
		
	}

}

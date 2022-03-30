
public abstract class ElectricCar1 extends Flaying1 implements HoverCar1 {
	public String nameElectricCar = "Tesla";
	public int costElectricCar = 45000;
	
	// Constructor declared
	public ElectricCar1() {
		System.out.println("This constructor is from Abstract class-- Electric Car");
	}
	
	// method declared
	// This is mandatory to put abstract keyword with the abstract method in Abstract Class
	// This is the norm to write at least one abstract method inside abstract class
	public abstract void price();
	
	// method implemented
	public void battery() {
		System.out.println("The Battery is very efficient");
	}
	
	public abstract String electricCarName(); // return type

}

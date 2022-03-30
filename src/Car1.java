
public interface Car1 extends Taxi1,Truck1 {
	public static final int bornYear =1982;
	public void start(); // void type
	public String stop(); // return type
	public abstract void brake(); // void type
	public default void honk() { // this default is not access modifier
		System.out.println("Honk feature from Car Interface");
	}	
	public static void gear() {
		System.out.println("Gear feature from Car Interface");
	}
	

}

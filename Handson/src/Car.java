
public class Car extends Vechile{

	private String Brand;
	private int gear;
	private String version;
	
	public Car(String colour, int tyre, String type, String brand, int gear, String version) {
		super(colour, tyre, type);
		System.out.println("Car info");
		Brand = brand;
		this.gear = gear;
		this.version = version;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Car [Brand=" + Brand + ", gear=" + gear + ", version=" + version + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}

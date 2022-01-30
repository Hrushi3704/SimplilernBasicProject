
public class Vechile {

	private String colour;
	private int Tyre;
	private String type;
	
	public Vechile(String colour, int tyre, String type) {
		System.out.println("Welcome To vechile");
		this.colour = colour;
		this.Tyre = tyre;
		this.type = type;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getTyre() {
		return Tyre;
	}
	public void setTyre(int tyre) {
		Tyre = tyre;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Vechile [colour=" + colour + ", Tyre=" + Tyre + ", type=" + type + "]";
	}
	
	
}

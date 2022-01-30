
public class Customer {

	private static int id;
	private String name;
	private String loca;
	
	public Customer(String name, String loca) {
		id++;
		this.name = name;
		this.loca = loca;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", loca=" + loca + "]";
	}
	
}


public class Person {

	private String Name;
	private int Age;
	
	public Person(String name, int age) {
		System.out.println("Person class");
		this.Name = name;
		this.Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + "]";
	}
	
	
}


public class Student extends Person {
	
	String Subject;
	int std;
	int rollno;
		
	public Student(String name, int age, String subject, int std, int rollno) {
		super(name, age);
		Subject = subject;
		this.std = std;
		this.rollno = rollno;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [Subject=" + Subject + ", std=" + std + ", rollno=" + rollno + ", toString()="
				+ super.toString() + "]";
	}
	
}

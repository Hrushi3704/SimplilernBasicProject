
public class StaticDemo {

	public int instancevair;
	public static int Staticvairable;
	
	public void Instancemethod() {
		
		System.out.println("Instance method");
		instancevair = 100;
		Staticvairable =200;
		
	}

	
	public static void Staticmethod()
	{
		System.out.println("static method");
        //instancevair = 100;// cant access non static member in static method directly
 
		//to access non static member we have create instance
		StaticDemo demo = new StaticDemo();
		demo.instancevair = 300;
		Staticvairable =200;
	}
	
	
	
}

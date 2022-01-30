
public class StaticDemoMain {

	public static void main(String[] args) {
		
		// to access instance variable
		StaticDemo demo = new StaticDemo();
		demo.instancevair = 20;
		System.out.println(demo.instancevair);
		
		
		// to access for static variable
		StaticDemo.Staticvairable = 30;
		System.out.println(StaticDemo.Staticvairable);
		
		//to access Instance method outside the class instanceobj.method
		demo.Instancemethod();
		
		//to access Static method outside the class  classname.method
		StaticDemo.Staticmethod();
	}
	
}

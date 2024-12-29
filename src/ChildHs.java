import org.testng.annotations.Test;

public class ChildHs extends ParentHs{


	@Test
	public void testRun()
	{
		System.out.println("hhhh");
		// if it does not inherit parent class " extends ParentHs"  and you write below code  "doThis()", it fails
		// since you need to create an objct of that class in order it works   such as below:
		//ParentHs pd = new ParentHs(); 
		// pd.doThis();
		doThis();
		
		int a = 3;
		ParentOtherMethods obj1 = new ParentOtherMethods(a);  //parameterized constructor
		System.out.println(obj1.increment());
		System.out.println(obj1.multiplyByThree());
		
	}

}

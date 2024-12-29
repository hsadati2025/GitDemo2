import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParentHs {

	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("run me first");
		System.out.println("run me first2");
		System.out.println("run me first3");
	}
	
	@AfterMethod
	public void afterRun()
	{
		System.out.println("run me last");
	}
	
	public void doThis() 
	{
		System.out.println("I am here");
	}

}

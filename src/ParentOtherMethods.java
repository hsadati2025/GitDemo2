
public class ParentOtherMethods extends multiMethod{

	// a is a class variable
	int a =0;
	
	// this is a constructor of this class with one parameter
	// a2 is an instance variable
	public ParentOtherMethods(int a2) {
		super(a2);                  // parent  constructor class "multiMethod"  is invoked
		this.a=a2;                  // this refers to current class variable
	}

	public int increment()
	{
		a=a+1;
		return a;
	}
}

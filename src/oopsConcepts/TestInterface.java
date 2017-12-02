package oopsConcepts;

public class TestInterface implements InterfaceBike
{

	public void engine() 
	{
	System.out.println("case1:" + "All bikes have engine");	
	}

	public void wheel() {
		System.out.println("case2:" + "All bikes have wheels");		
	}
	public void seat() {
		
		System.out.println("case3:" + "All bikes have single seat");		
	}

	public void handle() {
		System.out.println("case4:" + "All bikes have handles");		
		
	}

}

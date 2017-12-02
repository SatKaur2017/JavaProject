package oopsConcepts;

public class TestClass 
{
	public static void main(String[] args) 
	{
		//Animal a = new Animal();
		//a.eatfood(); a.sleep(); 
		//Dogs d = new Dogs();
		//d.bark(); d.dogtype();
		LabraDog lb = new LabraDog();
		lb.eyes();lb.jaw();lb.eatfood();lb.bark();lb.dogtype();lb.sleep();
	
		//inheritance of Abstract class 
		HeroHonda mybike = new HeroHonda();
		mybike.engine();mybike.handle();mybike.seat();mybike.wheels();
			
		//interface and abstract class
		TestInterface bikefr = new TestInterface();
		bikefr.seat();bikefr.handle();bikefr.engine();
		bikefr.wheel();
		//boolean truth table
		Operators booln = new Operators();
	
		EncapClass encap= new EncapClass();
		encap.setAge(35);
		encap.setId("101");
		encap.setName("Gobind G");
		System.out.println("Name:"+ encap.getName() + "\nAge:" + encap.getAge() + "\nID:" + encap.getId());
		//Overridden method
				ClassOverride co = new ClassOverride();
				co.
				
	
	}
}
package OOPSConcept;

public class StaticVariablenMethod {

	int salary=25000;     //normal variable
	long increment=5000;
	boolean age= false;
	
	
	
	static int savings=10000;        //static variable
	
	void check1() 
	{
		System.out.println("Income");	
	}
	
    static void check2 () 
    {
    	System.out.println("Expences");
    }
	
	
	
	
	public static void main(String[] args) {
		
		StaticVariablenMethod obj=new StaticVariablenMethod (); //Normal variable
		
		System.out.println("Normal variable:"+obj.salary);
		System.out.println(obj.increment);
		System.out.println("I'm just 23-->"+obj.age);
		
		obj.check1();    //static normal variable
		
		System.out.println("Static variable:"+StaticVariablenMethod.savings);
		System.out.println(savings);
	    
		StaticVariablenMethod.check2();   //static method- way1
		check2();                        //             - way2
	}

}

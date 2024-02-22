package OOPSConcept;

public class Constructor2 {
	
	String name;
	int rank;
	char grade;
    
	Constructor2()
	{
	  System.out.println("Default Constructor");
	}
	
	
	Constructor2(char g, int m)
	{
	  System.out.println("Two Parameterized Constructor");
	  m=97;
	  System.out.println("Gender-" +g);
	  System.out.println("Mark-" +m);
	}
	

	Constructor2(int a, double b, boolean c)
	{
	  System.out.println("Three Parameterized Constructor");
	  a=30;
	  b=2503.73d;
	  c=true;
	  System.out.println("Prime number-" +a);
	  System.out.println("Decimal number-" +b);
	  System.out.println("The Prime and Decimal numbers are " +c);
	
	}
	public static void main(String[] args) {
	
		Constructor2 obj=new Constructor2();
				
				System.out.println(obj.name= "Sree");	
				System.out.println(obj.rank=3);		
		        System.out.println(obj.grade='D');
	    
	    Constructor2 obj2=new Constructor2('F',97);
		        
		Constructor2 obj3=new Constructor2(30, 2503.73,true);
		
	}

}

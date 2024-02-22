package OOPSConcept;

public class MOLdemo3 {
	
	          //METHOD OVERLOADING IN STATIC METHOD (MAIN)
	
	  // We can overload main method also.
	  // Entry point to execution--> main
	  // Always the compiler looks for STRING ARRAY INPUT to execute first
	
	
	    public static void area()             //static method
        {
            System.out.println("Area");
        }
	
	    public static void area(int i)             
	    {
	        System.out.println("Area of the Circle is " +i);
	    }
	    public static void area(char name)
	    {
	        System.out.println("Radius of the circle--> "+name);
	    }
	    
	    
	    public static void main(String s1,char b1)       //main method
	    {
	        System.out.println("Main method with string and char arguments");
	    }
	    public static void main(int a1,char b1,int c1) 
	    {
	        System.out.println("Main method with 3 arguments");
	    }
	    public static void main(char b1) 
	    {
	        System.out.println("Main method with 1 char arguments");
	    }
	    public static void main(boolean t1)
	    {
	        System.out.println("Main method with 1 boolean arguments");
	    }
	    
	    public static void main(String[] args) {
	        
	    	area();
	        area(120);
	        area('r');
	        
	        main("MainMethod",'%');
	        main(50,'*',50);
	        main('*');
	        main(true);
	        
	
	}

}

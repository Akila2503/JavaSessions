package OOPSConcept;

public class Constructor1 {
	
	                     
	                          //CONSTRUCTORS
	                      
	    
	    //Class---> contains Constructors
	    //1.Constructor are  used to initialize the data and objects
	    //2.Constructors name should be same as class name
	    //3.cannot have any return type value/ void int float etc
        //4.no return type
        //5.constructor will be called when we create object
	    //6.whenever we use 'parameterized constructor' compulsarily we use 'default constructor'
	   
	    String name;
        int age;
        double salary;
    
    
	    void show()
	    {
	        System.out.println("Show");
	    }
	    
	    
	    
	    
	 /*  Syntax:
	     
	      class_name()
	      {
	           body   
	      }
	     
	  */
	    
	                //Two types of Constructor
	    
	    //1.default Constructor
	    //2.Parameterized Constructor 
	    
	    
	    //1.default Constructor(zero)
	    
	    Constructor1()
	    {
	      System.out.println("This is default constructor");
	    }
	    
	    
	    
	    //2.Parameterized Constructor
	    
	    Constructor1(String n,int a,double s)
	    {
	        System.out.println("This is 3 parameterized constructor");
	        name=n;
	        age=a;
	        salary=s;
	        
	        
	        System.out.println("The name is-->"+name);
	        System.out.println("The age is-->"+a);
	        System.out.println("The salary is-->"+salary);
	        
	        
	    }
	    
	    
	    
	 
	        Constructor1(String name,int age)
	        {
	            System.out.println("This is 2 parameterized constructor");
	            this.name=name;
	            this.age=age;
	        
	        
	            System.out.println("The name is-->"+this.name);
	            System.out.println("The age is-->"+this.age);
	            
	            
	            
	        }
	
	    
	    public static void main(String[] args) {
	        
	        Constructor1  obj=new Constructor1();
	        
	        System.out.println(obj.name="Nucot");
	        System.out.println(obj.age=25);
	        System.out.println(obj.salary=12456.000);
	       
	        /*
	        obj.name="Nucot";
	        obj.age=25;
	        obj.salary=12456.000;
	        */
	        
	        Constructor1  obj1=new Constructor1("Modi",40,300000.0);
	        
	        Constructor1  obj2=new Constructor1("Nucot",12);
	
		    
		    

	
		
	}

}

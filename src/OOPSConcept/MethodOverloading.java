package OOPSConcept;

public class MethodOverloading {
	                     
	                     // METHOD OVERLOADING
	  
	 // Method overloading is the example of compile time polymorphism.
	 // Method overloading will happen with in the single class
     // If class contains multiple methods that method names should be same
     // but the arguments(parameters) order should be different
     // number of arguments should different
    
     //syntax:
/*
              data_type method_name()
              {
     
              }
*/
    
	           //METHOD OVERLOADING IN NORMAL METHOD
	
    void add(int a,int b)
    {
        int t1=a+b;
        System.out.println(t1);
        
    }
    
    void add(int a,char c)
    {
        int t1=a+c;
        System.out.println(t1);
        
    }
    void add(String a,char c)
    {
        String t1=a+c;
        System.out.println(t1);
        
    }
    
    void add(int a,int b,int c)
    {
        int t2=a+b+c;
        System.out.println(t2);
        
    }
    
    void add(int a,int b,int c,int d)
    {
        int t3=a+b+c+d;
        System.out.println(t3);
        
    }
    
    void add(int a,int b,int c,int d,int e)
    {
        int t4=a+b+c+d+e;
        System.out.println(t4);
        
    }
    
    
    public static void main(String[] args) {
        
        MethodOverloading obj=new MethodOverloading();
        
        obj.add(10, 5);
    
        obj.add(10, 10, 10);
        
        obj.add(10, 10, 10,10);
        
        obj.add(10, 10, 10,10,10);
        
        obj.add(10, 'a');
        
        obj.add("Modi", 'a');
        
	

	}

}

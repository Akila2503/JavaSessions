package OOPSConcept;

public class MOLdemo2 {
	
	               //METHOD OVERLOADING IN STATIC METHOD
	
	  // Can we overload static method--> yes
	
	int a=10;
    static int  b=30;
    void show()
    {
      System.out.println("show method");
    }
    
    static void test()
    {
      System.out.println("test1");
    }
    
    static void test(int t1)
    {
      System.out.println("test1");
    }
    
    static void test(int t1,int t2)
    {
      System.out.println("test2");
    }
    
    static void test(int t1,int t2,int t3)
    {
      System.out.println("test3");
    }
    
    
    
    public static void main(String[] args) {
        MOLdemo2 obj=new MOLdemo2();
        System.out.println(obj.a);
        obj.show();
        
  // static data 
     // first way variable
        System.out.println(b);
        
     // classname.variable_name;
        System.out.println(MOLdemo2.b);
        
  // first way to execute static method
     // method name();
        test(10);
        test();
        
  // Second way to execute static method
     // Classname.methodname();
        MOLdemo2.test();
        MOLdemo2.test(10);

	

	}

}

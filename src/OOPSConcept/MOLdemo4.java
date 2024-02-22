package OOPSConcept;

public class MOLdemo4 {
	
             //METHOD OVERLOADING IN STATIC METHOD

    public static void display()      // static method
    {
        System.out.println("Display");
    }
    public static void display(String name)
    {
        System.out.println("Display-->"+name);
    }
    
    
    public static void main(int a,int b)    //static main method
    {
        System.out.println("Main method with two arguments");
    }
    
    public static void main(int a,int b,int c) 
    {
        System.out.println("Main method with 3 arguments");
    }
    
    public static void main(char a) 
    {
        System.out.println("Main method with one  char arguments");
    }
    
    public static void main(int a) 
    {
        System.out.println("Main method with one int  arguments");
    }
    
    
    void show()        //normal method
    {
        System.out.println("show");
    }
    
    
    public static void main(String[] args) {
        
    	MOLdemo4 obj=new MOLdemo4();   //create an object to execute normal method
        obj.show();                 
        
        display();      
        display("Modi");
        
        main(10,20);
        main(2,3,4);
        main('a');
        main(10);
    

	
	}

}

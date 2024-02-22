package InheritanceConcept;

       
                  // SingleLevel Inheritance

  
   class A               //parent class
   {
       int a=10;
       
       void show()
       {
           System.out.println("show in parent class");
       }
   
   }
   
   class B extends A      //child class
   {
       int b=30;
       
       void display()
       {
           System.out.println("display in child class");
       }
     
   }
   
   public class SingleLevelInheritance{
       public static void main(String[] args) {
           
           A obj1=new A();             // create an object for parent class
           System.out.println(obj1.a);
           obj1.show();
           
       //  System.out.println(obj.b);
           
       // we cannot execute child class without executing parent class     
           
           B obj2=new B();        // create an object for child class
           
           System.out.println(obj2.b);
           obj2.display();
           
           System.out.println(obj2.a);
           obj2.show();
      
       
   
	}

}

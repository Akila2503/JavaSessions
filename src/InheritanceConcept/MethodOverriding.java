package InheritanceConcept;
       
                      //METHOD OVERRIDING

        // Runtime polymorphism is an example of method overriding
        // method overriding will happen between two classes
        // Method Overriding--> override parent class to execute child class
   
    class AAA  // parent class
    {
        
        void iphoneContactlist()
        {
            System.out.println("Normal iphone");
        }
        
        
        
    }
    class BBB extends AAA  //child class
    {
        
        @Override
        void iphoneContactlist()
        {
            System.out.println("Normal iphone");
            System.out.println("Extra features");
            
        }
        
        
    }
    public class MethodOverriding{
        public static void main(String[] args) {
            
            BBB obj=new BBB();
            obj.iphoneContactlist();
    
	}

}

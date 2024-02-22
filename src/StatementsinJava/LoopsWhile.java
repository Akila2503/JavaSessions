package StatementsinJava;

public class LoopsWhile {

	public static void main(String[] args) {
		               
		                       //LOOPS:
		            
		        /* 1. while
		           2. do while
		           3. for
		           4. for each  
		        */        
		            
		 
    //WHILE LOOP:-->Minimum number of times 'while' will execute--> 0
          
         /*    SYNTAX:
              
               while(condition)
               {
                  //body
               }
         */
		
    //CODE INFINITE WHILE LOOP:
        
         /*    
          1.   while(true)
               {
                  System.out.println("Welcome to bangalore");
               }
             
          2.   int g=10;
               while(g==10)
               {
                  System.out.println("modi");
               }
         */  
        
		              //Code to print 1 to 10 numbers using loop 
		
		
		System.out.println("Numbers from 1 to 10");
        int i=0;
        while(i<=10)
        {
           System.out.println(i);
           i++;                    //i+1-->0+1=1
        }
           System.out.println("thanks");
        
           
                     //Code to print even numbers
           
        System.out.println("Even numbers from 0 to 10");
        int b=0;
        while(b<=10)
        {
           System.out.println(b);
           b=b+2;                //ii+2-->0+2=2
        }
           System.out.println("bye");
           
                    
                    //Code to print odd numbers 
         
         System.out.println("Odd numbers from 1 to 20");
         int a=1;
         while(a<=20)
         {
             System.out.println(a);
             a=a+2;                   //a+2=1+2=3
         }
             System.out.println	("Thanks"); 
        	 
   
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
	}

}

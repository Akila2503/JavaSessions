package StatementsinJava;

public class Ifstatement {

	public static void main(String[] args) {
        
		            //IF STATEMENT
		
        
    //if-statement:
       
          //syntax:
        
             /*  if(condition)
                 {
                   body
                 }
		     */
       
       //Example:1
         
		int sun=100;
        int star=25;
        
        if(sun>star)
        {
          System.out.println("Sun is bigger than star");  
        }
        if(star<sun)
        {
          System.out.println("Star is smaller than sun");
        }
          
        
       //2
        
          int time=12;
          int t1= 8;
          int t2= 18;
          
          if(t1<time)
          {
        	  System.out.println("Good Morning");
          }
          if(t2>time)
          {  
        	  System.out.println("Good Evening");
          }
              System.out.println("Good Night");
              
              
       
    //if-else statement:
               
          //syntax:
                   
              /*  if(condition)
                   {
                     body
                   }
                  else
                   {
                     body
                   }
               */  
       
     //Example: 1          
        
        int i=80;
        int j=40;
        
        if(i>j)
        {
            System.out.println("i is greater than j");
        }
        else
        {
            System.out.println("j is greater than i");
        }
        
      //2.
        
        int R1=95;
        int R2=55;
        
        if(R1<R2)
        {
        	System.out.println("R1 is lesser than R2");
        }
        else
        {
            System.out.println("R1 is greater than R2");
        }
        
        
        
        
        
        
        
        
 
	}

}

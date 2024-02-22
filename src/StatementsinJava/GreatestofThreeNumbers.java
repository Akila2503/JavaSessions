package StatementsinJava;

public class GreatestofThreeNumbers {

	public static void main(String[] args) {
		
		                  //GREATEST OF THREE NUMBERS (else if)
		
		    int a=10;
	        int b=50;
	        int c=5;
	        
	        if(a>=b && a>=c)
	        {
	            System.out.println("a is greater");
	        }
	        else if(b>=a && b>=c)
	        {
	            System.out.println("b is greater");
	        }
	        else
	        {
	            System.out.println("c is greater");
	        }
	        
	  //Example:
		
		int date1=3;
	    int date2=25;
	    int date3=8;
	    
	    if(date1>=date2 && date1>date3)
	    {
	    	System.out.println("It's Naveen's Birthdate");
	    }
	    else if(date2>=date1 && date2>=date3)
	    {
	    	System.out.println("It's Akila's Birthdate");
	    }
	    else
	    {
	    	System.out.println("It's Diya's Birthdate");
	    }
	
	        
	//Another way to find the largest of three:
	        
	        
	  System.out.println("Second way to find the largest of 3");
	        
	        if(a>=b)       //case1
	          {
	            if(a>=c)
	            {
	                System.out.println("a is greater");
	            }
	            else
	            {
	                System.out.println("c is greater");
	            }
	          }
	        else
	            {
	            System.out.println("thanks");
	            }
	        
	        
	        if(b>=a)      //case2
	          {
	            if(b>=c)
	            {
	                System.out.println("b is greater");
	            }
	            else
	            {
	                System.out.println("c is greater");
	            }
	          }
	        else
	            {
	            System.out.println("thanks");
	            }
	        
	        
	        if(c>=a)     //case3
	          {
	            if(c>=b)
	            {
	                System.out.println("c is greater");
	            }
	            else
	            {
	                System.out.println("b is greater");
	            }
	          }
	        else
	            {
	             System.out.println("thanks");
	            }
	        
	}

}

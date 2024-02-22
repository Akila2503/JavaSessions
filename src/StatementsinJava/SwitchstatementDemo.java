package StatementsinJava;

public class SwitchstatementDemo {

	public static void main(String[] args) {
		
                              //SWITCH STATEMENT
		
		//SYNTAX:
		  
		   /* switch(expression)
		      {
		          case:
		               statement
		               break;
		            
		          case:
		               statement
		               break;
		            
		          case:
		               statement
		               break;
		            
		          case:
		               statement
		               break;
		            
		          case:
		               statement
		               break;
		            
		        default:
		               statement
		               break;
		       }     
		    */
		
	//Example: string
        
		
       String ProgrammingLanguage= "Linux";
       
       switch(ProgrammingLanguage)
       
       {
       
         case "C++":
                    System.out.println("C++ is a programming language");
                    break;
            
         case "Java":
        	         System.out.println("Java is a programming language");
                     break;
             
         case "C" :
                   System.out.println("C is a programming language");
                   break;
        
         case "Python":
                    System.out.println("Python is a programming language");
                    break;
        
         case "Javascript":
                    System.out.println("Javascript is a programming language");
                    break;
        
         default:
                    System.out.println("It's not a programming language");
                    break;
             
       }
      
       
    //Example: byte
       
       byte cubevalues = 8;
       
       switch(cubevalues)
       
       {
       
         case 8:
                    System.out.println("cube value of 2");
                    break;
            
         case 27:
        	        System.out.println("cube value of 3");
                    break;
         
         case -125:
	                System.out.println("not a cube value");
                    break;
             
         case 64:
                    System.out.println("cube value of 4");
                    break;
        
         case 125:
                    System.out.println("cube value of 5");
                    break;
        
        
         default:
                    System.out.println("thankyou");
                    break;
             
       }
      
    
       
     //short
     
	    short price=5;
	        
	        switch (5)
	        {
	        case 50:
	     	   System.out.println("50rupees is a note");
	     	   break;
	     	   
	        case 100:
	     	   System.out.println("100rupees is a note");
	     	   break;  
	     	   
	        case 2000:
	     	   System.out.println("2000rupees is a note");
	     	   break;
	     	   
	        case 20:
	     	   System.out.println("20rupees is a note");
	     	   break;
	     	   
	        case 500:
	     	   System.out.println("500rupees is a note");
	     	   break;
	     	   
	        case 200:
		       System.out.println("200rupees is a note");
		       break;
		       
	        case 5:
	        	System.out.println("5rupee is a coin");
	        	break;
	        	
	        default:
	     	   System.out.println("Thankyou");
	     	   break;
	     	   
	        }
       
         
       
	}

}

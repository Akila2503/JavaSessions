package StatementsinJava;

public class Nestedifelse2 {
	public static void main(String[] args) {
		
		                  //NESTED IF-ELSE EXAMPLES
		
	    //==(conditional operator) used in primitive data types to compare
		// =(assignment operator) used in nonprimitive data types to compare
    
     //== conditional operator in primitive
		
          int a=20; 
          int b=20;
          
          if(a==b)   // == conditional operator in primitive
          {
            System.out.println("a is  equal to b");
          }
          else
          {
            System.out.println("a is not equal to b");
          }
            
		
	 //= assignment operator in nonprimitive

          System.out.println("Launch the browser");
  		
  		String browserName="edge";       // = assignment operator in nonprimitive

  		if(browserName.equals("chrome"))    //(variable_name .equals ("value"))
  		{
  		    System.out.println("Launch Chrome browser");
  		    
  		}
  		else if(browserName.equals("firefox"))
  		{
  		    System.out.println("Launch Firefox browser");
  		    
  		}
  		else if(browserName.equals("edge"))
  		{
  		    System.out.println("Launch Edge browser");
  		    
  		}
  		else if(browserName.equals("ie"))
  		{
  		    System.out.println("Launch IE browser");
  		    
  		}
  		else if(browserName.equals("safari"))
  		{
  		    System.out.println("Launch Safari browser");
  		    
  		}
  		else
  		{
  		    System.out.println("Pass the right browser name");
  		}



    //2.
  		
        System.out.println("Name List");
  		
  		String Name="naveen";       // = assignment operator in nonprimitive

  		if(Name.equals("aadhi"))    //(variable_name .equals ("value"))
  		{
  		    System.out.println("Name of the boy");
  		    
  		}
  		else if(Name.equals("akila"))
  		{
  		    System.out.println("Name of the girl");
  		    
  		}
  		else if(Name.equals("diya"))
  		{
  		    System.out.println("Name of the girl");
  		    
  		}
  		else if(Name.equals("naveen"))
  		{
  		    System.out.println("Name of the boy");
  		    
  		}
  		else if(Name.equals("dev"))
  		{
  		    System.out.println("Name of a boy");
  		    
  		}
  		else
  		{
  		    System.out.println("Not in the list");
  		}







  		}

  	}

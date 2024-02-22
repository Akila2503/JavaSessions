package OOPSConcept;

public class MOLlogindemo {
	  
	                  //METHOD OVERLOADING IN NORMAL METHOD
	
	   void login()
	    {
	     System.out.println("Login with out username and pwd");
	    }
	    
	    void login(String username)
	    {
	     System.out.println("Login with username -->"+ username);
	    }
	    
	    void login(String username,String pw)
	    {
	     System.out.println("Login with username and pwd--->"+username+":-->"+pw);
	    }
	    
	    
	    public static void main(String[] args) {
	        MOLlogindemo obj=new MOLlogindemo();
	        
	        obj.login();
	        obj.login("Modi");
	        obj.login("Modi","Modi@123");
	        
	
	
	}

}

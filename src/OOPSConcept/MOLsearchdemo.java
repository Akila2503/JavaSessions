package OOPSConcept;

public class MOLsearchdemo {
	
	             //METHOD OVERLOADING IN NORMAL METHOD
	
	    void search()
	    {
	      System.out.println("search the product");
	    }
	    
	    void search(String username)
	    {
	      System.out.println("search the product with name -->"+ username);
	    }
	    
	    void search(String name,int price)
	    {
	      System.out.println("search the product with name and price--->"+name+":-->"+price);
	    }
	    
	    void search(String name,int price,String brand)
	    {
	      System.out.println("search the product with name,price and brand --->"+name+":-->"+price+"--->"+brand);
	    }
	    
	    
	    public static void main(String[] args) {
	        
	        
	        MOLsearchdemo obj =new MOLsearchdemo();
	        
	        obj.search();
	        obj.search("mobile");
	        obj.search("mobile",100000);
	        obj.search("mobile",100000,"iphone");
	
	}

}

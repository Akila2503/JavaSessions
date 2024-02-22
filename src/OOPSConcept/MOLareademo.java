package OOPSConcept;

public class MOLareademo {

                      //METHOD OVERLOADING IN NORMAL METHOD
	
	 void area()
	 {
		 System.out.println("Area of the triangle");
	 }
	 
	 void area(int length)
	 {
		 System.out.println("Length of the triangle is" +length);
	 }
	 
	 void area(int length, int breadth)
	 {
		 System.out.println("Length n Breadth of the triangle is " +length+ "," +breadth);
	 }
	 
	 void area(int length, int breadth, int height)
	 {
		 System.out.println("Length, Breadth n Height of the triangle is "+length *breadth *height);
	 }
	 
	 
	
	public static void main(String[] args) {
		
		MOLareademo obj=new MOLareademo();
        
        obj.area();
        obj.area(3);
        obj.area(3,3);
        obj.area(3,3,3);
        
        
	}

}

package java23.com;

public class IncrementandDecrementOperators {

	public static void main(String[] args) {
		
		            //Increment and Decrement Operators
        
	//Post increment--> 
		//variable_name++; 
		// a++;  
		
    //Pre increment--> 
	    //++variable_name;
        // ++a;
        
    //Post decrement--> 
		//variable_name--; 
		// a--;
		
    //Pre decrement-->
		//--variable_name; 
		// --a;
        
        
      //1.Post increment 
		//variable_name++; 
		//Example: a++;
        
        int x=7;
        int x1=x++;
        System.out.println("Post Increment i++");
        System.out.println(x);    //8
        System.out.println(x1);   //7
        
        int y=25;
        System.out.println(y);    //25
        int y1=y++;
        System.out.println(y);    //26
        System.out.println(y1);   //25
        
        
     //2.Pre increment  
        //++variable_name; 
        //Example: ++a;
        
        int z=4;
        System.out.println("Pre Increment ++i");
        System.out.println(z);     //4
        int z1=++z;
        System.out.println(z);     //5
        System.out.println(z1);    //5
        
        
     //3. Post Decrement
        //variable_name--;
        // b--;
        
        int u=19;
        System.out.println("Post Decrement d--");
        System.out.println(u);    //19
        int u1=u--;
        System.out.println(u);    //18
        System.out.println(u1);   //19
        
      //4.Pre Decrement
        //--variable_name;
        // --b;
        
        int v=2;
        System.out.println("Pre Decrement --d");
        System.out.println(v);    //2
        int v1=--v;
        System.out.println(v);    //1
        System.out.println(v1);   //1
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}

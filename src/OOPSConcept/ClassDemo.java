package OOPSConcept;

public class ClassDemo {

	                       // METHODS

       // METHOD DECLARATION: 
/*                 
*             Syntax: data_type method_name();
*                 
*             Example: int add();     
*          
*      // METHOD DEFINITION/IMPLEMENTATION:
*                 
*             Syntax: data_type method_name()
*                     {
*                       body/statement
*                     }
*                 
*             Example: int add()
*                      {
*
*                      }
*/                    	                     
              
    // a)NORMAL METHODS:  Methods-->class data members

           
        //1. No Return type and No Input
        //2. Some Return type and No Input
        //3. Some Return type and Some Input
        //4. No Return type and Some Input
        

/*      //1. No Return type and No Input:
 * 
 *           Syntax: data_type method_Name()
 *                   {
 * 
 *                   }
 *
 */       //Examples:
	 
	         void Type1()
	         {
	        	 System.out.println("Type1");
	         }
             void NoreturnNoinput()
             {
               System.out.println("NoreturnNoinput");
             }
             
  
        
         //2. Some Return type and No Input:
 /*
  *          Syntax:
  *                data_type method_Name()
  *                {
  *            
  *                }       
  */
             //Examples:
             
             int Type2()
             {
                System.out.println("Type2");
                //local variables
                int sr=10;
                int ni=20;
                int a=sr+ni;
                return a;
             }
             
             String SomereturnNoinput()
             {
            	 System.out.println("SomereturnNoinput");
            	 String n1="Akila";
            	 String n2="Sree";
            	 String name=n1+n2;
                 return name;
             }
             
    
    //3. Some Return type and Some Input
    
/*       Syntax:
                data_type method_Name(inputs)
                {
    
                }
*/
       //Examples:
             
             

             int mul(int dd,int ff)
             {
                 int zz=dd*ff;
                 return zz;
             }
             
             long divide( long g1, long g2)
             {
            	long g=g1/g2;
                return g;
             }
             
            String add( String s1, String s2)
            {
            	String s=s1+s2;
            	return s;
            }
             
            double mul(double d1, double d2)
            {
            	double d=d1*d2;
            	return d;
            }
            
            char add(char i, char j)   //output?
            {
            	char c='i'+'j';
            	return c;
            }
            
      
    //4. No Return type and some Input
    
/*       Syntax:
               data_type method_Name(inputs)
               {
         
               }
         
 */     //Examples:
            
            void sub(int ii,int jj)
            {
                int hh=ii-jj;
                System.out.println(hh);
                
            }
        
            void mul(float t1, float t2)
            {
            	float t=t1*t2;
            	System.out.println(t);
            }
    
            void sub(int e1, int e2)
            {
            	int e=e1-e2;
            	System.out.println(e);
            }
    
    
    
    public static void main(String[] args) {
        
    //OBJECT CREATION: 
               
    	//Syntax--> class_name obj_name=new class_name();
      
          ClassDemo obj=new ClassDemo();
        
    //HOW TO CALL CLASS VARIABLES:
              
         //Syntax--> objtect_name.variable_name
        
         // System.out.println(obj.a);
         // System.out.println(obj.b);
 
    //HOW TO EXECUTE METHOD:    
  
         //Syntax--> object_name.methodname();
        
        obj.Type1();              //NoreturnNoinput
        
        obj.NoreturnNoinput();
        
        int result=obj.Type2();    //SomereturnNoinput
        System.out.println(result);
       
        String name=obj.SomereturnNoinput();
        System.out.println(name);
        
        
        int mulresult=obj.mul(3,5);     //SomereturnSomereturn
        System.out.println(mulresult);
        
        long answer =obj.divide(144l,12l);
        System.out.println(answer);
        
        String method=obj.add("somereturn", "someinput");
        System.out.println(method);
        
        double value=obj.mul(1000d, 500d);
        System.out.println(value);
        
        char symbol=obj.add('o','+');  // ?
        System.out.println(symbol);
        
        obj.sub(10, 5);            //NoreturnSomeinput
        
        obj.mul(40f, 30f);    
        
        obj.sub(500, 100);   
        
       
        
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}

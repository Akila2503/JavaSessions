package StatementsinJava;

public class Forloop {

	public static void main(String[] args) {
		
		
		                    //FOR LOOP
        /*
           SYNTAX:
           
               //variable_updation-->++ or --
           
           for(variable_init;variable_condition;variable_updation)
           {
               body/statements
           }

         */
        
                        //1 to 10
        
        System.out.println("Numbers from 0 to 10");
        
        for(int i=0;i<=10;++i)
        {
          System.out.println(i);
        }
        
        
                       //Numbers from 1 to 10 in reverse order
        
        System.out.println("Numbers from 10 to 0");
        
        for(int f=10;f>=0;f--)
        {
          System.out.println(f);
        }
        
        
                      //Even numbers from 0 to 10
        
        System.out.println("Even Numbers from 0 to 10");
        
        for(int l=0;l<=10;l=l+2)
        {
         System.out.println(l);
        }
        
        
                      // multiples of 9 in reverse order from 90 to 0
        
        System.out.println("Multiples of 9 in reverse order");
       
        for(int m=90;m>=0;m=m-9)
        {
         System.out.println(m);	
        }
        
                     //In primitive data types:
        
     //short
        
        System.out.println("numbers from -5 to 5");
        for(short s=-5;s<=5; ++s)
        {
         System.out.println(s);	
        }
        
     //long
        
        System.out.println("even numbers from 10 to 20");
        for(long u=10l;u<=20l;u=u+2)
        {
         System.out.println(u);	
        }
        
     //double
        
        System.out.println("numbers from 3.1 to 4.0");
        for(double d=3.1d;d<=4d;d=d+0.1)
        {
         System.out.println(d);	
        }
        
     //float
        
        System.out.println("even numbers from 20 to 30");
        for(float f=20f;f<=30;f=f+2)
        {
         System.out.println(f);	
        }
        
     //char
        
        System.out.println(" character and its value");
        for(char A='a';A<='z';++A)
        {
         System.out.println("character and value="+A + -(byte)A );	
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}

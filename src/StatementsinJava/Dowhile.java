package StatementsinJava;

public class Dowhile {

	public static void main(String[] args) {
		
		
		                      // DO WHILE LOOP:
		
		//2.DO WHILE LOOP--> Minimum number of times 'do while' will execute--> 1
		
     /*
         SYNTAX:
        
         do
         {
           body/statement
         }while(condition);
         
     */     
                     //INFINITE DO WHILE
        
     /*    
         do
         {
         System.out.println("Hello");
         }while(true);
     */    

		
        
                          //Numbers from 1 to 10
		
        System.out.println("numbers from 1 to 10");
        
        int i=0;
        
        do
        {
            
            System.out.println(i);
            i++;
        
        }while(i<=10);
        
                         //Even numbers from 1 to 10
        
        System.out.println("Even from 1 to 10");    
        
        
        int ii=0;
        
        do
        {
            
            System.out.println(ii);
            ii=ii+2;
        
        }while(ii<=10);
        
                          
                         // odd numbers from 1 to 10
        
        System.out.println("Odd from 1 to 10");    
        
        
        int iii=1;
        
        do
        {
            
            System.out.println(iii);
            iii=iii+2;
        
        }while(iii<=10);
        
        
                       //MULTIPLES OF 3 UPTO 30
        
        System.out.println("Multiples of 3 upto 30");
        int dw=0;
        
        do
        {
        	System.out.println(dw);
        	dw=dw+3;
        }while(dw<=30);
   
                        //
        
        
        
        
        
        
        
        
	}

}

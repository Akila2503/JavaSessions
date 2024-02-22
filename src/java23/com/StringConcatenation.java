package java23.com;

public class StringConcatenation {

	public static void main(String[] args) {
		
                       //2.NON PRIMITIVE DATA TYPES
        
   //1.STRING--> Anything which is enclosed with double quotes.
		         //* Labels can be created by strings 
        
       //Variable
       //Data_type variable_name = value;
        
        String d;  // String declaration
        String a1="Welcome nucot"; // String initialization
        System.out.println(a1);
        String a2="great";
        System.out.println(a2);
        String a3=".";
        System.out.println(a3);
        String a4=" ";
        System.out.println(a4);
       
       // INT
         //In string,addition operator acts as a concatenation operator
    
        int p1=50; //primitive
        int p2=50;  //primitive
        System.out.println(p1+p2);
        
        String np1="Believe";  //nonprimitive
        String np2="Yourself";  //nonprimitive
        System.out.println(np1+np2);
        
        System.out.println(p1+np1);
        System.out.println(p1+p2+np1+np2);
        System.out.println(np1+np2+p1+p2);
        System.out.println(p1+p2);
        System.out.println(np1+np2+(p1+p2));
        System.out.println(p1+p2+np1+np2+p1+p2);
        System.out.println(p1+p2+np1+np2+(p1+p2));
        
      //DOUBLE 
        
        double d1=25.00;
        double d2=75.00;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1+np1);
        System.out.println(d1+d2+np1+np2);
        System.out.println(np1+np2+d1+d2);
        System.out.println(np1+np2+(d1+d2));
        
      // CHAR
        //a-z->97-122
        //A-Z--> 65 to 90
        //0-9 -->48 to 57
        //All special symbol
        
        char c1='d';
        char c2='%';
        System.out.println((byte)'d');
        System.out.println((byte)'%');
        System.out.println(c1+c2+np1+np2+'d');
        System.out.println(np1+np2+'d'+'%');
        System.out.println(np1+np2+(c1+'%'));
        
        // To know the ASCII values
        
        System.out.println((byte)'d');
        System.out.println((byte)'z');
        System.out.println((byte)'0');
        System.out.println((byte)'%');
        
     //BYTE
        
        byte b1=1;
        byte b2=0;
        System.out.println(b1+b2+np1+np2+b1);
        System.out.println(np1+np2+b1+b2+b2);
        System.out.println(b1+b2+np1+np2+(b1+np2));
        
     //short
        
        short s1=-5;
        short s2=2;
        System.out.println(s1+s2);
        System.out.println(np1+np2+s2+s1);
        System.out.println(s1+np1+(s1+s2));
        
     //long
        
        long g1=33;
        long g2=-55555555l;
        long g3= 777777777l;
        System.out.println(np1+g3);
        System.out.println(g1+np1+g3);
        System.out.println(np1+g3+(np2+g1));
        
     //float
        
        float f1=1.11f;
        float f2=(float)3.33;
        System.out.println(f1+f2);
        System.out.println(np1+f2+np2);
        System.out.println(f1+f2+np1+(f1+f2));
        
      
        
        
        
        
        
        
	}

}

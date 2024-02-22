package java23.com;

public class Datatypes {

	public static void main(String[] args) {
		
	                         //DATA TYPES
	
	           //1.Primitive Data Types (or) Built in Data Types
	           //2.Non Primitive Data Types
		
 //1.PRIMITIVE DATA TYPES
		
		//a.Boolean Type: True/False
		
		//b.Numeric Type:
		   //b1.Character Type: char
		   //b2.Integral Value: 
		         //Integer Type: byte, short, int, long
		         //Floating point: float, double
		
       //* VARIABLE DECLARATION: 
		  // syntax--> data_type  variable_name;
		  // Example-->   short s;
		
       //* VARAIBLE INITIALIZATION:
		  // syntax--> data_type  variable_name = value;
		  // Example-->      short s = 10;
		 
	   //* 1byte = 8bits
	   //* variable name cannot be same
		
		
   //1.BOOLEAN TYPE: True/false , Yes/No
	 //Size: 1 bit
		
		System.out.println("This is Boolean Data Type");
		
		boolean b=true;
		System.out.println(b);
		
		boolean bb=false;
		System.out.println(bb);
		
   //Example:
		
		boolean b1= 3<2;
		boolean b2= 5>2;
		
		System.out.println(b1);
		System.out.println(b2);
		
		
  //2.NUMERIC TYPE:
		
	 //2.a.CHARACTER TYPE: char
		 //char--> 2bytes--> 2*8=16bits
		 //size: bytes--> 2bytes--> 2*8=16bits
		 //range: 0 to 65535
	 
	  //Anything which is enclosed in a single quotes 'a' is called character data type.
	  //Declare only one character in a single quotes. 'a'<--like this, 'aa'<--not like this 
	  // a-z, A-Z, 0-9, and all special characters includes
		
		System.out.println("This is character data type");
		
		char c='C';
	    System.out.println(c);
		
		char cc='c';
	    System.out.println(cc);
		
		char ccc='@';
		System.out.println(ccc);
		
    //Example:
		
		char symbol='S';
		char symbol1='&';
		
		System.out.println(symbol);
		System.out.println(symbol1);
		
		
	//2.b.INTEGRAL VALUE:	
	          //1. INTEGER TYPE: BYTE, SHORT, INT, LONG 

		
	 //a.BYTE DATA TYPE: byte
		  //byte-->1byte--> 8bits
		  //size: 1byte= 8bits
		  //range: -128 to 127
		
	  //* If the assigned value is not in the range then we will get error 

	    System.out.println("This is byte data type");
		
		byte num1=25;
		System.out.println(num1);
		
		byte num2= -127;
		System.out.println(num2);
		
      //Example:
		
		byte range1= -109;
		byte range2= 33;
		System.out.println(range1);
        System.out.println(range2);
        
    //b.SHORT DATA TYPE: short
        //short--> 2bytes--> 2*8=16bits
        //size: 2bytes--> 2*8=16bits
        //range: -32768 to +32767
        
     //* If the assigned value is not in the range then we will get error 

         System.out.println("This is short data type");
        
      //Example:
        
        short s= 31313;
        System.out.println(s);
        
        short s1= -32;
        System.out.println(s1);
        
        short s2= -777;
        System.out.println(s2);
        
   //c.INT DATA TYPE: int
        //int--> 4bytes--> 4*8=32bits
        //size: 4bytes--> 4*8=32bits
        //range: -2147483648 to 2147483647
        
     //* If the assigned value is not in the range then we will get error 

        System.out.println("This is int data type");
        
      //Example:
        
        int value1= 0;
        System.out.println(value1);
        
        int value2= -11;
        System.out.println(value2);

        int value3= 333;
        System.out.println(value3);

        int value4= -5555;
        System.out.println(value4);
        
    //d.LONG DATA TYPE: long
        //long--> 8bytes-->8*8=64bits
        //size: 8bytes--> 8*8=64bits
        //range: -9223372036854775808 to 9223372036854775807
        
      //* If the assigned value is not in the range then we will get error 
        
        System.out.println("This is long data type");
        
      //Example:
          
        long day1= 25;
        System.out.println(day1);
        
        long day2= 5000000000l;
        System.out.println(day2);
        
        long day3= -75000000000l;
        System.out.println(day3);
        
   //2.FLOATING POINT: FLOAT, DOUBLE
        
     //1.FLOAT DATA TYPE: float
        //float--> 4bytes--> 4*8=32bits
        //size: 4bytes--> 4*8=32bits
        //range: 1.40239846e-45f to 3.40282347e+38f
        
        System.out.println("This is float data type");
        
     //Example:
        
        float f= 10.00f;
        System.out.println(f);
       //or
        
        float f1=(float)-25.00;
        System.out.println(f1);
        
        float f2= 2.9999996f;
        System.out.println(f2);
        
        float f3= 1.346f;
        System.out.println(f3);
        
        
     //2.DOUBLE DATA TYPE: double
        //double--> 8bytes--> 8*8=64bits
        //size: 8bytes--> 8*8=64bits
        //range: 4.94065645841246544e-324 to 1.7976931348623157e308
        
        System.out.println("This is double data type");
        
      //Example:
        
        double d1= 3.5;
        System.out.println(d1);
        
        double d2= 18;
        System.out.println(d2);
       
        double d3= -5.2;
        System.out.println(d3);
       
       
     
	}

}

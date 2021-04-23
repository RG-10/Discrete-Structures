package pk.com.uog.DS_Assignment1;
import java.math.BigInteger;
import java.util.Scanner;

public class DS_Assignment1 {



	 public static void main(String[] args) {
		 
		 @SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		   
				//create 4 BigInteger objects   
		        BigInteger big1,big2,exp,result;  
		        // initialize all BigInteger objects  
		     
		        System.out.println("Please Enter Number:");
		        big1=sc.nextBigInteger();
		        
		        
		        System.out.println("Please Enter Exponent: ");
		        exp = sc.nextBigInteger();
		        
		        System.out.println("Please Enter Modulus: ");
		        big2 = sc.nextBigInteger();
		        
		        
		      //perform modPow operation on big1 using big2 and exp  
		        result=big1.modPow(exp,big2);  
		        String str=big1+"^"+exp+" mod "+big2+" is "+result;  
		        System.out.println("Result::");
		        System.out.println(str);  
		    }  
	   }

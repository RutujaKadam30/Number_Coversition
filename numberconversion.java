package jfd;
//Name : Rutuja Sanjay Kadam
//Topic : Number Converter 
//Enrollment Number : EBEON1222703299
import java.util.Scanner;

public class numberconversion {    
	static void decToOctal(int numd)   
	    {
	      // Creating an Integer array of
	        // array to store octal number
	        int[] octalNum = new int[100];  
	  // counter for octal number array
	        int i = 0;
	        while (numd != 0) {     
	 // Storing remainder in octal array
	            octalNum[i] = numd % 8;
	            numd = numd / 8;
	            i++;
	        }
	        for (int j = i - 1; j >= 0; j--)   
	            System.out.print(octalNum[j]);
	    }
  
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("   Welcome to Number Converter  ");
		while(true) {
		System.out.println("Enter Your Number Conversion Choice : \n 1. Decimal to Binary \n 2. Binary to Decimal \n 3.Decimal to Octal \n 4. Octal to Decimal \n 5.Binary to Octal \n 6.Octal to Binary \n 7.Exit");
		System.out.println("Enter Number from above Conversion Choice : ");
		int choice = sc.nextInt();
	     switch(choice) {    
		case 1:
			//convert number decimal to binary 
			System.out.println("****Decimal to Binary**** ");
			System.out.println("Enter Number to convert: ");
			int numb =  sc.nextInt();
			
			System.out.println("Binary number is : "+Integer.toBinaryString(numb));  
		    break;
		case 2 :
			System.out.println("**** Binary to Decimal **** ");
			System.out.println("Enter Number to convert: ");
			String Binum =  sc.next();
			
			 System.out.println("Decimal number : "+Integer.parseInt(Binum, 2));  
			 break;
		case 3 :
			System.out.println("**** Decimal to Octal **** ");
			System.out.println("Enter Number to convert");
			int numd = sc.nextInt();
			System.out.println("Octal number is  " );
			decToOctal(numd);
			//System.out.println("Octal Number : "+Integer.toOctalString(numd));
			break;
		case 4:
			System.out.println("**** Octal to Decimal **** ");
			System.out.println("Enter Number to convert: ");
			String octde =  sc.next();   
			System.out.println("Octal Number : "+Integer.parseInt(octde, 8));
			break;
			
		case 5:
			System.out.println("**** Binary to Octal **** ");
			System.out.println("Enter Number to convert: ");
			String Bioct =  sc.next();
		    System.out.println("Decimal number : "+Integer.parseInt(Bioct, 2)); 
			 break;
		case 6:
			System.out.println("**** Octal to Binary**** ");
			System.out.println("Enter Number to convert: ");
			int octbi =  sc.nextInt();
			
			System.out.println("Binary number is : "+Integer.toBinaryString(octbi));  
		    break;
		case 7:
			System.exit(0);
		default:
			System.out.println("Other conversion ");
			break;
		}
	System.out.println("\n ----- Thank You -----");
		}
	}

}

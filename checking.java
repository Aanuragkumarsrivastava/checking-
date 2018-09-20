//checking sum of first two entered number is same as third number
import java.util.Scanner;

public class Main //name of class
{
 
	 public static void main(String[] args) 
	{  
  
		Scanner input = new Scanner(System.in);
  
		System.out.println("enter first number"); 
			int a = input.nextInt(); 
//taking the first number
   
		System.out.println("enter the second number");
 
			int b= input.nextInt();
  //taking the second number
 
		System.out.println("enter the third number");
  
			int c = input.nextInt();
  //taking the third number
			int d= a+b;
   // adding first and second number
		if(c==d)
  //checking the sum is equal to third number
			System.out.println("sum of "+a+" and "+b+" is same as third number "+c);
  //printing the output if sum is equal to third number
		else
  
			System.out.println("not equal");  //printing the output if sum is not equal to third number
 
	  
}

}

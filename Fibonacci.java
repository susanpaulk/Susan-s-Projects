

//Challenge 1 -Displaying nth number of Fibonacci Series for given n
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		//Getting input from user
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter any number for displaying nth number of Fibonacci Series for given n : ");
		int n = scan.nextInt();

      
        
	int	firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");
	    //solution to find nth term of a fibonacci series

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");
	      if(i==n)
	      { System.out.println("\n"+firstTerm + " is the "+n+" th number in the Fibonacci Series");}
	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;
	     
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
// Program to verify a given input number F is either fibonacci number or not and 
//also printing the closest index n in the fibonacci sequence.
	    
	   
		 System.out.print("Enter any number F for validating Fibonocci number : ");
		int f = scan.nextInt();
		
		scan.close();
      int firstEntry = 0, secondEntry = 1; int count=0;
      
      System.out.println("Fibonacci Series Upto " + f + ": ");
      
     while (firstEntry <= f) {
    	 System.out.print(firstEntry + ", ");
    	   ++count;
    	   if(firstEntry==f)
    	     	{System.out.println("\n"+f+" is  a fibonacci number");
    	   break;}
    	  
    	   
        int nextEntry = firstEntry + secondEntry;
        firstEntry = secondEntry;
        secondEntry = nextEntry;
        
     }
     
   
     if (firstEntry!=f)
    	 
    
    	 System.out.println("\n"+f+" is not a fibonacci number");
    
         System.out.println("\n"+"The closest index to the "+f+ " is "+count);
	    
	}

}

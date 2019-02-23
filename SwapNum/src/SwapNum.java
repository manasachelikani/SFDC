
import java.util.Scanner;
 
class SwapNum {
	
  public static void main(String args[])
  {
    int x, y;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two integers");
    
    x = sc.nextInt();
    y = sc.nextInt();
   
    System.out.println("Before Swap:");
    System.out.println("x value: "+x );
    System.out.println("x value: "+y );
    
    x=x+y;
    y=x-y;
    x=x-y;
    
    System.out.println("After Swap:");
    System.out.println("x value: "+x );
    System.out.println("x value: "+y );
    
  }
}
    
    
    
import java.util.Scanner;

/**
 * This class converts a Binary number to a Decimal number
 * 
 * @author Unknown
 *
 */
class BinaryToDecimal
{
	
	/**
	 * Main Method
	 * 
	 * @param args Command line arguments
	 */
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,k,d,s=0,c=0;
    System.out.print("Binary number: ");
    n=sc.nextInt();
    k=n;		//temporary variable k
    while(k!=0)
    {
      d=k%10;		 		//singles out a number according to its position from right
      s+=d*(int)Math.pow(2,c++);        //adding weights according to its position
      k/=10;				//preparing the binary number for next iteration
    }
    System.out.println("Decimal equivalent:"+s);
    sc.close();
  }
}

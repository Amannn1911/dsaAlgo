package dsaAlgo;

public class PalindromeNumber{
	  public boolean isPalindrome(int x) {
			 if (x < 0) {
		        return false;
	      }
		
		   int rev = 0,rem;
		   int num = x;
			  while (x != 0) {
			   rem = x % 10;
			   rev = rev * 10 + rem;
			   x /= 10;
		 }     
		  return rev == num;
	  }
	  public static void main(String[] args) {
		  PalindromeNumber pn = new PalindromeNumber();
		  int x = 321;
		  boolean result = pn.isPalindrome(x);
	       System.out.println("Is " + x + " a palindrome? " + result);	
	  }
}
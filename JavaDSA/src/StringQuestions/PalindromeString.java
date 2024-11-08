package StringQuestions;

public class PalindromeString {
	
	/**
	 * 
	 * 
	 * Palindrome String program
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String str = "abcdefgfedcba";
		System.out.println(isPalindrome(str));

	}
	
	public static boolean isPalindrome(String str){
		
		int start =0;
		int end= str.length()-1;
		
		
		while(start<end){
			
			if(str.charAt(start)!= str.charAt(end)){
				
				return false;
				
			}
			
			start++;
			end--;
			
		}
		
		return true;
	}

}

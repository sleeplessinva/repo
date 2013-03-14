
public class TestNewChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewChar orig;
		orig = new NewChar("Asshole is here mother fucker!!!!");
		
		System.out.println("Character at index 3 is " + orig.charAt(3));
		
		System.out.println("The length of the string is " + orig.length());
		
		System.out.println("The charSequence/subsequence is " + orig.subSequence(2, 5));
		
		System.out.println("The string backwards is " + orig.toString());
		
		
	}
	

}

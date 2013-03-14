
public class NewChar implements java.lang.CharSequence {
	
	private String stringx;
	
	public NewChar(String x) {
		stringx = x;
	}
	
	public int length() {
		int x = stringx.length();
		return x;
	}
	
	public CharSequence subSequence(int begin, int end) {
		String temp;
		temp = stringx.substring(begin, end);
		return temp;
	}
	
	public char charAt(int index) {
		return stringx.charAt(index);
	}
	
	
	
	public String toString () {
		
		int length_of_orig = stringx.length();
		
		char[] reverse = new char[length_of_orig];
		
		length_of_orig--;
		
		
		for (int i=0; i < stringx.length(); i++) {
			reverse[i] = stringx.charAt(length_of_orig);
			length_of_orig--;
		}
		
		
		String backwards = new String(reverse);
		return backwards;
	}

}

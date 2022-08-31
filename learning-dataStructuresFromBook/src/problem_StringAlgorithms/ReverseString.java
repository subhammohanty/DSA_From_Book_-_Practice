package problem_StringAlgorithms;

public class ReverseString {
	
	public static void main(String[] args) {
		System.out.println(stringReverse("Subham"));
	}
	
	public static String stringReverse(String str) {
		if(str == null || str.length() == 0) {
			return null;
		}
		StringBuffer sb = new StringBuffer();
		for(int i = str.length()-1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

}

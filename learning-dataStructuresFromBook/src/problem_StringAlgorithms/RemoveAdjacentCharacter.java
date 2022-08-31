package problem_StringAlgorithms;

public class RemoveAdjacentCharacter {
	
	public static void main(String[] args) {
		char[] str = {'A','B','C','C','B','C','B','A'};
		char[] res = removeAdjacent(str);

		for(char ch : res) {
			System.out.println(ch);
		}
	}
	
	public static char[] removeAdjacent(char[] str) {
		if(str == null || str.length == 0) {
			return null;
		}
		int j = 0;
		for(int i = 1; i <= str.length-1; i++) {
			while((str[i] == str[j]) && (j >= 0)) {
				i++;
				j--;
			}
			str[++j] = str[i];
		}
		return str;
	}

}

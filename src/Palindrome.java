
public abstract class Palindrome {
	public static void main(String[] args) {
		String st="that";
		char [] words= new char[st.length()];
		words=st.toCharArray();
		System.out.print(words);
		System.out.print("\n");
	Boolean ans=	palindromemethod(words);
		System.out.println(ans);
	}

	public static boolean palindromemethod(char [] str) {
		int start=0;
		int end=str.length-1;
		while(start<end) {
			
		if(str[start]!=str[end]) {
			return false;
		}
		
				start++;
				end--;
			
					}
		return true;
	}
}

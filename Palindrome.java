package Assignment.week2;

public class Palindrome {
	public static void main(String[] args) {
		String value = "madam";
		String rev = "";
		System.out.println(value.length());
		char[] value1 = value.toCharArray();
		
		for(int i =0; i<value.length();i++) {
			rev=rev+value1[i];
			
		}System.out.println(rev);
		if(rev.equals(value)) {
			System.out.println("The word is Palindrome");
		}
		else {
			System.out.println("The word is not a Palindrome");
		}
	}


}

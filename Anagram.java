package Assignment.week2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if(text1.length()==text2.length())
		{
			System.out.println("The lenght of the string is same");
		}
		char[] charts1 = text1.toCharArray();
		char[] charts2 = text2.toCharArray();
		Arrays.sort(charts1);
		Arrays.sort(charts2);
		boolean result = Arrays.equals(charts1, charts2);
		if(result) {
			System.out.println("The string "+text1+" "+text2+" are Anagram");
			
		}
		else
			System.out.println("The string "+text1+" "+text2+" are not Anagram");
		
		
	}

}

package Assignment.week2;


public class CharOccurance {
	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count =0;
		char pick = 'e';
		char[] ch = str.toCharArray();
		System.out.println(ch.length);
		for(int i=0; i<ch.length; i++) {
			if(ch[i]==pick) {
				count++;
			}
		}
		System.out.println("No of times "+pick+" is "+count);
	
	
}
	
	

	
}


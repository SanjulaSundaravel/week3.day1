package Assignment.week2;

public class ReversEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		
		String[] word = test.split(" ");
		for(int i=0; i<word.length; i++) {
			if(i%2==1) {
				char[] chArray = word[i].toCharArray();
			    for (int j = chArray.length-1; j >= 0; j--) {
			    	System.out.print(chArray[j]);
				}
			    System.out.print(" ");
				
			}else
			{
				System.out.print(word[i]+" ");
			}
		}
	}
}



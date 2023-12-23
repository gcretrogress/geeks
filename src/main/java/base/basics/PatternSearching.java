package base.basics;

public class PatternSearching {

	public static void main (String [] args) {
		StringBuilder str = new StringBuilder("geeksforgeeks"); 
		StringBuilder str2 = new StringBuilder("geeks");
		int firstOccurrence = str.indexOf(str2.toString());
		
		if (firstOccurrence<0) {
			System.out.println("No occurrence");
		} else {
			System.out.print(firstOccurrence+" ");
		}
		
		int index = firstOccurrence;
		while (index<str.length()) {
			int nextOccurrence = str.indexOf(str2.toString(), index+1);
			if (nextOccurrence<0) {
				break;
			} else {
				index = nextOccurrence;
				System.out.print(nextOccurrence+" ");
			}
		}
		
		printDecimal("12.3485995");
		printDecimal("13");
	}
	
	public static void printDecimal(String str) {
		// Given a decimal number print values after .
		// 12.3466 should return 3466
		int index = str.indexOf('.');
		if(index<0) {
			System.out.println("");
			return;
		}
		System.out.println(str.substring(index+1, str.length()));
	}

}

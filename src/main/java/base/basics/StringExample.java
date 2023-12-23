package base.basics;

public class StringExample {

	public static void main (String [] args) {
		String str = new String("geeks"); //0=g, 1=e, 2=e, 3=k, 4=s
		
		System.out.println(str.substring(2));    // eks
		System.out.println(str.substring(2, 5)); // eks
		System.out.println(str.substring(2, 4)); // ek
		//System.out.println(str.substring(2, 6)); // runtime error index out of bound error
		printStr(str.replace('e', 'l'));
		printStr(str.replaceAll("e", "l"));
		printStr((new StringBuilder(str)).insert(2, "blah").toString());
		printStr((new StringBuilder(str)).reverse().toString());
		printStr((new StringBuilder(str)).replace(2,3,"blah").toString());
	}
	
	public static void printStr(String str) {
		System.out.println(str);
	}
}

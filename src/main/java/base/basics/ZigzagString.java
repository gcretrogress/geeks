package base.basics;

public class ZigzagString {

	public static void main(String [] args) {
		System.out.println(zigzag("PAYPALISHIRING", 4));
	}

	// PAYPALISHIRING
	//
	/*
	 * P		A		H		N
	 * A	P	L	S	I	I	G
	 * 		Y	I	R
	 */

	// string, 4 rows
	// str[0] = P    I      N
	// str[1] = A  L S    I G
	// str[2] = Y A  H  R
	// str[3] = P	 I
	// StringBuilder append is constant time, whereas list is linear time
	// complexity
	public static String zigzag(String name, int rows) {

		StringBuilder[] sbs = new StringBuilder[rows];
		for(int i=0;i<rows;i++) {
			sbs[i] = new StringBuilder();
		}

		// Define variables
		char[] arr = name.toCharArray();
		int n = arr.length;
		int index = 0;

		while(index<n) {
			// Go down
			for (int j =0;j<rows && index < n;j++) {
				sbs[j].append(arr[index++]);
			}

			// Go up
			for (int j=rows-2;j>0 && index<n;j--) {
				sbs[j].append(arr[index++]);
			}
		}
		
		StringBuilder res = sbs[0];
		for (int i=1;i<rows;i++) {
			res.append(sbs[i].toString());
		}
		
		return res.toString();
	}

}

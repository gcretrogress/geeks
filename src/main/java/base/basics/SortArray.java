package base.basics;

import java.util.Arrays;

public class SortArray {
	
	static class Point {
		int x, y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public String toString() {
			return " " + this.x + " " + this.y;
		}
	}
	
	public static void main(String [] arg) {
		Point[] arr = {new Point(10,20),
				       new Point(5, 30),
				       new Point(30,50)
					};
		
		Arrays.sort(arr, (p1,p2)->p1.x -p2.x);
		
		for(Point p: arr) {
			System.out.println(p);
		}
		
	}
	
	// All about finding the functional interfaces a.k.a predicates which
	// have implementation of test() function. We just need to provide the 
	// smart lambda expression.

}

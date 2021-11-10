package com.LineComputation.ext;

import java.util.Scanner;

public class LineCompareUc4 {
	static void gettingValue() {
		// the line 1 cordinates
		Scanner endPoint = new Scanner(System.in);
		System.out.println("Enter the FOUR endpoint of line1 : ");
		Integer x1 = endPoint.nextInt();
		Integer x2 = endPoint.nextInt();
		Integer y1 = endPoint.nextInt();
		Integer y2 = endPoint.nextInt();
		Integer total1 = ((x2 - x1) * 2 + (y2 - y1) * 2);
		Integer Equation1 = (int) Math.floor(Math.sqrt(total1)); // .sqrt((x2-x1)*2); //+(y2-y1)*2);
		
		// the line 2 cordinates
		Scanner endPoint1 = new Scanner(System.in);
		System.out.println("Enter the FOUR endpoint of line2 : ");
		Integer p1 = endPoint1.nextInt();
		Integer p2 = endPoint1.nextInt();
		Integer q1 = endPoint1.nextInt();
		Integer q2 = endPoint1.nextInt();
		Integer total2 = ((p2 - p1) * 2 + (q2 - q1) * 2);
		Integer Equation2 = (int) Math.floor(Math.sqrt(total2));
		
		// compareTo method
		Integer line1 = new Integer(Equation1);
		Integer line2 = new Integer(Equation2);
		if (line1.compareTo(line2) == 0) {
			System.out.println("the both line are equal");
		} else if (line1.compareTo(line2) == 1) {
			System.out.println("line1 is greaterthan line2 ");
		} else {
			System.out.println("line1 is lessthan line2");
		}
		
		// equals method
		boolean Result = Equation1.equals(Equation2);
		if (Result) {
			System.out.println("the both line are equal");
		} else {
			System.out.println("the both line are different2");
		}
		endPoint.close();
	}

	public static void main(String[] args) {
		gettingValue();

	}

}

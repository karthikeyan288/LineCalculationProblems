package com.LineComputation.ext;

import java.util.Scanner;
//calculate the length of the line
public class LineCompareUc1 {
	public static void main(String[] args) {
		//line cordinates 
		Scanner endPoint=new Scanner(System.in);
		System.out.println("Enter the endpoint of line : ");
		int x1 = endPoint.nextInt();
		int x2 = endPoint.nextInt();
		int y1 = endPoint.nextInt();
		int y2 = endPoint.nextInt();
		int equation=((x2-x1)*2+(y2-y1)*2);
		if (equation>0) {
			double length=Math.sqrt(equation);
			System.out.println("The length of the line is : " +length);
		}else {
			System.out.println("The length of the line is in  negative value : ");
			
		}
		
		
	}

}

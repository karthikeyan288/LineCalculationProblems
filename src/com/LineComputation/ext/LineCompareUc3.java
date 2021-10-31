package com.LineComputation.ext;

import java.util.Scanner;

//checking the line is equal ,greater or equal
public class LineCompareUc3 {
	public static void main(String[] args) {
		//the line 1 cordinates
		Scanner endPoint=new Scanner(System.in);
		System.out.println("Enter the endpoint of line1 : ");
		int x1 = endPoint.nextInt();
		int x2 = endPoint.nextInt();
		int y1 = endPoint.nextInt();
		int y2 = endPoint.nextInt();
		double total1 =((x2-x1)*2+(y2-y1)*2);
		double Equation1=Math.floor(Math.sqrt(total1));   //.sqrt((x2-x1)*2);    //+(y2-y1)*2);
		//the line 2 cordinates
		Scanner endPoint1=new Scanner(System.in);
		System.out.println("Enter the endpoint of line2 : ");
		int p1 = endPoint1.nextInt();
		int p2 = endPoint1.nextInt();
		int q1 = endPoint1.nextInt();
		int q2 = endPoint1.nextInt();
		double total2 =((p2-p1)*2+(q2-q1)*2);
		double Equation2 =Math.floor(Math.sqrt(total2));
		
		if(Equation1==Equation2) {
			System.out.println("the both line are equal");
		}else if(Equation1>Equation2) {
			System.out.println("line1 is greaterthan line2 ");
		}else {
			System.out.println("line1 is lessthan line2");
		}
	}
}	
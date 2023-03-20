package Alphapattern;

public class Pattern {

	public static void main(String[] args) {
		Pattern pobj=new Pattern();
		//pobj.pattern1();
		pobj.pattern2();
		//pobj.pattern3();
		//pobj.righttriangle();
		//pobj.LeftDownTriangle();
		//pobj.rightdowntriangle();
		//pobj.hellowtriangle();

	}

	private void hellowtriangle() {
		for(int row=1;row<=5;row++) {
			for(int col=0;col<row;col++){
			{
				if(row!=5) {
					if(col==0||col==row-1) {
						System.out.print("*");
					}
					else {
						System.out.print("-");
					}
				}
				else
				{
					System.out.print("*");
				}
			}
			
	}
			System.out.println();}
	}
	private void rightdowntriangle() {
		for(int row=0;row<5;row++) {
			for(int col=1;col<=row;col++)
			{
				System.out.print(" ");
			}
			for(int col1=1;col1<=5-row;col1++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}

	private void LeftDownTriangle() {
		for(int row=0;row<5;row++) {
			for(int col=1;col<=5-row;col++)
			{
				System.out.print("*");
			}
		System.out.println();
	}
		}

	private void righttriangle() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++)
			{
				System.out.print(" ");
			}
			for(int col1=1;col1<=row;col1++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private void pattern3() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private void pattern2() {
		for(int row=0;row<5;row++) {
			for(int col=0;col<5;col++) {
				if(row==0||col==4||row==4||col==0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

	private void pattern1() {
		for(int row=0;row<5;row++) {
			for(int col=0;col<5;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

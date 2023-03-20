package Alphapattern;

public class Alphapets {

	public static void main(String[] args) {
		Alphapets aobj=new Alphapets();
		//aobj.Tmethod();
		//aobj.Imethod();
		//aobj.Zmethod();
	    //aobj.Emethod();
		//aobj.Fmethod();
		//aobj.Lmethod();
		//aobj.Pmethod();
		//aobj.Hmethod();
		//aobj.Jmethod();
		//aobj.Kmethod();
		//aobj.Bmethod();
		//aobj.Cmethod();
		//aobj.Dmethod();
		//aobj.Dmethod();
		//aobj.Amethod();
		//aobj.Gmethod();
		//aobj.Mmethod();
		//aobj.Nmethod();
		//aobj.Ymethod();
		//aobj.Xmethod();
		//aobj.Umethod();
		//aobj.Smethod();
		//aobj.Omethod();
		//aobj.Rmethod();
		//aobj.Vmethod();
		aobj.Wmethod();
	}

	
	private void Wmethod() {
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
		if(col==1||col==9) {
			System.out.print("*");
		}
		else if(col==row) {
			if(row>5)
				System.out.print("*"+" ");
			else
				System.out.print("  ");
		}
		else if(col+row==10) {
			if(row>4)
				System.out.print("*"+" ");
			else
				System.out.print("  ");
		}
		else
			System.out.print("  ");
	         }
			System.out.println();
		}}

	private void Vmethod() {
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
					if(col+row==8) {
						if(row<5)
						System.out.print(" "+"*");
					}
					if(row==col){
						if(row<=3) {
							System.out.print("*");
						}
					}
				    else
						System.out.print(" ");
			}
			System.out.println();
		}


		

	}


	private void Rmethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(col==0||row==0||row==4) {
					System.out.print("*");
				}
				else if(row==col){
					if(row>4)
					System.out.println("*");
				}
				else if(col==8) {
					if(row<4) {
						System.out.print(" "+"*");
					}
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}


	private void Omethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(col==0||row==0||row==8||col==8) {
					if(row+col==0||row+col==8||row+col==16) {
						System.out.print(" ");
					}
					else
					System.out.print("*");
				}
				
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		
	}


	private void Smethod() {
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
		if(row==1||row==5||row==9) {
			System.out.print("*");
		}
		else if(col==9) {
			if(row>4)
			System.out.print(" "+"*");
		     }
		else if(col==1) {
			if(row<5)
			System.out.print("*");
		}
		else
			System.out.print(" ");
		 
	}
			System.out.println();
		}
		}
	private void Umethod() {
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
		if(col==1||col==9) {
			if(row<9)
			System.out.print("*");
			else
				System.out.print(" ");
	        }
		else if(row==9) {
			System.out.print("*");
		}
			else
				System.out.print(" ");
		
		}
			System.out.println();
		}
			}
	private void Xmethod() {
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
					if(col+row==8) {
						System.out.print(" "+"*");
					}
					if(row==col){
						if(row<=7) {
							System.out.print("*");
						}
					}
						    else
						System.out.print(" ");
			}
			System.out.println();
		}


		
	}


	private void Ymethod() {
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
					if(col+row==8) {
						System.out.print(" "+"*");
					}
					if(row==col){
						if(row<=3) {
							System.out.print("*");
						}
					}
				    else
						System.out.print(" ");
			}
			System.out.println();
		}


		
	}


	private void Nmethod() {
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
					if(col==1) {
						System.out.print("*");
					}
					else if(col==row||col+row==10)
						if(row<=5) {
				System.out.print("*");
						}
				else
					System.out.print(" ");
					else
						System.out.print(" ");
			}
			System.out.println();
		}

		
	}


	private void Mmethod() {
		for(int row=1;row<=8;row++) {
			for(int col=1;col<=8;col++) {
					if(col==1||col==8) {
						System.out.print("*");
					}
					else if(col==row||col+row==8)
						if(row<=3) {
				System.out.print("*");
						}
				else
					System.out.print(" ");
					else
						System.out.print(" ");
			}
			System.out.println();
		}
	}


	private void Gmethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(row==4) {
	  			      if(col>5)
						System.out.print("*");
					}
				if(col==8) {
	  			      if(row>4&&row<=7)
						System.out.print(" "+"*");
					}
				
				if(row==0||col==0) {
				System.out.print("*");
				}
				else if(row==8) {
					if(col<5)
					System.out.print("*");
				}
				else if(col==4) {
					if(row>4)
					System.out.print("*");
				}
				else
					System.out.print(" ");	
			}
			System.out.println();
		}


	}


	private void Amethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(col==8||row==4||col==0||row==0) {
					if(row==0&&col==0||row==0&&col==8) 
						System.out.print(" ");
					else
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}


		
	}


	private void Dmethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(row==0||col==1||row==8||col==8) {
				System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}


	private void Cmethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(row==0||col==0||row==8) {
					if(row==0&&col==0||row==8&&col==0) {
						System.out.print(" ");
					}
				System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		
	}


	private void Bmethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(col==0||row==0||row==4||col==8||row==8) {
					if(row==0&&col==8||row==8&&col==8||row==4&&col==8) {
						System.out.print(" ");
					}
					else {
					System.out.print("*");
					}
				}
				else if(col==8) {
					if(row<5) {
						System.out.print("*");
					}
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

	private void Kmethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(col==0)
					System.out.print("*");
				else if(row+col==8) {
					if(row<4)
					System.out.print("*");
				}
				else if(row==col) {
					if(row>4) 
						System.out.print("*");	
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		
	}

	private void Jmethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(row==0||col==4)
					System.out.print("*");
				else if(row==8) {
					if(col<0&&col<2)
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

	private void Hmethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(col==8||row==4||col==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}


		
	}

	private void Pmethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(col==0||row==0||row==4) {
					System.out.print("*");
				}
				else if(col==8) {
					if(row<5) {
						System.out.print("*");
					}
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	private void Lmethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(col==0||row==8)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		
	}

	private void Fmethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(row==0||row==4||col==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		
	}

	private void Emethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(row==0||row==4||col==0||row==8)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		
	}

	private void Zmethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(row==0||row==8||row+col==8)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		
	}

	private void Imethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(row==0||col==4||row==8)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

	private void Tmethod() {
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(row==0||col==4)
				System.out.print("*"+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}

package com.codingz2m.control_flow.conditional;

public class SwitchTest {

	public static void main (String a[] ) {


		int x = 1;

		while (x < 5) { 
			
			switch(x)  {

			case  1:

				System.out.println("Value of x is " + x);
				break;
				// FALL - THROUGH, NO BREAK HERE
			case  2:

				System.out.println("Value of x is " + x);
				break;
			case  3:
				System.out.println("Value of x is " + x);


			break;

			case 4:
				System.out.println("Value of x is " + x);
			//	break;

			default:
				System.out.println("Value of x is " + x);

			}	

			x++;

		}


	}
}

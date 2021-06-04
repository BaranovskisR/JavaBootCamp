/**
 *
 */
package sef.module3.activity;

/**
 * @author
 *
 */
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int x = 1;
		int y = 25;
		while ( x < y) {
			System.out.println ( "The value of x is:=" + x++ );
//			System.out.println ( "The value of y is:=" + y++ );
		}


//
//
//		// Table from 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println("*** Table of "+i + " ***");
			for (int j = 1; j <= 10; j++) {
			System.out.println(i + "X" + j +" = " + i*j);
	}
		}

//		// Table from 11 to 20
        for (int i = 10; i <= 25; i++) {
            System.out.println("*** Table of "+i + " ***");
            for (int j = 10; j <= 25; j++) {
                System.out.println(i + "X" + j +" = " + i*j);
		}
		}


	}

}

package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

/*	
 	https://projecteuler.net/problem=230 
 	https://www.hackerrank.com/contests/projecteuler/challenges/euler230 
 */

public class FibonacciWords {
	
	public static char findFibWord(String a, String b, int iteration, BigInteger digitplace, int count) {
		if(iteration == count) {
			String newString = a+b;
			return newString.charAt(digitplace.bitCount()-1);
		}else {
			return findFibWord(b+a,a,iteration,digitplace, count);
		}			
	}
	
	public static char findFibWord(String a, String b, BigInteger bigInt) {
		return findFibWord(a+b,b, 5,bigInt,4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scanner = new Scanner(System.in);
		int numLine = scanner.nextInt();
		for(int i=0; i<=numLine;i++) {
			System.out.println(scanner.next());
		}
		scanner.close();
		*/
		BigInteger b = new BigInteger("104683731294243150");
		System.out.println(findFibWord("1415926535","8979323846", BigInteger.valueOf(35)));
		
		System.out.println(findFibWord("1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679",
				"8214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196", b));
		
		//1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679
		//8214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196
		//104683731294243150
		
	}

}

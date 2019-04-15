/*
 * Title: JFactorial
 * Description: Java Program to find Factorial of a Number
 * Author: Suryansh Singh - scribesme at gmail dot com
 * URL: https://www.github.com/elekktron/jfactorial
 * ----------------------------------------------------------------------------------
 * MIT License
 * 
 * Copyright (c) 2019 Suryansh Singh (scribesme at gmail dot com)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package jfactorial;

import java.math.BigInteger;
import java.util.Scanner;

public class JFactorial {
	public static BigInteger factorial(int n){
		BigInteger factorial = BigInteger.ONE;
		BigInteger fact = BigInteger.valueOf(n);
		
		if (n == 0)
			return factorial;
		else
			return fact.multiply(factorial(n-1));
	}
	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
		System.out.println("Enter the number to find the factorial of:");
		String newLine = System.getProperty("line.separator"); // For breaking the line
		int n = reader.nextInt();
		int x = n;
		BigInteger fact = BigInteger.valueOf(n);
		fact = factorial(n);
		if (n == 0) System.out.println("The value for the 0! is 1.");
		else {
			for ( int p = n; p > 0; ) {
				p = n - 1;
				n = n - 1;
			}
		System.out.println(newLine + "The value for the " + x + "!" + " is " + fact + ".");
		}
		}
	}
}

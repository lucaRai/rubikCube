package main;

import java.util.Arrays;

public class MyTest {

	private char[][] myVar = {{'1', '2'}, {'3', '4'}};
	public char[] getMyVar() {
		char[] tmp = {myVar[0][0], myVar[0][1]};
		return tmp;
	}
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = {'a', 'b'};
		char[] b = a;
		char[] c = {a[0], a[1]};
		
		
		System.out.println(Arrays.toString(a)+" | "+Arrays.toString(b)+" | "+Arrays.toString(c));
		
		a[1] = 'Z';
		System.out.println(Arrays.toString(a)+" | "+Arrays.toString(b)+" | "+Arrays.toString(c));		

	}
	*/

}

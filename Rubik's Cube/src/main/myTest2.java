package main;

import java.util.Arrays;

public class myTest2 {
	
	
	public static void main (String[] args) {
		MyTest myTest = new MyTest();
		char[] a = myTest.getMyVar();
		//char[] b = {myTest.getMyVar()[0], myTest.getMyVar()[1]};
		char[] b = myTest.getMyVar();
		System.out.println(Arrays.toString(a) + " | " + Arrays.toString(b) + " | " + Arrays.toString(myTest.getMyVar()));
		a[0] = 'Z';
		b[1] = 'A';
		System.out.println(Arrays.toString(a) + " | " + Arrays.toString(b) + " | " + Arrays.toString(myTest.getMyVar()));
	}
}

package com.jtc.p1;

import java.util.stream.Stream;

public class Prog24_FibonacciSeries {
	public static void main(String[] args) {
		
	Stream.iterate(new int[] {0,1}, f-> new int[] {f[1], f[0] + f[1]})
					.limit(10)
					.map(f->f[0])
					.forEach(i->System.out.print(i + " "));
	
	System.out.println("\n");
	//Another method
	System.out.println("Another method");
	        int[] fib = new int[10];
	        fib[0] = 0;
	        fib[1] = 1;

	        for (int i = 2; i < 10; i++) {
	            fib[i] = fib[i - 1] + fib[i - 2];
	        }

	        for (int i = 0; i < 10; i++) {
	            System.out.print(fib[i] + " ");
	        }
	    }
	
}

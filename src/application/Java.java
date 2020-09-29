package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);
		
		int prod = list.stream().reduce(1, (x, y) -> x * y);
		System.out.println("Prod = " + prod);
	}
}
package com.gradedproject.q3;

import java.util.Arrays;
import java.util.stream.Stream;

public class SquareAndAddOfOddNumbers {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = Arrays.stream(arr).filter(x -> x % 2 != 0).map(x -> x * x).sum();
		System.out.println(sum);
	}
}
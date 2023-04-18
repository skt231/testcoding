package test;

import java.util.Arrays;
import java.util.stream.Stream;

public class int_String_toArray { 

	public static void main(String[] args) {
		// String to array
		String str = "ABCDE";
		String[] arr = str.split("");

		System.out.println("arr size : " + arr.length);// arr size : 5
		System.out.println(Arrays.toString(arr));// [A, B, C, D, E]
		for (String s : arr) {
			System.out.print(s); // ABCDE
		}
		System.out.println();
		// int to Array
		// 1.
		int number = 12345;
		int[] num_arr = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
		System.out.println(Arrays.toString(num_arr));// [1, 2, 3, 4, 5]
		// 2.
//        int number = 12345;
//        String temp = Integer.toString(number);
//        int[] digits = new int[temp.length()];
//        for (int i = 0; i < temp.length(); i++)
//            digits[i] = temp.charAt(i) - '0';
	}

}

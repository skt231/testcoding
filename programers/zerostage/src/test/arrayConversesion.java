package test;

import java.util.Arrays;

public class arrayConversesion {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(solution(arr, 3)));

	}

	public static int[] solution(int[] arr, int k) {
		int[] answer = new int[arr.length];
		if (k % 2 == 1) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] *= k;
			}
		} else if (k % 2 == 0) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] += k;
			}
		}
		answer = arr;
		return answer;
	}
}

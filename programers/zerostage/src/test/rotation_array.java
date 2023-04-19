package test;

import java.util.Arrays;

public class rotation_array {
//정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		int[] numbers = { 4, 455, 6, 4, -1, 45, 6 };
		String direction = "left";
		System.out.println(Arrays.toString(solution(numbers, direction)));

	}

	public static int[] solution(int[] numbers, String direction) {
		int[] answer = new int[numbers.length];
		if (direction == "right") {
			int temp = numbers[numbers.length - 1];
			for (int i = numbers.length - 1; i >= 1; i--) {
				numbers[i] = numbers[i - 1];
			}
			numbers[0] = temp;

		} else if (direction == "left") {// {23456781}
			int temp = numbers[0];
			for (int i = 0; i < numbers.length - 2; i++) {
				numbers[i] = numbers[i + 1];
			}
			numbers[numbers.length - 1] = temp;
		}
		answer = numbers;
		return answer;
	}
}

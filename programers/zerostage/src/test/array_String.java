package test;

import java.util.Arrays;

public class array_String {
//문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("a1s2d3f4g6")));

	}

	public static int[] solution(String my_string) {
		my_string = my_string.replaceAll("[a-z]", "");// 문자열은 ""로 대체함

		String[] arr = my_string.split("");// arr배열에 my_string 문자열을 배열함
		int[] answer = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			answer[i] = Integer.parseInt(arr[i]);// int로 바꾼후 배열함
		}
		Arrays.sort(answer);// 오름차순으로 배열함
							// Arrays.sort(answer, Collections.reverseOrder());//내림차순

		return answer;
	}
}

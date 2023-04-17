package test;

import java.util.Arrays;

public class removeDuplicate_char {
//문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		String my_string = "abccdee";
		solution(my_string);

	}

	public static String solution(String my_string) {
		String answer = "";
		String[] arr_my_string = my_string.split("");
		System.out.println(Arrays.toString(arr_my_string));
		String[] arr_answer = new String[arr_my_string.length];
		for (int i = 0; i < arr_my_string.length; i++) {
			for (int j = 0; j < arr_my_string.length; j++) {
				if (i != j) {
					if (arr_my_string[i].equals(arr_my_string[j])) {
						arr_my_string[i] = " ";
					}
				}
			}
			answer += arr_my_string[i];
		}
		return answer;
	}

}

package test;

import java.util.ArrayList;
import java.util.List;

public class removeDuplicate_char { 
//문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		String my_string = "people";
		System.out.println(solution(my_string));

	}

	public static String solution(String my_string) {

		char[] ch = my_string.toCharArray();// String을 각 char로 변환
		List<String> arr = new ArrayList<String>();
		for (int i = 0; i < my_string.length(); i++) {
			if (!arr.contains(String.valueOf(my_string.charAt(i)))) { // valueOf(형변환)
				arr.add(String.valueOf(my_string.charAt(i))); // 빈 arr배열에 같은 값을 계속 넣음(같은 값이 있다면 패스)
			}
		}
		return String.join("", arr);//""안에 결합해서 호출

	}

}

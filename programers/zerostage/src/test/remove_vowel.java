package test;

public class remove_vowel {
	// 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 문자열 my_string이 매개변수로 주어질 때 모음을 제거한
	// 문자열을 return하도록 solution 함수를 완성해주세요(my_String은 소문자로 구성)
	public static void main(String[] args) {
		System.out.println(solution("teiout"));

	}

	public static String solution(String my_String) {
		String answer = "";
		String[] vowel = { "a", "e", "i", "o", "u" };
		String[] my_String_arr = my_String.split("");

		// String을 배열로 만들어서 모음인 경우 판별
		for (int i = 0; i < my_String_arr.length; i++) {
			for (int j = 0; j < vowel.length; j++) {
				if (my_String_arr[i].equals(vowel[j])) {// String을 배열로 만들어서 모음인 경우 판별
					my_String_arr[i] = "";// 모음인 인덱스 자리에 공백으로 만듬
				}
			}
			answer += my_String_arr[i];// answer에 배열을 String으로 바꾸기
		}

		return answer;
	}

}

package test;

public class overwrite_string {
	// 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
	// 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을
	// return 하는 solution 함수를 작성해 주세요.
	public static void main(String[] args) {
		System.out.println(solution("ABCDE", "UIUIUIU", 1));
	}

	public static String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
		for (int i = 0; i < s; i++) {
			answer += my_string.charAt(i);
		}
		for (int i = 0; i < overwrite_string.length(); i++) {
			answer += overwrite_string.charAt(i);
		}
		if (s + overwrite_string.length() <= my_string.length()) {
			for (int i = s + overwrite_string.length(); i < my_string.length(); i++) {
				answer += my_string.charAt(i);
			}
		}
		return answer;
	}
}

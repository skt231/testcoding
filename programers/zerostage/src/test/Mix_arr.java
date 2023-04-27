package test;
//길이가 같은 두 문자열 str1과 str2가 주어집니다.

//두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

public class Mix_arr {

	public static void main(String[] args) {
		String str1 = "aaaaa";
		String str2 = "bbbbb";
		System.out.println(solution(str1, str2));

	}

	public static String solution(String str1, String str2) {
		String answer = "";
		int k1 = 0;
		int k2 = 0;
		for (int i = 0; i < (str1.length() + str2.length()) / 2; i++) {

			answer += String.valueOf(str1.charAt(k1));
			k1++;

			answer += String.valueOf(str2.charAt(k2));
			k2++;
		}

		return answer;
	}

}

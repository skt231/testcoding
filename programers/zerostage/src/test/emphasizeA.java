package test;
//문자열 myString이 주어집니다. myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.

public class emphasizeA {

	public static void main(String[] args) {
		String myString = "PrOgRaMmErS";
		System.out.println(solution(myString));
	}

	public static String solution(String myString) {
		String answer = "";
		for (int i = 0; i < myString.length(); i++) {
			String stringChar = String.valueOf(myString.charAt(i));
			if (Character.isUpperCase(myString.charAt(i)) && (myString.charAt(i) != 'a' && myString.charAt(i) != 'A')) {
				answer += stringChar.toLowerCase();
			} else if (myString.charAt(i) == 'a') {
				stringChar=stringChar.replace("a", "A");
				answer +=stringChar;
			} else if (myString.charAt(i) == 'A') {
				stringChar=stringChar.replace("A", "a");
				answer +=stringChar;
			} else {
				answer += myString.charAt(i);
			}

		}

		return answer;
	}

}

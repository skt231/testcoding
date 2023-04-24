package test;

public class string_1 {

	public static void main(String[] args) {
		System.out.println(solution("abc", "aabcc"));

	}

	public static int solution(String str1, String str2) {

		return (int) (str2.contains(str1) ? 1 : 0);

	}

}

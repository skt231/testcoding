package test;

import java.util.Scanner;

//출력을 받아 소문자는 대문자로,,,대문자는 소문자로....
public class upper_lower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String answer = "";

		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (Character.isUpperCase(c)) {
				String str = String.valueOf(c);// char을 String으로 바꿀때는 Stirng.valueOf();
				answer += str.toLowerCase();
			} else if (Character.isLowerCase(c)) {
				String str = String.valueOf(c);
				answer += str.toUpperCase();
			}
		}
		System.out.print(answer);
	}
}

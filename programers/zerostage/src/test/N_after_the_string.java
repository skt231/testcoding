package test;

//문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
public class N_after_the_string {

	public static void main(String[] args) {
		System.out.print(solution("ProgrammerS123", 11));

	}

	public static String solution(String my_string, int n) {
		String answer = "";
		String[] my_string_arr = my_string.split("");
		String[] answer_arr = new String[my_string_arr.length - n];
		int k = 0;
		for (int i = my_string_arr.length - n; i <= my_string_arr.length - 1; i++) {
			answer_arr[k] = my_string_arr[i];
			k++;
		}
		for (String i : answer_arr) {
			answer += i;
		}
		return answer;
	}

}

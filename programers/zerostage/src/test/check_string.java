package test;

public class check_string {

	public static void main(String[] args) {
		String my_string = "banana";
		String target = "ana";
		System.out.println(solution(my_string, target));
	}

	public static int solution(String my_string, String target) {
		int answer = 0;
		if (my_string.contains(target)) {
			answer = 1;
		} else {
			answer = 0;
		}
		return answer;
	}

}

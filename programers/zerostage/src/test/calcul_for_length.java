package test;

public class calcul_for_length {

	public static void main(String[] args) {
		int[] num_list = { 2, 3, 4, 5 };
		System.out.println(solution(num_list));

	}

	public static int solution(int[] num_list) {
		int answer = 0;
		int complex = 1;

		if (num_list.length >= 11) {
			for (int i : num_list) {
				answer += i;
			}
		} else {
			for (int i : num_list) {
				complex *= i;
			}
			answer = complex;
		}

		return answer;
	}

}

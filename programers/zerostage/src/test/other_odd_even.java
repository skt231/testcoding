package test;

public class other_odd_even {

	public static void main(String[] args) {
		System.out.println(solution(5));

	}

	public static int solution(int n) {
		int answer = 0;
		if (n % 2 == 1) {
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 1) {
					answer += i;
				}

			}
		} else if (n % 2 == 0) {
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0) {
					answer += Math.pow(i, 2);
				}
			}
		}

		return answer;
	}

}

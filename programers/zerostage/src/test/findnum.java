package test;

public class findnum {

	public static void main(String[] args) {
		int[] num_list = { 1, 2, 3, 4, 5, 6 };
		System.out.println(solution(num_list, 3));
	}

	public static int solution(int[] num_list, int n) {
		int answer = 0;
		for (int i : num_list) {
			if(i==n) {
				answer=1;
			}
		}
		return answer;
	}

}

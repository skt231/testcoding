package test;

import java.util.Arrays;

public class NtoArray {

	public static void main(String[] args) {
		int[] num_list = { 5, 2, 1, 7, 5 };
		System.out.println(Arrays.toString(solution(num_list, 2)));

	}

	public static int[] solution(int[] num_list, int n) {
		int[] answer = new int[num_list.length - (n - 1)];
		int k = 0;
		for (int i = n - 1; i < num_list.length; i++) {
			answer[k] = num_list[i];
			k++;
		}
		return answer;
	}

}

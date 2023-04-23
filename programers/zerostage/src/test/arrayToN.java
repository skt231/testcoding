package test;

import java.util.Arrays;

//정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
public class arrayToN {

	public static void main(String[] args) {
		int[] num_list = { 2, 1, 6 };
		System.out.println(Arrays.toString(solution(num_list, 1)));

	}

	public static int[] solution(int[] num_list, int n) {
		int[] answer = new int[n];
		for (int i = 0; i < n ; i++) {
			answer[i] = num_list[i];
		}
		return answer;
	}

}

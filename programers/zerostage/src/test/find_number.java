package test;

import java.util.stream.Stream;

//정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
public class find_number {

	public static void main(String[] args) {
		System.out.println(solution(33567, 3));
	}

	public static int solution(int num, int k) {
		int answer = -1;
		int[] num_arr = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
		for (int i = 0; i < num_arr.length; i++) {
			if (num_arr[i] == k) {
				answer = i + 1;
				break;
			}
		}

		return answer;
	}
}

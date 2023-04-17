package test;

import java.util.stream.Stream;

//머쓱이는 행운의 숫자 7을 가장 좋아합니다.
//정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
public class sevensNumber {

	public static void main(String[] args) {
		int[] array = { 10, 29 };
		solution(array);

	}

	public static void solution(int[] array) {
		int answer = 0;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			int[] num_arr = Stream.of(String.valueOf(array[i]).split("")).mapToInt(Integer::parseInt).toArray();
			for (int j = 0; j < num_arr.length; j++) {
				if (num_arr[j] == 7) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}

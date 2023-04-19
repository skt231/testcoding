package test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class countK {
//1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		System.out.println(solution(10, 50, 5));

	}

	public static int solution(int i, int j, int k) {
		int answer = 0;
		int count = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		// i부터 j까지 배열에 넣음
		for (int l = i; l <= j; l++) {
			arr.add(l);
		}
		//각배열을 다시 배열화 해서 count함
		for (int m = 0; m < arr.size(); m++) {
			int[] index_arr = Stream.of(String.valueOf(arr.get(m)).split("")).mapToInt(Integer::parseInt).toArray();

			for (int n = 0; n < index_arr.length; n++) {
				if (index_arr[n] == k) {
					count++;
				}
			}

		}

		return count;
	}

}

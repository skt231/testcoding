package test;

import java.util.Arrays;

//정수 배열 arr과 delete_list가 있습니다. 
//arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
public class delete_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 293, 1000, 395, 678, 94 };
		int[] delete_list = { 94, 777, 104, 1000, 1, 12 };
		System.out.println(Arrays.toString(solution(arr, delete_list)));

	}

	public static int[] solution(int[] arr, int[] delete_list) {

		String[] string_arr = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			string_arr[i] = String.valueOf(arr[i]);
		}
		for (String i : string_arr) {
			for (int j : delete_list) {
				if (i.equals(String.valueOf(j))) {
					System.out.println(i);
					i.replace(i, "");
					System.out.println(i);
				}
			}
		}
		System.out.println(Arrays.toString(string_arr));
		int[] answer = new int[string_arr.length];
		for (int i = 0; i < string_arr.length; i++) {
			answer[i] = Integer.parseInt(string_arr[i]);
		}
		return answer;
	}

}

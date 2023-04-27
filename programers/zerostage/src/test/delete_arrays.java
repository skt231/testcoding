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
		String[] string_delete_list = new String[delete_list.length];
		// arr 배열을 string으로 변환
		for (int i = 0; i < string_arr.length; i++) {
			string_arr[i] = String.valueOf(arr[i]);
		}
		// delete_list 배열을 string으로 변환
		for (int i = 0; i < delete_list.length; i++) {
			string_delete_list[i] = String.valueOf(delete_list[i]);
		}
		// string_arr안에 delete_list값에 속해있으면 공백으로 둠
		for (int i = 0; i < string_arr.length; i++) {
			for (int j = 0; j < delete_list.length; j++) {
				if (string_arr[i].equals(string_delete_list[j])) {
					string_arr[i] = "";
				}
			}
		}

		int nul = 0;
		// string_arr안에 null값 count
		for (int i = 0; i < string_arr.length; i++) {
			if (string_arr[i] == "") {
				nul++;
			}
		}
		int[] answer = new int[string_arr.length - nul];
		int k = 0;
		System.out.println(string_arr.length);
		System.out.println(Arrays.toString(string_arr));
		// answer배열안에 삽입
		for (int i = 0; i < string_arr.length; i++) {
			if (!string_arr[i].equals("")) {
				answer[k] = Integer.parseInt(string_arr[i]);
				System.out.println(i + "    " + string_arr[i]);
				k++;
				System.out.println(k);
			}

		}
		return answer;
	}
	// 2)
	/*
	 * ArrayList <Integer> delete = new ArrayList(); for (int i = 0; i <
	 * delete_list.length; i++) { delete.add(delete_list[i]); }
	 * 
	 * ArrayList <Integer> list = new ArrayList();
	 * 
	 * for (int i = 0; i < arr.length; i++) { if (!delete.contains(arr[i])) {
	 * list.add(arr[i]); } }
	 * 
	 * int[] answer = new int[list.size()];
	 * 
	 * for (int i = 0; i < list.size(); i++) { answer[i] = list.get(i); } return
	 * answer; }
	 */
}

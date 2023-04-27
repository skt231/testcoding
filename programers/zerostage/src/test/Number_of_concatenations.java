package test;

//정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 
//solution 함수를 완성해주세요.
public class Number_of_concatenations {

	public static void main(String[] args) {
		int[] num_list = {5, 7, 8, 3};
		System.out.println(solution(num_list));

	}

	public static int solution(int[] num_list) {
		int answer = 0;
		String str_even = "";
		String str_odd = "";
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				str_even += String.valueOf(num_list[i]);
				System.out.println("even" + str_even);
			} else if (num_list[i] % 2 == 1) {
				str_odd += String.valueOf(num_list[i]);
				System.out.println("odd" + str_odd);
			}
		}
		System.out.println("odd" + str_odd);
		System.out.println("even" + str_even);
		answer = Integer.parseInt(str_odd) + Integer.parseInt(str_even);

		return answer;
	}
}

package test;

//연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//12 ⊕ 3 = 123
//3 ⊕ 12 = 312
//양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
//단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
public class calculation_1 {

	public static void main(String[] args) {
		solution(1, 2);

	}

	public static int solution(int a, int b) {
		int answer = 0;
		String a_String = String.valueOf(a);
		String b_String = String.valueOf(b);

		String att_num = a_String + b_String;
		System.out.print(att_num);
		int att_num_int = Integer.parseInt(att_num);

		if (att_num_int >= 2 * a * b) {
			answer = att_num_int;
		} else if (att_num_int < 2 * a * b) {
			answer = 2 * a * b;
		}
		return answer;
	}
}
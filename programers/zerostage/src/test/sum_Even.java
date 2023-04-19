package test;

public class sum_Even {
//정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public static int solution(int n) {
	        int answer = 0;

	        for(int i=2; i<=n; i+=2){
	            answer+=i;
	        }

	        return answer;
	    }
}

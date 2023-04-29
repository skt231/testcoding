package test;
//문자열 배열 strArr가 주어집니다. 

import java.util.ArrayList;
import java.util.Arrays;

//배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 
//return 하는 solution 함수를 완성해 주세요.

public class remove_ad {

	public static void main(String[] args) {
		String[] strArr = {"there","adre","noaad","aad","dsad" };
		System.out.println(Arrays.toString(solution(strArr)));

	}

	public static String[] solution(String[] strArr) {
		 ArrayList<String> arrayList = new ArrayList<>();

	        for (String str : strArr)
	            if (!str.contains("ad"))
	                arrayList.add(str);

	        int idx = 0;
	        String[] answer = new String[arrayList.size()];
	        for (String str : arrayList)
	            answer[idx++] = str;
	        return answer;
	}

}

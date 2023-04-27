package test;

public class dd {

	public static void main(String[] args) {
		String binomial = "43 + 12";
		String[] arr = binomial.split("");
		for (String i : arr) {
			String str = "01-abc123-한글1234";
			String restr = str.replaceAll("[^0-9]", "");
			System.out.println(str + " ==> " + restr);

		}
	}

}

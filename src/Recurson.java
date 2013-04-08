public class Recurson {
	public static void main(String[] args) {

		String str = "q9w5e2rt5y4qw2Er3T";
		printCountSchar(str);
	}

	public static void printCountSchar(String str) {
		if (str.length() > 0){
			if (isNumber(str.charAt(0))) {
				for (int j = 1; j < (str.charAt(0))-48; j++) {
					System.out.print(str.charAt(1));
				}
			} else {
				System.out.print(str.charAt(0));
			}
			printCountSchar(str.substring(1));
		} 
	}

	public static boolean isNumber(char c) {
		return Character.isDigit(c);
	}
}

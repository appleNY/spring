public class Sum {

	public static void main(String[] args) throws Exception {
		
		int 결과 = 0;
		for(int number = 1; number <= 100; number++) {
			결과 = 결과 + number;
		}
		System.out.println("1부터 100까지 for문으로 더하기: " + 결과);
	
		int 두번째_결과 = sum(0, 1, 100);
		System.out.println("1부터 100까지 재귀호출로 더하기: " + 두번째_결과);
	}
	
	private static int sum(int number, int min, int max) {
		if(min == max) {
			return number + max;
		}
		
		return sum(number + min, min + 1, max);
	}

}

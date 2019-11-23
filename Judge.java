public class Judge {
	//sees if the everyone trusts the same person
	public int findJudge(int n, int[][] trust) {
		int judge = trust[0][1];

		for(int i = 1; i < trust.length; i++) {
			if(trust[i][1] != judge) {
		 		return -1;
			}
		}
		return judge;
	}


	public static void main(String[] args) {
		Judge test = new Judge();
		int[][] wrong = {{0,3}, {1,2}, {2,2}};
		int[][] right = {{0,11}, {3, 11}, {10, 11}};
		//    0 1
		//0 : 0 3
		//1 : 0 2
		System.out.println(test.findJudge(3, wrong));
		System.out.println(test.findJudge(11, right));
		
		
	}
}
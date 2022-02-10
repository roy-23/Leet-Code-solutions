package co.roy;

public class Main {
	public static void main(String[] args) {
		int[][] accounts= {{1,2,3},
						   {3,21,1},
						   {12,4}};
		System.out.print(maximumWealth(accounts));
	}
	
	static int maximumWealth(int[][] accounts) {
        int wealth=0;
        int r=accounts.length;
        int max=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<accounts[i].length;j++) {
				wealth+=accounts[i][j];
			}
			if(wealth>max) {
				max=wealth;
			}
			wealth=0;
		}
		return max;
    }

}

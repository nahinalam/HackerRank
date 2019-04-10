package HackerRank;

public class CoinChange {
	static int getWays(int n,int[]c,int result) {
		int [] combination =new int [n+1];
		combination[0]=1;
		for(int coin:c) {
			for(int i=1;i<combination.length;i++) {
				if(i>=coin) {
					combination[i]=combination[i]+combination[i-coin];
				}
			}
		}
		return combination[n];
	}
	static int getWays(int n, int[] c) {
		return getWays(n,c,0);
    }
	public static void main(String[]args) {
		int[] arr = {1,2,3};
		System.out.println(getWays(4,arr));
	}

}

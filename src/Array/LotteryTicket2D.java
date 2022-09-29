package Array;

public class LotteryTicket2D {

	public static void main(String[] args) {
		int[][] lotteryCard = { { 20, 15, 7 }, { 8, 7, 19 }, { 56, 34, 39 } };
		int[][] lotteryCard2 = new int[3][3];

		lotteryCard2[0][0] = 20;
		lotteryCard2[0][1] = 15;
		lotteryCard2[0][2] = 7;
		lotteryCard2[1][0] = 8;
		lotteryCard2[1][1] = 7;
		lotteryCard2[1][2] = 19;
		lotteryCard2[2][0] = 56;
		lotteryCard2[2][1] = 34;
		lotteryCard2[2][2] = 39;

		for (int i = 0; i < 3; i++) {
			System.out.println(lotteryCard[i][i]);
			System.out.println("--------------");

		}

		for (int i = 0; i < 3; i++) {
			for (int a = 0; a < 3; a++) {
				System.out.println(lotteryCard[a][a]);

			}
		}

	}

}

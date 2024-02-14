package hw2;

public class Homework_2 {
//	請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	public static void main(String[] args) {
		int a = 1, sum = 0;
		for (a = 2; a <= 1000; a += 2) {

			sum += a;

		}
		System.out.print(sum);
		System.out.print("\n");
//		請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int i, ans = 1;
		for (i = 2; i <= 10; i++) {

			ans *= i;

		}
		System.out.print(ans);
		System.out.print("\n");
//		請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int b = 2, j = 1;
		while (b <= 10) {
			j *= b;
			b++;

		}
		System.out.print(j);
		System.out.print("\n");
//		請設計一隻Java程式,輸出結果為以下:
//			1 4 9 16 25 36 49 64 81 100
		int c;
		for (c = 1; c <= 10; c++) {

			System.out.print((int) Math.pow(c, 2) + " ");

		}
		System.out.print("\n");
//		阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int n, h, sums, count = 0;
		for (n = 0; n <= 4; n++) {
			for (h = 0; h <= 9; h++) {
				if (n == 4) {
					continue;

				}

				if (h == 4) {
					continue;
				}
				count++;
				sums = 10 * n + h;
				if (sums != 0) {

					System.out.print(sums + " ");

				}

			}

		}
		System.out.print("\n");
		System.out.print("總共有" + (count - 1) + "個");
		System.out.print("\n");
//		請設計一隻Java程式,輸出結果為以下:
//			1 2 3 4 5 6 7 8 9 10
//			1 2 3 4 5 6 7 8 9
//			1 2 3 4 5 6 7 8
//			1 2 3 4 5 6 7
//			1 2 3 4 5 6
//			1 2 3 4 5
//			1 2 3 4
//			1 2 3
//			1 2
//			1

		int me, you = 1;
		for (me = 10; me >= 1; me--) {
			for (you = 1; you <= me; you++) {
				System.out.print(you);

			}
			System.out.print("\n");

		}
//		請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
		int g, t, k = 65;
		for (g = 1; g <= 6; g++) {

			for (t = 1; t <= g; t++) {

				System.out.print((char) k);
			}
			k++;
			System.out.print("\n");

		}
	}
}

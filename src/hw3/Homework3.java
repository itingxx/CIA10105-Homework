package hw3;

import java.util.Scanner;

//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形,如圖示結果:

//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息2，猜對則顯示正確訊息
//System.out.println(" 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息");
public class Homework3 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入三個數字");

		int[] p = new int[3];
		if (sc.hasNextInt()) {
			for (int i = 0; i < 3; i++) {
				p[i] = sc.nextInt();
			}
		} else {
			System.out.println("請輸入整數！");
			sc.next();

		}
		int a=p[0];
	    int b=p[1];
	    int c=p[2];

		if ((a + b) > c && (b + a) > c && (b + c) > a) {
		    
		    if (a == b && b == c) {
		        System.out.println("正三角形");
		    } else if (a == b || b == c || a == c) {
		        System.out.println("等腰三角形");
		    } else {
		        System.out.println("其他三角形");
		    }}
		else {
		    System.out.println("不是三角形");
		}
		sc.close();
//		int ans;
//		ans = (int) (Math.random() * 10);
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("開始猜數字吧(範圍=0~9)：");
//		for (int x = 0;;) {
//
//			if (sc.hasNextInt()) {
//				x = sc.nextInt();
//			} else {
//				System.out.println("請輸入整數！");
//				sc.next();
//				continue;
//			}
//			if (x == ans) {
//				System.out.println("答對了！答案就是" + ans);
//				break;
//			} else {
//				System.out.println("猜錯囉！");
//			}
//		}
//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:

//		System.out.println("數字");
//		Scanner sc = new Scanner(System.in);
//		a: for (int num = 0;;) {
//
//			if (sc.hasNextInt()) {
//				num = sc.nextInt();
//			} else {
//				System.out.println("請輸入0~9的整數！");
//				sc.next();
//				continue;
//
//			}
//
//			if(num > 0 && num < 10) {
//
//				int n, h, sums, count = 0;
//				for (n = 0; n <= 4; n++) {
//					for (h = 0; h <= 9; h++) {
//						if (n == num) {
//							continue;
//
//						}
//
//						if (h == num) {
//							continue;
//						}
//						count++;
//						sums = 10 * n + h;
//						if (sums != 0) {
//
//							System.out.print(sums + " ");
//
//						}
//
//					}
//
//				}
//				System.out.print("\n");
//				System.out.print("總共有" + (count - 1) + "個");
//				break;
//			} else {
//				System.out.println("請輸入0~9的整數！");
//				continue a;
//
//			}
//
//		}
	}
}

package hw4;

import java.util.Scanner;


public class HomeWork_4 {
//	阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//	表如下:
//
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共 3 人!」
	public static void main(String[] args) {
//		int count = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("輸入欲借的金額");
//		int money = sc.nextInt();
//		int[][] array = { { 2500, 800, 500, 1000, 1200 }, { 25, 32, 8, 19, 27 } };
//		for (int i = 0; i < 1; i++) {
//			System.out.print("員工編號:");
//			for (int j = 0; j < array[i].length; j++) {
//
//				if (array[i][j] >= money) {
//					count++;
//					System.out.print(array[i + 1][j] + " ");
//				}
//			}
//			System.out.print(" 共有" + count + "位");
//		}
//		班上有8位同學,他們進行了6次考試結果如下:請算出每位同學考最高分的次數
		
		
//	     int[][] scores = {
//	                {10, 37, 100, 77, 98, 90},
//	                {35, 75, 70, 95, 70, 80},
//	                {40, 77, 79, 70, 89, 100},
//	                {100, 89, 90, 89, 90, 75},
//	                {90, 64, 75, 60, 75, 50},
//	                {85, 75, 70, 75, 90, 20},
//	                {75, 70, 79, 85, 89, 99},
//	                {70, 95, 90, 89, 90, 75}
//	        };
//
//	        int[] arrnew = new int[8];
//	        int[] new = {0, 0, 0, 0, 0, 0, 0, 0};
//
//	        // Find the maximum value in each column
//	        for (int j = 0; j < 6; j++) {
//	            int max = 0;
//	            for (int i = 0; i < scores.length; i++) {
//	                if (scores[i][j] > max) {
//	                    max = scores[i][j];
//	                }
//	            }
//	            arrnew[j] = max;
//	        }
//
//	        
//	        for (int j = 0; j < 6; j++) {
//	            for (int i = 0; i < scores.length; i++) {
//	                if (scores[i][j] == arrnew[j]) {
//	                    new[i]++;
//	                }
//	            }
//	        }
//
//	        
//	        for (int k = 0; k < 8; k++) {
//	            System.out.println((k + 1) + "號: " + new[k] + " times");
//	        }
//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		 
		        Scanner sc = new Scanner(System.in);
		        
		        for (;;) {
		            System.out.println("輸入三個數字");

		            int[] mon1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		            int[] mon2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		            int year, month, day;

		            // 使用 hasNextInt() 進行輸入的整數判斷
		            if (sc.hasNextInt() && (year = sc.nextInt()) > 0) {
		                if (sc.hasNextInt() && (month = sc.nextInt()) > 0 && month <= 12) {
		                    if (sc.hasNextInt() && (day = sc.nextInt()) > 0) {
		                        // 進行月份和日期的合法性檢查
		                        if ((month == 2 && (day > 29 || day < 1)) || (day < 1 || day > mon1[month - 1])) {
		                            System.out.println("請輸入正確日期！");
		                            sc.next(); // 清除無效輸入
		                            continue;
		                        }

		                        // 計算是該年的第幾天
		                        int sum = 0;
		                        int[] selectedMonth = (year % 4 != 0) ? mon1 : mon2;

		                        for (int i = 0; i < month - 1; i++) {
		                            sum += selectedMonth[i];
		                        }

		                        System.out.println("輸入的日期為該年第" + (sum + day) + "天");
		                        break;
		                    }
		                }
		            }

		            System.out.println("請輸入正確日期！");
		            sc.next(); // 清除無效輸入
		        sc.close();}
		        
		    }
		}


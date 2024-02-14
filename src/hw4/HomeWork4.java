package hw4;

public class HomeWork4 {
//	有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示:陣列,length屬性)

	public static void main(String[] args) {
		int[] array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		double sum = 0;
		for (int i = 0; i < array.length; i++) {

			sum += array[i];

		}
		double avg = sum / array.length;
		for (int i = 0; i < array.length; i++) {

			if (array[i] > avg) {
				System.out.println(array[i]);
			}

		}
		System.out.println(avg);
		System.out.println("======================================");
		// • 請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
//	(提示:String方法,陣列)
		String s = "Hello World";
		for (int j = array.length; j >= 0; j--) {
			System.out.print(s.charAt(j));
		}
		System.out.println();
		System.out.println("====================================");
		//	• 有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)
		String[] string1 = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count=0;
		for (int i = 0; i < string1.length; i++) {
			for (int j = 0; j < string1[i].length(); j++) {
				if (string1[i].charAt(j) == 'a' || string1[i].charAt(j) == 'e' || string1[i].charAt(j) == 'i' || string1[i].charAt(j) == 'o' || string1[i].charAt(j) == 'u') {
					count++;
				}
			}
			

		}
		System.out.println(count);
			}

		
		
	}




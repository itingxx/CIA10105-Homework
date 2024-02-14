package hw;

public class Homework1 {
	public static void main(String args[]) {
		int a = 12;
		int b = 6;
		System.out.println(a + b);
		System.out.println(a * b);
		System.out.println("=====================");
		int dozen = 200 / 12;
		int remainder = 200 % 12;
		System.out.println("總共有" + dozen + "打");
		System.out.println("剩下" + remainder + "個");
		System.out.println("=====================");
		int hour = 24, min = 60, sec = 60;
		int num = 256559;
		int daysec = hour * min * sec, hrssec = min * sec;
		int hrsleft = num % daysec, minleft = hrsleft % hrssec, secleft = minleft % sec;

		System.out.println(
				"256559秒為" + (num / daysec) + "天" + (hrsleft / hrssec) + "小時" + (minleft / sec) + "分" + secleft + "秒");
		System.out.println("=====================");

		final double PI = 3.1415;
		int r = 5;
		System.out.println("圓面積=" + r * r * PI + "圓周長=" + 2 * r * PI);
		System.out.println("=====================");
		int pv = 1500000;
		double i = 2.0 / 100;
		int n = 10;
		double i2 = Math.pow((1 + i), n);
		System.out.println("本金加利息=" + i2 * pv);
		System.out.println("=====================");
		System.out.println(5 + 5);// 數字相加
		System.out.println(5 + '5');// 字元5在Unicode內十六進位換算成10進位後相加
		System.out.println(5 + "5");// 字串相加

	}

}

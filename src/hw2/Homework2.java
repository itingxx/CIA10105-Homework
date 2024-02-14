package hw2;

public class Homework2 {
	public static void main(String[] args) {
		int a, b = 1;
		for (a = 1; a <= 9; a++) {
			b = 1;
			while (b <= 9) {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;

			}
			System.out.print("\n");
		}
		System.out.print("\n");

		int c, d = 1;
		for (c = 1; c <= 9; c++) {
			d = 1;
			do {
				System.out.print(c + "*" + d + "=" + c * d + "\t");
				d++;

			} while (d <= 9);
			System.out.print("\n");
		}
		System.out.print("\n");
		int i = 0, j = 1;
		while (i < 9) {
			j = 1;
			i++;
			do {

				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;

			} while (j <= 9);
			System.out.print("\n");
		}
	}

}

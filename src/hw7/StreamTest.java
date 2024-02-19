package hw7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class StreamTest {
	public static void main(String args[]) {
//		請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//				append功能讓每次執行結果都能被保存起來)
		try {
			FileOutputStream fos = new FileOutputStream("Data.txt", true);

			BufferedOutputStream bos = new BufferedOutputStream(fos);

			PrintStream ps = new PrintStream(bos);
			int[] arr = new int[10];
			ps.print("產生10個亂數:");
			for (int i = 0; i < 10; i++) {
				arr[i] = (int) (Math.random() * 1000) + 1;
				
				ps.print(arr[i]+" ");
			}
			
			ps.println();
			ps.close();
			bos.close();
			fos.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}

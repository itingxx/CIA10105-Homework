package hw6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CalTest {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入x值");
			int x = sc.nextInt();
			System.out.println("請輸入y值");
			int y = sc.nextInt();
		
			Calculator c1 = new Calculator();
			
			c1.powerXY(x,y);
			sc.close();
		} catch (CalException ce) {
			ce.printStackTrace();
		}
		catch (InputMismatchException ce) {
			System.out.println("輸入格式錯誤");
		}
		
		
}}

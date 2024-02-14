package hw5;

//import java.util.Scanner;

public class HomeWork5 {
//    public static void starSquare(int width, int height) {
//        for (int i = 0; i < height; i++) {
//            System.out.println();
//            for (int j = 0; j < width; j++) {
//                System.out.print("*");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("輸入寬及高");
//
//        int width, height;
//
//        while (true) {
//            System.out.print("寬: ");
//            width = sc.nextInt();
//            System.out.print("高: ");
//            height = sc.nextInt();
//
//            if (width > 0 && height > 0) {
//                break;
//            } else {
//                System.out.println("請輸入正整數！");
//            }
//        }
//
//        starSquare(width, height);
//    }
//	請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
//	public  void randAvg(){
//		int[] array=new int[10];
//		int sum=0;
//		for(int i=0;i<10;i++) {
//		array[i] = (int) (Math.random() * 101);
//		System.out.print(array[i]+" ");
//		sum=sum+array[i];
//		}
//		System.out.println();
//		System.out.print("平均="+sum/10.0);
//		
//	}
//	public static void main(String[] args) {
//		HomeWork5 ans= new HomeWork5();
//	        ans.randAvg();
//	}
//	利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//	可以找出二維陣列的最大值並回傳,如圖:
//	public int maxElement(int x[][]) {
//		int max=x[0][0];
//		for(int i=0;i<x.length;i++) {
//			for(int j=0;j<x[i].length;j++) {
//							if (x[i][j]>max) {
//								max=x[i][j];
//								}
//			}
//							}
//		return max;
//		}
//	
//public double maxElement(double x[][]) {
//	double max=x[0][0];
//	for(int i=0;i<x.length;i++) {
//		for(int j=0;j<x[i].length;j++) {
//						if (x[i][j]>max) {
//							max=x[i][j];
//							}
//		}
//						}
//	return max;
//	}
//public static void main(String[] args) {
//	int[][] arr={{4,1,8},{9,3,10}};
//	double[][] arr2={{4.7,100.9,8.6},{9,3.3,10}};
//
//	HomeWork5 a= new HomeWork5();
//	System.out.println(a.maxElement(arr));
//	System.out.println(a.maxElement(arr2));
//}
	
//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合,如圖:
	public static String genAuthCode() {
		String words="";
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	  char[] password=new char[8];
	  for(int i=0;i<password.length;i++) {
		  password[i]=chars.charAt((int)(Math.random()*chars.length()));
	  }
	  for(int i=0;i<password.length;i++) {
		  
		  words +=password[i];
	  }
	  return words;
	}
	public static void main(String[] args) {
		
		System.out.println(genAuthCode());
	}}
package hw4;

public class MyRectangle {
//	請設計一個類別MyRectangle:
//		(1) 有兩個double型態的屬性為width, depth
//		(2) 有三個方法:
//
//		void setWidth(double width): 將收到的引數指定給width屬性
//		void setDepth(double depth): 將收到的引數指定給depth屬性
//		double getArea(): 能計算該長方形的面積
//
//		(3) 有兩個建構子:
//
//		public MyRectangle(): 不帶參數也無內容的建構子
//		public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性

		
		private double width, depth;
	void setWidth(double width) {
//		將收到的引數指定給width屬性
		this.width=width;
	}
	void setDepth(double depth) {
//		將收到的引數指定給depth屬性
		this.depth=depth;
	}
	double getArea() {
//		能計算該長方形的面積
		return(width*depth);
	}
	public MyRectangle() {};
	public MyRectangle(double width, double depth) {
		this.width=width;
		this.depth=depth;
		
	}
	}
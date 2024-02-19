package hw5;
//建立抽象父類別Pen
abstract class Pen {

//	• (1) 兩個屬性：品牌(brand)、價格(price) (封裝設計)
//	• (2) 建構子設計：一個無參數與一個根據屬性而設計
//	• (3) 定義Getter/Setter方法
//	• (4) 宣告一個抽象方法write()
//	• 建立兩個子類別Pencil與InkBrush繼承Pen父類別
//	• (1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
//	• (2) Pencil實際售價為定價8折，InkBrush為定價9折
//	• (3) 多型操作，當共同呼叫write()方法與getPrice()方法，各種筆都可正確顯示write內容與售價金額
	private String brand;
	    private double price;

	    public Pen() {
	    }

	    public Pen(String brand, double price) {
	        this.brand = brand;
	        this.price = price;
	    }
	    // Setter方法
	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }
	 // Getter方法
	    public double getPrice() {
	    	return price;
	    }
	    public String getBrand() {
	    	 return brand;
	    }

	    public abstract void write();
	}
//Pencil子類別
	class Pencil extends Pen {
	    public void write() {
	        System.out.println("削鉛筆在寫");
	    }

	    public Pencil() {
	    }

	    public Pencil(String brand, double price) {
	        super(brand, price*0.8);
	    }
	    public void setPrice(double price) {
	    	super.setPrice(price*0.8);
	    }
	    
	}
//InkBrush
	class InkBrush extends Pen {
	    public void write() {
	        System.out.println("為沾墨汁在寫");
	    }

	    public InkBrush() {
	    }

	    public InkBrush(String brand, double price) {
	        super(brand, price*0.9);
	    }
	    public void setPrice(double price) {
	    	super.setPrice(price*0.9);
	    }
	}
//main方法
	public	class Pen1{
	    public static void main(String args[]) {
	    	// 測試Pencil類別
	        Pencil pencil = new Pencil("F", 100.0);
	        pencil.write();
	        System.out.println("售價：" + pencil.getPrice());

	        // 測試InkBrush類別
	        InkBrush inkBrush = new InkBrush("P", 150.0);
	        inkBrush.write();
	        System.out.println("售價：" + inkBrush.getPrice());
	        
	    }
	}
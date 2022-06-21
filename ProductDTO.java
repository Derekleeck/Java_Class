package _class;

public class ProductDTO {
	private String item;
	private int price;
	private int qty;
	private int total;
	
	public void calc() {
		total = price * qty;
	}
	
	public void setItem(String i) {
		item = i;
	}
	public void setPrice(int p) {
		price = p;
	}
	public void setQty(int q) {
		qty = q;
	}
		
	public String getItem() {
		return item;
	}
	public int getPrice() {
		return price;
	}
	public int getQty() {
		return qty;
	}
	public int getTotal() {
		return total;
	}
}

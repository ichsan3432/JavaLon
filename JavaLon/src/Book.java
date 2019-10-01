
public class Book {

	private int page ;
	private int price;
	
	public Book (int page, int price) {
		this.page = page;
		this.price = price;
		
	}
	
	public void display() {
		System.out.println("Jumlah Halaman : "+ page);
		System.out.println("Harga : "+ price);
	}
}
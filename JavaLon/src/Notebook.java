
public class Notebook extends Book{
	
	private String contents;

	public Notebook(int page, int price) {
		super(page, price);
		contents = "";
	}
	public void write (String message) {
		contents += message;
	}
	
	public void display() {
		super.display();
		System.out.println ("pesan : "+ contents);
		
	}

}

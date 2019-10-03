import java.util.Scanner;

public class latihan13_2 {

	public static void main (String [] args) {
		Scanner input= new Scanner (System.in);
		
		System.out.print("Masukkan jumlah halaman buku >" );
		int JumlahHalaman = input.nextInt();
		System.out.print("Masukkan harga buku >");
		int HargaBuku = input.nextInt();
		System.out.print("Masukkan halaman notes > ");
		int HalamanNotes = input.nextInt();
		System.out.print("Masukkan Harga notes > ");
		int HargaNotes = input.nextInt();
		
		Book buku = new Book(JumlahHalaman, HargaBuku);
		Notebook notes = new Notebook(HalamanNotes, HargaNotes);
		
		System.out.println ("=================");
		System.out.println ("   MENU PILIHAN  ");
		System.out.println ("=================");
		System.out.print("1. Tampilkan Info Buku, 2.Tampilkan Info Notes, 3.Pesan yang ditambahkan, 4.Selesai");
		int n = input.nextInt();
		switch (n) {
		case 1:	
			buku.display();
			break;
		case 2:
			notes.display();
			break;
		case 3 :
			System.out.print ("Tambahkan pesan yang diinginkan > ");
			String message = input.next();
			notes.write(message);
			notes.display();
			break;
			default :
				System.out.println ("selesai");
		}
		System.out.println( "");
		System.out.println ("=================");
		System.out.println ("   MENU PILIHAN  ");
		System.out.println ("=================");
		System.out.print ("1. Tampilkan Info Buku, 2.Tampilkan Info Notes, 3.Pesan yang ditambahkan, 4.Selesai");
		n = input.nextInt();
	}
}

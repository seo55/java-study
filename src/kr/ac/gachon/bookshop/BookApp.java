package kr.ac.gachon.bookshop;

public class BookApp {
	private static int bookCount =0;
	
	public static int getBookCount() {
		return bookCount;
	}

	public static void setBookCount(int bookCount) {
		BookApp.bookCount = bookCount;
	}

	public void test () {
		
	}
	
	public static void main (String [] args) {
		Book b = new Book ();
		Book a = b;
		for (int i =0; i<10; i++) {
			
		}
			
		System.out.println(a);
	}
}

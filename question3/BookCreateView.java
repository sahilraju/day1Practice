package day1_practiceExercise.question3;

public class BookCreateView {

	static Book[] books;

	public static void createBooks(Book[] books1, int booksCount) {

		books = books1;

	}

	public static Book[] viewAllBooks() {

		return books;

	} 

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.setBookTitle("aladin");
		book1.setBookPrice(200.00);

		Book book2 = new Book();
		book2.setBookTitle("the jungle book");
		book2.setBookPrice(300.00);

		Book[] books = { book1, book2 };

		BookCreateView.createBooks(books, books.length);

		books = BookCreateView.viewAllBooks();

		for (Book book : books) {
			System.out.println("BOOK NAME: " + book.getBookTitle());
			System.out.println("BOOK PRICE: " + book.getBookPrice());
		}

	}

}

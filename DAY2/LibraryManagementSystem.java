class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public static void main(String[] args){
        
    }
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
        }
    }
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned the book: " + title);
        } else {
            System.out.println("This book was not borrowed.");
        }
    }
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
        System.out.println("-------------------------");
    }
    public String getTitle() {
        return title;
    }
}

class Library {
    private Book[] books;
    private int bookCount;
    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Book '" + book.getTitle() + "' added to the library.");
        } else {
            System.out.println("Library is full! Cannot add more books.");
        }
    }
    public int searchBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }
    public void borrowBook(String title) {
        int index = searchBookByTitle(title);
        if (index != -1) {
            books[index].borrowBook();
        } else {
            System.out.println("Book not found in the library.");
        }
    }
    public void returnBook(String title) {
        int index = searchBookByTitle(title);
        if (index != -1) {
            books[index].returnBook();
        } else {
            System.out.println("Book not found in the library.");
        }
    }
    public void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("No books available in the library.");
        } else {
            for (int i = 0; i < bookCount; i++) {
                books[i].displayDetails();
            }
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library(5);
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.displayAllBooks();
        library.borrowBook("1984");
        library.displayAllBooks();
        library.returnBook("1984");
        library.displayAllBooks();
    }
}

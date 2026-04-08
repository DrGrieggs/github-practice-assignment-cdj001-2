public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title;
        this.author;
        this.isbn;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    
    public String getIsbn() {
        return isbn;

    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void checkOut() {
        if (!isAvailable) {
            isAvailable = false;
            System.out.println("Book checked out " + title);
        } else {
            System.out.println("Book is already checked out ")
        }
    }
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book retunred: " + title);
        } else {
            System.out.println("Book was not checked out. ")
        }  
    }
    Public String toString() {
        return "Title: " + title + "\nAuthor: " + auhtor + "\nIsbn: " + isbn + "\nAvailable: " + (isAvailable ? "Yes" : "No");
    }
}
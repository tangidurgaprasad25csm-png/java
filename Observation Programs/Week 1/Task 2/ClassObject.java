 class Book {
    int bookId;
    String bookName;
    String author;
    double price;

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class ClassObject {
    public static void main(String[] args) {

        Book b = new Book();

        b.bookId = 101;
        b.bookName = "Java Programming";
        b.author = "James Gosling";
        b.price = 450.50;

        b.display();
    }
}


 

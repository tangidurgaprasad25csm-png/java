class Book{
    private int bookId;
    private String bookname;
    private String author;
    private double price;
    Book(){
        bookId=0;
        bookname=" ";
        author=" ";
        price=0.0;
    }
    Book(int bookId,String bookname,String author,double bookprice){
        this.bookId=bookId;
        this.bookname=bookname;
        this.author=author;
        this.price=bookprice;
    }
    void setbookId(int bookId){
        this.bookId=bookId;
    }
    int getbookId(){
        return bookId;
    }
    void setbookname(String bookname){
        this.bookname=bookname;
    }
    String getbookname(){
        return bookname;
    }
    void setauthor(String author){
        this.author=author;
    }
    String getauthor(){
        return author;
    }
    void setprice(double bookprice){
        this.price=bookprice;
    }
    double getprice(){
        return  price;
    }
    void display(){
    System.out.println("bookId: "+getbookId());
    System.out.println("bookname: "+getbookname());
    System.out.println("author: "+getauthor());
    System.out.println("bookprice: "+getprice());
    }
}
public class ConstructorEncapsulation {
    public static void main(String[] args){
        Book b1=new Book();
        b1.setbookId(105);
        b1.setbookname("javaprogramming");
        b1.setauthor("James Gosling");
        b1.setprice(550.80);
        b1.display();
        System.out.println();
        Book b2=new Book(202,"pythonprogramming","Guido van Rossum",480.50);
        b2.display();
    }
}
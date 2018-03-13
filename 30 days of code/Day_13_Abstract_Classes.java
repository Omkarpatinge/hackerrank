import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book{
    int price;
    MyBook(String title,String author,int price){
        super(title,author);
        this.price=price;
    }
    void display(){
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nPrice: "+price);
    }
    
}
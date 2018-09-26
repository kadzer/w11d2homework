import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

    public Library(ArrayList<Book> stock, int capacity) {
        this.stock = stock;
        this.capacity = capacity;
    }

    public int countBooks() {
        return this.stock.size();
    }

    public boolean isFull(){
        return countBooks() == this.capacity;
    }

    public void addBook(Book book) {
        if (!isFull()) {
            this.stock.add(book);
        } else {
            System.err.println("Cannot add a book, library is full");
        }
    }


}

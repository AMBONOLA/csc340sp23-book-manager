package com.csc340sp23.bookmanager;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author andy 
 */

@Service
public class BookService {
    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public List<Book> getAllBooks() {
        return  repo.findAll();
    }
    public Book getBook(long bookId){
        return repo.getReferenceById(bookId);
    }
    public void deleteBook(long bookId){
        repo.deleteById(bookId);
    }
    void saveBook(Book book){
        repo.save(book);
    }
}

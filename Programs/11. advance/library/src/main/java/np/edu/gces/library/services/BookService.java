package np.edu.gces.library.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import np.edu.gces.library.entities.Book;
import np.edu.gces.library.repos.BookRepo;

import java.util.List;

@Service
public class BookService {


    @Autowired
    BookRepo bookRepo;


    public Book saveBook() {
        Book b = new Book(1,"Dilip Shrestha", 100, null);
        bookRepo.save(b);
        return b;
    }


    public List<Book> getBook() {
        List<Book> a = bookRepo.findAll();
        return a;
    }
    
}

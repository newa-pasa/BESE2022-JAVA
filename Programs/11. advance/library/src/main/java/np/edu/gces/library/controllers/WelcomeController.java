package np.edu.gces.library.controllers;

import java.sql.Date;

import org.apache.catalina.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import np.edu.gces.library.entities.Book;
import np.edu.gces.library.entities.MyConfig;
import np.edu.gces.library.services.BookService;

import java.util.List;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @Autowired
    MyConfig config;


    @Autowired
    BookService bookService;

    @GetMapping("/hello")
    public String sayHelloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello1")
    public String sayHelloWorld1() {
        return "Hello World !!!!";
    }

    @GetMapping("/getBooks")
    public List<Book> getBook() {
        // function of controller is to call service 
        List<Book> b = bookService.getBook();
        return b;
    }

}

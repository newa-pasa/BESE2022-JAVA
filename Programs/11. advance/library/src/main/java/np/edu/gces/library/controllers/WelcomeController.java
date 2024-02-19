package np.edu.gces.library.controllers;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import np.edu.gces.library.entities.Book;
import np.edu.gces.library.entities.MyConfig;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @Autowired
    MyConfig config;

    @GetMapping("/hello")
    public String sayHelloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello1")
    public String sayHelloWorld1() {
        return "Hello World !!!!";
    }

    @GetMapping("/getBooks")
    public Book getBook() {
        System.out.println(config.getTheme());
        Book b = new Book(1,"Dilip Shrestha", 100, null,"col1");
        return b;
    }

}

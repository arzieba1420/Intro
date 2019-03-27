package pl.edu.wszib.arzieba.Intro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wszib.arzieba.Intro.dao.BookDao;

@Controller

public class BookController {

    @Autowired
    private BookDao bookDao;

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books",bookDao.findAll());
        return "books";
    }
}

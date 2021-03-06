package pl.edu.wszib.arzieba.Intro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.wszib.arzieba.Intro.dao.BookDao;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookDao bookDao;

    @GetMapping
    public String getBooks(Model model){

        model.addAttribute("haha",bookDao.findAll());
        return "books";
    }
}

package pl.edu.wszib.arzieba.Intro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wszib.arzieba.Intro.dao.AuthorDao;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorDao authorDao;

    @GetMapping
    public String getAuthors(Model model){
        model.addAttribute("allAuthors", authorDao.findAll());
        return "authors";
    }

}

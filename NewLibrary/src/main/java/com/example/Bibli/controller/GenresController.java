package com.example.Bibli.controller;

import com.example.Bibli.service.BooksService;
import com.example.Bibli.service.GenresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/genres")
public class GenresController {

    @Autowired
    GenresService genresService;

    @Autowired
    BooksService booksService;

    @GetMapping("all")
    public String books(Model model) {
        model.addAttribute("genres", genresService.getAllBooks());
        return "genres";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        model.addAttribute("genres", genresService.findOne(id));
//        model.addAttribute("books", booksService.)
        return "showGenres";
    }

}

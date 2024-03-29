package com.example.Bibli.controller;

import com.example.Bibli.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@Controller
@RequestMapping(value = "/books")
public class BooksController {

    @Autowired
    BooksService booksService;

    @GetMapping("")
    public String books(Model model) {
        model.addAttribute("books", booksService.getAllBooks());
        return "books";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        model.addAttribute("books", booksService.findOne(id));
        return "showBooks";
    }

    @GetMapping("admin-books")
    public String adminBooks(Model model) {
        model.addAttribute("books", booksService.getAllBooks());
        return "adminBooks";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") Long id) {
        model.addAttribute("book", booksService.findOne(id));
        return "editBooks";
    }
}

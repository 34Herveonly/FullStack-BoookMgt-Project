package com.BookStore.BookMgt_FullStack.Controller;

import com.BookStore.BookMgt_FullStack.Entity.Books;
import com.BookStore.BookMgt_FullStack.Entity.MyBookList;
import com.BookStore.BookMgt_FullStack.Service.BookService;
import com.BookStore.BookMgt_FullStack.Service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private MyBookListService myBookListService;

    @GetMapping("/")
    public String home() {
        return "Home";
    }

    @GetMapping("/book_register")
    public String bookRegister() {
        return "BookRegister";
    }

    @GetMapping("/Available_books")
    public ModelAndView availableBooks() {
        List<Books> list = bookService.getAllBooks();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("AvailableBooks");
        modelAndView.addObject("books", list);
        return modelAndView;
    }

    @PostMapping("/save")
    public String addBooks(@ModelAttribute Books book) {
        bookService.save(book);
        return "redirect:/Available_books";
    }

    @GetMapping("/my_books")
    public String displayMyBooks(Model model) {
        List<MyBookList> list = myBookListService.getMyBookList();
        model.addAttribute("myBookList", list);
        return "myBooks";
    }

    @RequestMapping("/mylist/{id}")
    public String addToMyBooks(@PathVariable("id") long id) {
        Books book = bookService.getBookById(id);
        MyBookList myBookList = new MyBookList(book.getTitle(), book.getAuthor(), book.getPrice());
        myBookListService.saveMyBookList(myBookList);
        return "redirect:/my_books";
    }


    @RequestMapping("/editBook/{id}")
    public String editSelectedBook(@PathVariable("id") long id, Model model){
        Books books=bookService.getBookById(id);
        model.addAttribute("book", books);
        return "BookEdit";
    }
@RequestMapping("/deleteBook/{id}")
    public String deleteSelectedBook(@PathVariable("id") long id) {

        bookService.deleteBookById(id);
        return "redirect:/Available_books";
}

}


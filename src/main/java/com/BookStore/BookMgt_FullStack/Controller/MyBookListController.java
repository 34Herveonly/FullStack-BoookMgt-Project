package com.BookStore.BookMgt_FullStack.Controller;


import com.BookStore.BookMgt_FullStack.Service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyBookListController {

    @Autowired
private MyBookListService myBookListService;

@RequestMapping("/deleteMyList/{id}")
    public String deleteMyBook(@PathVariable("id") long id) {

    myBookListService.deleteMyBookListById(id);
    return "redirect:/my_books";

    }
}

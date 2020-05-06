package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName
 * @Description
 * @Author WangHaiQiang
 * @Date Created in 15:53 2020/5/6
 **/
@Controller
public class BookController {


    @Autowired
    private BookService bookService;

    @RequestMapping("/rollback")
    public Book rollback(Book book) {
        return bookService.saveWithRollBack(book);
    }


    @RequestMapping("/noRollback")
    public Book noRollback(Book book) {
        return bookService.saveWithOutRollBack(book);
    }


}

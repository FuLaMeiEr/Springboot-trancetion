package com.example.demo;

/**
 * @ClassName
 * @Description
 * @Author WangHaiQiang
 * @Date Created in 15:44 2020/5/6
 **/
public interface BookService {
    public Book saveWithRollBack(Book book);

    public Book saveWithOutRollBack(Book book);
}

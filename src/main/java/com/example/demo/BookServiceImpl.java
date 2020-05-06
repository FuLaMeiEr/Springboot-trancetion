package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName
 * @Description
 * @Author WangHaiQiang
 * @Date Created in 15:46 2020/5/6
 **/
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;


    @Transactional(rollbackFor = {IllegalArgumentException.class})
    @Override
    public Book saveWithRollBack(Book book) {
        Book book1 = bookMapper.save(book);
        if (book.getName().equals("哈利波特")) {
            throw new IllegalArgumentException("哈利波特 已存在，数据将回滚");
        }
        return book1;
    }

    @Transactional(noRollbackFor = {IllegalArgumentException.class})
    @Override
    public Book saveWithOutRollBack(Book book) {
        Book book1 = bookMapper.save(book);
        if (book.getName().equals("哈利波特")) {
            throw new IllegalArgumentException("哈利波特 已存在，数据将回滚");
        }
        return book1;
    }
}

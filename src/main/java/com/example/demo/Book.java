package com.example.demo;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

/**
 * @ClassName
 * @Description
 * @Author WangHaiQiang
 * @Date Created in 15:39 2020/5/6
 **/
@Entity
@Table
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "姓名不能为空")
    @Column(length = 50)
    private String name;

    @NotEmpty(message = "writer不能为空")
    private String writer;

    @NotEmpty(message = "introduction不能为空")
    private String introduction;


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", writer='" + writer + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}

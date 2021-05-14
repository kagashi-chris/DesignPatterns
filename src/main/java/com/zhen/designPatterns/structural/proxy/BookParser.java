package com.zhen.designPatterns.structural.proxy;

import java.awt.print.Book;

public class BookParser implements IBookParser{

    private String book;

    public BookParser(String book) {
        //expensive parsing
        this.book = book;
    }
    public int getNumPages()
    {
        return 100;
    }
}
